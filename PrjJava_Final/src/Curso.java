
public class Curso {

	// Variaveis
	private int id;
	private String descricao;

	// -----------------------------------------------------------------
	public Curso() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return "[" + id + "] - " + descricao;
	}
	
}
