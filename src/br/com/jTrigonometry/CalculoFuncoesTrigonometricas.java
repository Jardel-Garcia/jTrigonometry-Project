package br.com.jTrigonometry;

/**
 * Jardel Garcia (2016) - jardelgarcia.ti@gmail.com
 * 
 * Esta classe é responsável por centralizar os cálculos trigonométricos.
 * Recebe entradas para calcular o valor dos lados do triângulo (cateto oposto, adjacente e hipotenusa).
 * Encontra ângulos na tabela trigonométrica de acordo com alguma propriedade informada 
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
	 * Valida as entradas fornecidas pelo usuário, que são a base para calcular 
	 * os lados do triângulo.
	 * @param pontoInicial
	 * @param pontoFinal
	 * @return
	 */
	public boolean validarValoresLadosTriangulo(Double pontoInicial, Double pontoFinal){
		if (pontoInicial == null) {
			System.out.println("Valor nulo informado para cálculo (pontoInicial)");
			return false;
		}
		if (pontoFinal == null) {
			System.out.println("Valor nulo informado para cálculo (pontoFinal)");
			return false;
		}
		if(pontoInicial >= pontoFinal){
			System.out.println("Valor do ponto final superior ao ponto inicial (resultado será negativo).");
			return false;
		}
		return true;
	}
	
	/**
	 * Recebe os pontos final e inicial da reta que compõe o cateto oposto
	 * ao ângulo procurado e retorna o valor calculado desse lado do triângulo.
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
			throw new NullPointerException("Valores inválidos para cálculo da hipotenusa.");
		}
	}
	
	public Double calcularSeno(){
		calcularHipotenusa();
		if(catetoOposto != null){
			return catetoOposto/hipotenusa;
		}else{
			throw new NullPointerException("O valor do cateto oposto é nulo.");
		}
	}
	
	public Double calcularCoseno(){		
		calcularHipotenusa();
		if(catetoAdjacente != null){
			return catetoAdjacente/hipotenusa;
		}else{
			throw new NullPointerException("O valor do adjacente oposto é nulo.");
		}
	}
	
	public Double calcularTangente(){
		if(catetoOposto != null && catetoAdjacente != null){
			return catetoOposto/catetoAdjacente;
		}else{
			throw new NullPointerException("Valores inválidos para cálculo da tangente.");
		}
	}
	
	public Double calcularCotangente(){
		return null;
	}

	/**
	 * Encontra o valor final de um ângulo com base em alguma de suas propriedades
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
		 * Chamada dinâmica ao método necessário. O método a ser invocado 
		 * é escolhido em tempo de execução por Reflection.
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
		 * O ângulo é encontrado através de uma das suas propriedades (seno, coseno, tangente..).
		 * Esse ângulo é encontrado por aproximação, pois raramente o valor passado como parâmetro
		 *  será exatamente igual (casas decimais) ao valor da tabela.
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
				System.out.println("Erro na chamada dinâmica ao método " + getOperacaoEscolhida.getName());
				e.printStackTrace();
			}
		}
		return resultado;
	}
	
	/**
	 * Exibe todas as informações disponíveis do ângulo.
	 * @param angulo
	 */
	public void printAngulo(Angulo angulo){
		try {
			System.out.println(">> Informações do ângulo: ");
			System.out.println("- Ângulo: " + angulo.getGraus() + "°");
			System.out.println("- Lados do triângulo: ");
			System.out.println(catetoOposto != null ? "-- Cateto oposto: " + catetoOposto : "");
			System.out.println(catetoAdjacente != null ? "-- Cateto adjacente: " + catetoAdjacente : "");
			System.out.println(hipotenusa != null ? "-- Hipotenusa: " + hipotenusa : "");
			System.out.println("- Seno: " + angulo.getSeno());
			System.out.println("- Coseno: " + angulo.getCoseno());
			System.out.println("- Tangente: " + angulo.getTangente());
			System.out.println("- Cotangente: " + angulo.getCotangente());
		} catch (NullPointerException e) {
			System.out.println("Nenhuma informação! Valores inválidos para cálculo.");
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