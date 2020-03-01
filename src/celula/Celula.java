package celula;

public abstract class Celula  {

private double mmMembrana;
private double densidadCitoplasma;
private double peso;
private double tamanyo;

	public Celula() {
		
	}

	public Celula(Double mmMembrana, Double densidadCitoplasma, Double peso, Double tamanyo) {
	    this.mmMembrana = mmMembrana;
	    this.densidadCitoplasma = densidadCitoplasma;
	    this.peso = peso;
	    this.tamanyo = tamanyo;
	}

    public Double getMmMembrana() {
        return mmMembrana;
    }

    public void setMmMembrana(Double mmMembrana) {
        this.mmMembrana = mmMembrana;
    }

    public Double getDensidadCitoplasma() {
        return densidadCitoplasma;
    }

    public void setDensidadCitoplasma(Double densidadCitoplasma) {
        this.densidadCitoplasma = densidadCitoplasma;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(Double tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String toString() {
        return null;
    }


    
}