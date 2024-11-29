
public class Disciplina {

	// Variaveis
	private int id;
	private String codigo;
	private String nome;
	private String nucleo;
	private int chats_pratica;
	private int chats_teorica;
	private int chats_distancia;
	private float chts_pratica;
	private float chts_teorica;
	private float chts_distancia;

	// -----------------------------------------------------------------
	public Disciplina() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNucleo() {
		return nucleo;
	}

	public void setNucleo(String nucleo) {
		this.nucleo = nucleo;
	}

	public int getChats_pratica() {
		return chats_pratica;
	}

	public void setChats_pratica(int chats_pratica) {
		this.chats_pratica = chats_pratica;
	}

	public int getChats_teorica() {
		return chats_teorica;
	}

	public void setChats_teorica(int chats_teorica) {
		this.chats_teorica = chats_teorica;
	}

	public int getChats_distancia() {
		return chats_distancia;
	}

	public void setChats_distancia(int chats_distancia) {
		this.chats_distancia = chats_distancia;
	}

	public float getChts_pratica() {
		return chts_pratica;
	}

	public void setChts_pratica(float chts_pratica) {
		this.chts_pratica = chts_pratica;
	}

	public float getChts_teorica() {
		return chts_teorica;
	}

	public void setChts_teorica(float chts_teorica) {
		this.chts_teorica = chts_teorica;
	}

	public float getChts_distancia() {
		return chts_distancia;
	}

	public void setChts_distancia(float chts_distancia) {
		this.chts_distancia = chts_distancia;
	}
	public String toString() {
		return 
				"|ID  |  2-Codigo  |  3-Nome  |  4-Nucleo  |  5-Chats_p  |  6-Chats_t"
				+ "  |  7-Chats_d  |  8-Chts_p  |  9-Chts_t  |  10-Chts_d\n\n" + "[" + id + "]  |   " + codigo + "     | " 
				+ nome + " | " + nucleo + " | " + chats_pratica + " | "
				+ chats_teorica + " | " + chats_distancia + " | "
				+ chts_pratica + " | " + chts_teorica + " | "
				+ chts_distancia + " | ";
	}

}
