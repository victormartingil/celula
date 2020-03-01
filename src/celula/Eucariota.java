package celula;

public class Eucariota extends Celula{
	
    private Double tamanyoNucleo;
    
    private int numeroOrganulos;
    
    public Eucariota() {
    	
    }
    
    public Eucariota(Double tamanyoNucleo, int numeroOrganulos, Double mmMembrana, Double densidadCitoplasma, Double peso, Double tamanyo) {
        super(mmMembrana, densidadCitoplasma, peso, tamanyo);
        this.tamanyoNucleo = tamanyoNucleo;
        this.numeroOrganulos = numeroOrganulos;
    }

    public Double getTamanyoNucleo() {
        return tamanyoNucleo;
    }

    public void setTamanyoNucleo(Double tamanyoNucleo) {
        this.tamanyoNucleo = tamanyoNucleo;
    }

    public int getNumeroOrganulos() {
        return numeroOrganulos;
    }

    public void setNumeroOrganulos(int numeroOrganulos) {
        this.numeroOrganulos = numeroOrganulos;
    }

    @Override
    public String toString() {
        return "\n-------------------------" + 
        	   "\nEucariota:" + 
        	   "\nMm membrana: " + this.getMmMembrana() + 
        	   "\nDensidad del Citoplasta: " + this.getDensidadCitoplasma() + 
        	   "\nPeso: " + this.getPeso() + 
        	   "\nTamaño: " + this.getTamanyo() +
        	   "\nTamaño del Nucleo: " + this.getTamanyoNucleo() + 
        	   "\nNumero de Organulos: " + this.getNumeroOrganulos()+"\n";
    }
    
    
}