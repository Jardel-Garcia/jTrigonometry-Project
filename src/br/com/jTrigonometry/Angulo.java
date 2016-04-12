package br.com.jTrigonometry;

/**
 * Jardel Garcia (2016) - jardelgarcia.ti@gmail.com
 *
 * Trata-se de um POJO, classe base que determina as propriedades de um ângulo.
 */
public class Angulo {

	private Double graus;
	private Double seno;
	private Double coseno;
	private Double tangente;
	private Double cotangente;

	public Double getGraus() {
		return graus;
	}

	public void setGraus(Double graus) {
		this.graus = graus;
	}

	public Double getSeno() {
		return seno;
	}

	public void setSeno(Double seno) {
		this.seno = seno;
	}

	public Double getCoseno() {
		return coseno;
	}

	public void setCoseno(Double coseno) {
		this.coseno = coseno;
	}

	public Double getTangente() {
		return tangente;
	}

	public void setTangente(Double tangente) {
		this.tangente = tangente;
	}

	public Double getCotangente() {
		return cotangente;
	}

	public void setCotangente(Double cotangente) {
		this.cotangente = cotangente;
	}
}