package br.com.jTrigonometry;

/**
 * Jardel Garcia (2016) - jardelgarcia.ti@gmail.com
 *
 * Classe para testes das funcionalidades de cálculo trigonométrico.
 */
public class TesteMain {
	
	public static void main(String[] args) {
		CalculoFuncoesTrigonometricas calculadora = new CalculoFuncoesTrigonometricas();
		calculadora.calcularCatetoAdjacente(150D, 388D);
		calculadora.calcularCatetoOposto(120D, 270D);
		
		Double seno = calculadora.calcularSeno();
		Double coseno = calculadora.calcularCoseno();
		Double tangente = calculadora.calcularTangente();
		
		/*
		 * Para testes, escolheu-se procurar o ângulo pela sua tangente.
		 * Pode ser procurado tanto por seno, coseno, tangente ou cotangente.
		 */
		try {
			Angulo a = calculadora.encontrarAnguloNaTabela(TipoOperacaoTrigonometricaEnum.TANGENTE, tangente);
			calculadora.printAngulo(a);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}		
	}
}