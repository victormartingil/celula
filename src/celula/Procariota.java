package celula;

public class Procariota extends Celula{
    
	private int numeroCapasParedCelular;

	public Procariota() {
		super();
	}
	
	public Procariota(int numeroCapasParedCelular, double mmMembrana, double densidadCitoplasma, double peso, double tamanyo) {
        super(mmMembrana, densidadCitoplasma, peso, tamanyo);
        this.numeroCapasParedCelular = numeroCapasParedCelular;
    }
	
	public int getNumeroCapasParedCelular() {
        return numeroCapasParedCelular;
    }

    public void setNumeroCapasParedCelular(int numeroCapasParedCelular) {
        this.numeroCapasParedCelular = numeroCapasParedCelular;
    }

    @Override
    public String toString() {
        return "\n-------------------------" + 
        	   "\nProcariota:" + 
        	   "\nMm membrana: " + this.getMmMembrana() + 
        	   "\nDensidad del Citoplasta: " + this.getDensidadCitoplasma() + 
        	   "\nPeso: " + this.getPeso() + 
        	   "\nTamaño: " + this.getTamanyo() +
        	   "\nNúmero de capas: " + this.getNumeroCapasParedCelular()+"\n";
    }
    
    
}