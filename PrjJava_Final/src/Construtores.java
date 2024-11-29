import java.util.ArrayList;
import java.util.Scanner;

public class Construtores {
	// Gerando os construtores
	// -----------------------------------------------------------------
	// Construtor :: Menu
	public int menu() {
		@SuppressWarnings("resource")
		Scanner menuSelect = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("Escolha uma das opcoes abaixo:\n [1]. Cadastrar Curso;"
				+ "\n [2]. Cadastrar Disciplina; \n [3]. Cadastrar Semestre;"
				+ "\n [4]. Vincular Disciplina/Semestre; \n [5]. Consultar Cursos"
				+ "\n [6]. Consultar Disciplinas; \n [7]. Consultar Disciplinas por Semestre;"
				+ "\n [8]. Consultar Total de Carga Horaria por semestre: CHATS ou CHTS;"
				+ "\n [9]. Consultar Total de Carga Horaria Teorica ou Pratica: CHATS ou CHTS; ");
		int escolha = menuSelect.nextInt();
		return escolha;
	}

	// -----------------------------------------------------------------
	// Construtor :: Curso
	public static void RegistrarCurso() {
		Scanner RegCSelect = new Scanner(System.in);
		Curso a = new Curso();
		System.out.println("Informe a descricao do curso: ");
		a.setDescricao(RegCSelect.nextLine());
		CursoDAO dao = new CursoDAO();
		dao.insertCurso(a);
		RegCSelect.close();
	}

	public static void AlterarCurso() {
		Scanner Curso = new Scanner(System.in);
		Curso a = new Curso();
		System.out.println("Informe o ID do curso que ser� alterado: ");
		a.setId(Curso.nextInt());
		System.out.println("Informe a nova descricao do curso: ");
		a.setDescricao(Curso.next());
		CursoDAO dao = new CursoDAO();
		dao.updateCurso(a);
		Curso.close();
	}

	public static void excluiCurso() {
		Scanner Curso = new Scanner(System.in);
		Curso a = new Curso();
		System.out.println("Informe o ID da descricao a ser excluida: ");
		a.setId(Curso.nextInt());
		CursoDAO dao = new CursoDAO();
		dao.deleteCurso(a);
		Curso.close();
	}

	// -----------------------------------------------------------------
	// Construtor :: Disciplina
	public static void RegistrarDisciplina() {
		Scanner RegDisSelect = new Scanner(System.in);
		Disciplina a = new Disciplina();
		System.out.println("Informe o codigo da disciplina: ");
		a.setCodigo(RegDisSelect.nextLine());
		System.out.println("Informe o nome da Disciplina: ");
		a.setNome(RegDisSelect.nextLine());
		System.out.println("Informe o nucleo da Disciplina: ");
		a.setNucleo(RegDisSelect.nextLine());
		System.out.println("Informe o CHATS: 'Pratica'\nAbaixo: ");
		a.setChats_pratica(RegDisSelect.nextInt());
		System.out.println("Informe o CHATS: 'Teorica'\nAbaixo: ");
		a.setChats_teorica(RegDisSelect.nextInt());
		System.out.println("Informe o CHATS: 'Distancia\nAbaixo: ");
		a.setChats_distancia(RegDisSelect.nextInt());
		System.out.println("Informe o CHTS: 'Pratica'\nAbaixo: ");
		a.setChts_pratica(RegDisSelect.nextFloat());
		System.out.println("Informe o CHTS: 'Teorica'\nAbaixo: ");
		a.setChts_teorica(RegDisSelect.nextFloat());
		System.out.println("Informe o CHTS: 'Distancia'\nAbaixo: ");
		a.setChts_distancia(RegDisSelect.nextFloat());
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.insertDisciplina(a);
		RegDisSelect.close();
	}

	public static void AlterarDisciplina() {
		Scanner Disciplina = new Scanner(System.in);
		Disciplina a = new Disciplina();
		System.out.println("Informe o ID da disciplina que ser� alterada:  ");
		a.setId(Disciplina.nextInt());
		System.out.println("Informe o codigo da disciplina: ");
		a.setCodigo(Disciplina.nextLine());
		System.out.println("Informe o nome da Disciplina: ");
		a.setNome(Disciplina.nextLine());
		System.out.println("Informe o nucleo da Disciplina: ");
		a.setNucleo(Disciplina.nextLine());
		System.out.println("Informe o CHATS: 'Pratica'\nAbaixo: ");
		a.setChats_pratica(Disciplina.nextInt());
		System.out.println("Informe o CHATS: 'Teorica'\nAbaixo: ");
		a.setChats_teorica(Disciplina.nextInt());
		System.out.println("Informe o CHATS: 'Distancia\nAbaixo: ");
		a.setChats_distancia(Disciplina.nextInt());
		System.out.println("Informe o CHTS: 'Pratica'\nAbaixo: ");
		a.setChts_pratica(Disciplina.nextFloat());
		System.out.println("Informe o CHTS: 'Teorica'\nAbaixo: ");
		a.setChts_teorica(Disciplina.nextFloat());
		System.out.println("Informe o CHTS: 'Distancia'\nAbaixo: ");
		a.setChts_distancia(Disciplina.nextFloat());
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.insertDisciplina(a);
		Disciplina.close();
	}

	public static void ExcluirDisciplina() {
		Scanner Disciplina = new Scanner(System.in);
		Disciplina a = new Disciplina();
		System.out.println("Informe o ID que deseja-se excluir: ");
		a.setId(Disciplina.nextInt());
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.deleteDisciplina(a);
		Disciplina.close();
	}

	// -----------------------------------------------------------------
	// Construtores :: Semestre
	public static void RegistrarSemestre() {
		Scanner RegSemSelect = new Scanner(System.in);
		Semestre a = new Semestre();
		System.out.println("Informe o numero do semestre: ");
		a.setNumero(RegSemSelect.nextInt());
		System.out.println("Informe a descricao do semestre: ");
		a.setDescricao(RegSemSelect.next());
		SemestreDAO dao = new SemestreDAO();
		dao.insertSemestre(a);
		RegSemSelect.close();
	}

	public static void AlterarSemestre() {
		Scanner Semestre = new Scanner(System.in);
		Semestre a = new Semestre();
		System.out.println("Informe o ID do semestre: ");
		a.setId(Semestre.nextInt());
		System.out.println("Informe o numero do semestre: ");
		a.setNumero(Semestre.nextInt());
		System.out.println("Informe a descricao do semestre: ");
		SemestreDAO dao = new SemestreDAO();
		dao.updateSemestre(a);
		Semestre.close();
	}

	public static void ExcluirSemestre() {
		Scanner Semestre = new Scanner(System.in);
		Semestre a = new Semestre();
		System.out.println("Informe o ID do semestre: ");
		a.setId(Semestre.nextInt());
		SemestreDAO dao = new SemestreDAO();
		dao.updateSemestre(a);
		Semestre.close();
	}

	// -----------------------------------------------------------------
	// Construtores :: Vinculo
	public static void VinculaDisSem() {
		Scanner RegVincSemSelect = new Scanner(System.in);
		Vinculo a = new Vinculo();
		System.out.println("Informe o ID Curso para vincular: ");
		a.setIdCurso(RegVincSemSelect.nextInt());
		System.out.println("Informe o ID Semestre para vincular: ");
		a.setIdSemestre(RegVincSemSelect.nextInt());
		System.out.println("Informe o ID Disciplina para vincular: ");
		a.setIdDisciplina(RegVincSemSelect.nextInt());
		VinculoDAO dao = new VinculoDAO();
		dao.insertVinculo(a);
		RegVincSemSelect.close();
	}

	public static void AlterarVinculo() {
		Scanner Vinc = new Scanner(System.in);
		Vinculo a = new Vinculo();
		System.out.println("Informe o ID do vinculo para se alterar: ");
		a.setId(Vinc.nextInt());
		System.out.println("Informe o ID Curso para vincular: ");
		a.setIdCurso(Vinc.nextInt());
		System.out.println("Informe o  ID semestre para vincular: ");
		a.setIdSemestre(Vinc.nextInt());
		System.out.println("Informe o ID Disciplina para vincular: ");
		a.setIdDisciplina(Vinc.nextInt());
		VinculoDAO dao = new VinculoDAO();
		dao.updateVinculo(a);
		Vinc.close();
	}

	public static void ExcluirVinculo() {
		Scanner Vinc = new Scanner(System.in);
		Vinculo a = new Vinculo();
		System.out.println("Informe o ID do vinculo para excluir: ");
		a.setId(Vinc.nextInt());
		VinculoDAO dao = new VinculoDAO();
		dao.deleteVinculo(a);
		Vinc.close();
	}

	// -----------------------------------------------------------------
	// Construtor :: Consultas :: Curso
	public static void ConsultaCurso() {
		Curso a = new Curso();
		ConsultaDAO dao = new ConsultaDAO();
		ArrayList<Curso> cursos = dao.consultaCurso(a);
		for (Curso c : cursos) {
			System.out.println(c);
		}
	}

	// Construtor :: Consultas :: Disciplina
	public static void ConsultaDisciplina() {
		Disciplina a = new Disciplina();
		ConsultaDAO dao = new ConsultaDAO();
		ArrayList<Disciplina> disciplinas = dao.consultaDisciplina(a);
		for (Disciplina d : disciplinas) {
			System.out.println(d);
		}
	}

	// Construtor :: Consultas :: Disciplina por semestre
	public static void ConsultaDisciplinaSemestre() {
		ConsultaDAO dao = new ConsultaDAO();
		ArrayList<String> disciplinas = dao.consultaDisciplinaSemestre();
		for (String d : disciplinas) {
			System.out.println(d);
		}
	}
	
	public static void consultaTotalCporSemestreChats() {
		ConsultaDAO dao = new ConsultaDAO();
		ArrayList<String> disciplinas = dao.consultaTotalCporSemestreChats();
		for (String d : disciplinas) {
			System.out.println("A CARGA HORARIA TOTAL:");
			System.out.println(d);
		}
	}
	public static void consultaTotalCporSemestreChts() {
		ConsultaDAO dao = new ConsultaDAO();
		ArrayList<String> disciplinas = dao.consultaTotalCporSemestreChts();
		for (String d : disciplinas) {
			System.out.println("A CARGA HORARIA TOTAL:");
			System.out.println(d);
		}
	}
	
}
