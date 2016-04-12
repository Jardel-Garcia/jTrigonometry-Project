package br.com.jTrigonometry;

/**
 * Jardel Garcia (2016) - jardelgarcia.ti@gmail.com
 * 
 * Esta classe � respons�vel por centralizar os c�lculos trigonom�tricos.
 * Recebe entradas para calcular o valor dos lados do tri�ngulo (cateto oposto, adjacente e hipotenusa).
 * Encontra �ngulos na tabela trigonom�trica de acordo com alguma propriedade informada 
 * (seno, coseno, tangente...).
 * 
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculoFuncoesTrigonometricas {

	private Double hipotenusa;
	private Double catetoOposto;
	private Double catetoAdjacente;

	/**
	 * Valida as entradas fornecidas pelo usu�rio, que s�o a base para calcular 
	 * os lados do tri�ngulo.
	 * @param pontoInicial
	 * @param pontoFinal
	 * @return
	 */
	public boolean validarValoresLadosTriangulo(Double pontoInicial, Double pontoFinal){
		if (pontoInicial == null) {
			System.out.println("Valor nulo informado para c�lculo (pontoInicial)");
			return false;
		}
		if (pontoFinal == null) {
			System.out.println("Valor nulo informado para c�lculo (pontoFinal)");
			return false;
		}
		if(pontoInicial >= pontoFinal){
			System.out.println("Valor do ponto final superior ao ponto inicial (resultado ser� negativo).");
			return false;
		}
		return true;
	}
	
	/**
	 * Recebe os pontos final e inicial da reta que comp�e o cateto oposto
	 * ao �ngulo procurado e retorna o valor calculado desse lado do tri�ngulo.
	 * @param pontoInicial
	 * @param pontoFinal
	 * @return
	 */
	public Double calcularCatetoOposto(Double pontoInicial, Double pontoFinal) {
		if(validarValoresLadosTriangulo(pontoInicial, pontoFinal)){
			catetoOposto = pontoFinal - pontoInicial;
			return catetoOposto;
		}
		return null;
	}

	public Double calcularCatetoAdjacente(Double pontoInicial, Double pontoFinal) {
		if(validarValoresLadosTriangulo(pontoInicial, pontoFinal)){
			catetoAdjacente = pontoFinal - pontoInicial;
			return catetoAdjacente;
		}
		return null;
	}

	public void calcularHipotenusa() {
		if (catetoOposto != null && catetoAdjacente != null) {
			hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2)
					+ Math.pow(catetoAdjacente, 2));
		}else{
			throw new NullPointerException("Valores inv�lidos para c�lculo da hipotenusa.");
		}
	}
	
	public Double calcularSeno(){
		calcularHipotenusa();
		if(catetoOposto != null){
			return catetoOposto/hipotenusa;
		}else{
			throw new NullPointerException("O valor do cateto oposto � nulo.");
		}
	}
	
	public Double calcularCoseno(){		
		calcularHipotenusa();
		if(catetoAdjacente != null){
			return catetoAdjacente/hipotenusa;
		}else{
			throw new NullPointerException("O valor do adjacente oposto � nulo.");
		}
	}
	
	public Double calcularTangente(){
		if(catetoOposto != null && catetoAdjacente != null){
			return catetoOposto/catetoAdjacente;
		}else{
			throw new NullPointerException("Valores inv�lidos para c�lculo da tangente.");
		}
	}
	
	public Double calcularCotangente(){
		return null;
	}

	/**
	 * Encontra o valor final de um �ngulo com base em alguma de suas propriedades
	 * (seno, coseno, tangente...).
	 * @param tipoOperacao
	 * @param valorFuncaoProcurado
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	public Angulo encontrarAnguloNaTabela(
			TipoOperacaoTrigonometricaEnum tipoOperacao, Double valorFuncaoProcurado)
			throws NoSuchMethodException, SecurityException {
		
		TabelaTrigonometrica tabelaTrigonometrica = TabelaTrigonometrica.getInstance();
		
		/* 
		 * Chamada din�mica ao m�todo necess�rio. O m�todo a ser invocado 
		 * � escolhido em tempo de execu��o por Reflection.
		 */ 
		Method getOperacaoEscolhida = null;
		if (tipoOperacao == TipoOperacaoTrigonometricaEnum.SENO) {
			getOperacaoEscolhida = Angulo.class.getDeclaredMethod("getSeno");
		} else if (tipoOperacao == TipoOperacaoTrigonometricaEnum.COSENO) {
			getOperacaoEscolhida = Angulo.class.getDeclaredMethod("getCoseno");
		} else if (tipoOperacao == TipoOperacaoTrigonometricaEnum.TANGENTE) {
			getOperacaoEscolhida = Angulo.class
					.getDeclaredMethod("getTangente");
		} else if (tipoOperacao == TipoOperacaoTrigonometricaEnum.COTANGENTE) {
			getOperacaoEscolhida = Angulo.class
					.getDeclaredMethod("getCotangente");
		}

		Angulo resultado = null;
		Double menorDiferenca = 9999.99;
		
		/*
		 * O �ngulo � encontrado atrav�s de uma das suas propriedades (seno, coseno, tangente..).
		 * Esse �ngulo � encontrado por aproxima��o, pois raramente o valor passado como par�metro
		 *  ser� exatamente igual (casas decimais) ao valor da tabela.
		 */
		for (Angulo ang : tabelaTrigonometrica.getAngulos()) {
			try {
				Double diferenca = 0D;
				Double valorFuncaoEncontrado = (Double) getOperacaoEscolhida.invoke(ang);
				
				if(valorFuncaoEncontrado < valorFuncaoProcurado){
					diferenca = valorFuncaoProcurado - valorFuncaoEncontrado;
				}else{
					diferenca = valorFuncaoEncontrado - valorFuncaoProcurado;
				}
				if(diferenca < menorDiferenca){
					menorDiferenca = diferenca;
					resultado = ang;
				}
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				System.out.println("Erro na chamada din�mica ao m�todo " + getOperacaoEscolhida.getName());
				e.printStackTrace();
			}
		}
		return resultado;
	}
	
	/**
	 * Exibe todas as informa��es dispon�veis do �ngulo.
	 * @param angulo
	 */
	public void printAngulo(Angulo angulo){
		try {
			System.out.println(">> Informa��es do �ngulo: ");
			System.out.println("- �ngulo: " + angulo.getGraus() + "�");
			System.out.println("- Lados do tri�ngulo: ");
			System.out.println(catetoOposto != null ? "-- Cateto oposto: " + catetoOposto : "");
			System.out.println(catetoAdjacente != null ? "-- Cateto adjacente: " + catetoAdjacente : "");
			System.out.println(hipotenusa != null ? "-- Hipotenusa: " + hipotenusa : "");
			System.out.println("- Seno: " + angulo.getSeno());
			System.out.println("- Coseno: " + angulo.getCoseno());
			System.out.println("- Tangente: " + angulo.getTangente());
			System.out.println("- Cotangente: " + angulo.getCotangente());
		} catch (NullPointerException e) {
			System.out.println("Nenhuma informa��o! Valores inv�lidos para c�lculo.");
		}
	}

	public Double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(Double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	public Double getCatetoOposto() {
		return catetoOposto;
	}

	public void setCatetoOposto(Double catetoOposto) {
		this.catetoOposto = catetoOposto;
	}

	public Double getCatetoAdjacente() {
		return catetoAdjacente;
	}

	public void setCatetoAdjacente(Double catetoAdjacente) {
		this.catetoAdjacente = catetoAdjacente;
	}
}