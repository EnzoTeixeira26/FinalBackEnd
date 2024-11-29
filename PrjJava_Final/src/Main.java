public class Main extends Menu {

	public static void main(String[] args) {

		Menu esc = new Menu();

		boolean val = false;

		while (val == false) {
			int opc = esc.menu();
			val = esc.escolher(opc);
		}
	}
}