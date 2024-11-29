import java.util.Scanner;

class Menu extends Construtores {
	@SuppressWarnings("resource")
	public boolean escolher(int escolha) {
		Scanner teclado = new Scanner(System.in);
		int menuEsc = 0;
		int menuConsulta = 0;

		switch (escolha) {
		case 1:
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'CADASTRAR CURSO'");
			System.out.println("-------------------------------------------");
			System.out.println(" [1]. REGISTRO DE CURSO\n [2]. ALTERAR DESCRICAO DE CURSO\n"
					+ " [3]. EXCLUIR DESCRICAO DE CURSO\n [4]. Voltar");
			menuEsc = teclado.nextInt();
			System.out.println("-------------------------------------------");
			switch (menuEsc) {
			// Caso 1 Cadastrando o curso
			case 1:
				System.out.println("Opcao selecionada: 'REGISTRO DE CURSO' ");
				RegistrarCurso();
				System.out.println("Registro efetuado com exito!!!");
				break;
			case 2:
				System.out.println("Opcao selecionada: 'CONTINUAR ALTERACAO DE DESCRICAO DE CURSO' ");
				AlterarCurso();
				System.out.println("Alteracao efetuada com exito!!!");
				break;
			case 3:
				System.out.println("Opcao selecionada: 'CONTINUAR EXCLUSAO DE DESCRICAO DE CURSO' ");
				excluiCurso();
				System.out.println("Exclusao efetuada com exito!!!");
				break;
			case 4:
				System.out.println("Opcao selecionada: 'VOLTAR'");
				return false;
			default:
				System.out.println("Numero invalido!");
				return false;
			}

			break;
		case 2:
			// Caso 2 Cadastrando a Disciplina
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'CADASTRAR DISCIPLINA'");
			System.out.println("-------------------------------------------");
			System.out.println(" [1]. REGISTRO DE DISCIPLINA\n [2]. ALTERAR A DISCIPLINA\n"
					+ " [3]. EXCLUIR DISCIPLINA\n [4]. Voltar");
			menuEsc = teclado.nextInt();
			System.out.println("-------------------------------------------");
			switch (menuEsc) {
			case 1:
				System.out.println("'Opcao selecionada: 'CONTINUAR O CADASTRO DA DISCIPLINA' ");
				RegistrarDisciplina();
				System.out.println("Registro efetuado com exito!!!");
				break;
			case 2:
				System.out.println("Opcao selecionada: 'CONTINUAR A ALTERACAO DA DISCIPLINA' ");
				AlterarDisciplina();
				System.out.println("Registro efetuado com exito!!!");
				break;
			case 3:
				System.out.println("Opcao selecionada: 'CONTINUAR A EXCLUSAO DE DISCIPLINA' ");
				ExcluirDisciplina();
				System.out.println("Exclusao efetuado com exito!!!");
				break;
			case 4:
				System.out.println("Opcao selecionada: 'VOLTAR'");
				return false;
			default:
				System.out.println("Numero invalido!");
				return false;
			}
			break;
		// ====================================================
		case 3:
			// Caso 3 Cadastrando o Semestre
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'CADASTRAR SEMESTRE'");
			System.out.println("-------------------------------------------");
			System.out.println(" [1]. REGISTRO DE SEMESTRE\n [2]. ALTERAR O SEMESTRE\n"
					+ " [3]. EXCLUIR DISCIPLINA\n [4]. Voltar");
			menuEsc = teclado.nextInt();
			System.out.println("-------------------------------------------");
			switch (menuEsc) {
			case 1:
				System.out.println("Opcao selecionada: 'CONTINUAR O REGISTRO DO SEMESTRE'");
				RegistrarSemestre();
				System.out.println("Registro efetuado com exito!!!");
				break;
			case 2:
				System.out.println("Opcao selecionada: 'CONTINUAR A ALTERACAO DO SEMESTRE' ");
				AlterarSemestre();
				System.out.println("Alteracao efetuado com exito!!!");
				break;
			case 3:
				System.out.println("Opcao selecionada: 'CONTINUAR A EXCLUSAO DO SEMESTRE' ");
				ExcluirSemestre();
				System.out.println("Exclusao efetuado com exito!!!");
				break;
			case 4:
				System.out.println("Opcao Selecionada: 'VOLTAR'");
				return false;
			}
			break;
		case 4:
			// Caso 4 Vinculando a Disciplina/Semestre
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'VINCULAR DISCIPLINA/SEMESTRE'");
			System.out.println("-------------------------------------------");
			System.out.println(" [1]. REGISTRO DE VINCULACAO\n [2]. ALTERAR A VINCULACAO\n"
					+ " [3]. EXCLUIR VINCULACAO \n [4]. Voltar");
			menuEsc = teclado.nextInt();
			System.out.println("-------------------------------------------");
			switch (menuEsc) {
			case 1:
				System.out.println("Opcao selecionada: 'CONTINUAR A VINCULACAO DISCIPLINA/SEMESTRE' ");
				VinculaDisSem();
				System.out.println("Registro efetuado com exito!!!");
				break;
			case 2:
				System.out.println("Opcao selecionada: 'CONTINUAR A ALTERACAO DA VINCULACAO/SEMESTRE' ");
				AlterarVinculo();
				System.out.println("Registro efetuado com exito!!!");
				break;
			case 3:
				System.out.println("Opcao Selecionada: 'CONTINUAR A EXCLUSAO DA VINCULACAO' ");
				ExcluirVinculo();
				break;
			case 4:
				System.out.println("Opcao Selecionada: 'VOLTAR'");
				return false;
			}
			break;
		case 5:
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'CONSULTAR CURSO'");
			System.out.println("===========================================\n");
			ConsultaCurso();
			break;
		case 6:
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'CONSULTAR DISCIPLINA'");
			System.out.println("===========================================\n");
			ConsultaDisciplina();
			break;
		case 7:
			System.out.println("-------------------------------------------");
			System.out.println("Opcao selecionada: 'CONSULTAR DISCIPLINA POR SEMESTRE'");
			System.out.println("===========================================\n");
			ConsultaDisciplinaSemestre();
			break;
		case 8:
			System.out.println("-------------------------------------------");
			System.out.println("'CONSULTA TOTAL DE CARGA HORARIA POR SEMESTRE: CHATS ou CHTS'");
			System.out.println("===========================================\n");
			System.out.println("Você deseja consultar a total carga horaria de:\n[1]. CHATS\n[2]. CHTS");
			menuConsulta = teclado.nextInt();
			switch(menuConsulta) {
			case 1:
				consultaTotalCporSemestreChats();
				break;
			case 2:
				consultaTotalCporSemestreChts();
				break;
			}
			break;
		case 9:
			System.out.println("-------------------------------------------");
			System.out.println("CONSULTA TOTAL DE CARGA HORARIA TEORICA OU PRATICA: CHATS ou CHTS");
			System.out.println("===========================================\n");
			menuConsulta = teclado.nextInt();
			switch(menuConsulta) {
			case 1:
				consultaTotalCporSemestreChats();
				break;
			case 2:
				consultaTotalCporSemestreChts();
				break;
			}
			break;
		default:
			System.out.println("NUMERO INVALIDO!");
			return false;
		}
		teclado.close();
		return true;
	}
}