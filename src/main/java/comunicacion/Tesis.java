package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public String getIdea() {
		return idea;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public void setidea(String idea) {
		this.idea = idea;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public int palabrasTotales(int x) {
		return getPaginas()*5*x;
	}
	public String toString () {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + idea + "\n" + argumentos.length + "\n" + conclusion + "\n" + referencias;
	}
	
}