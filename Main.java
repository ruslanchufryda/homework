import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		String user = null;
		String user2 = null;
		String user3 = null;

		Scanner input = new Scanner(System.in);
		String command = "login";
		while(true) {

			switch (command) {
				case "login":
					System.out.println("База данних клієнтів БК Левада");
					String userName = input.nextLine();

					if (userName.equalsIgnoreCase("Вхід") ) {
						user = userName;
						user2 = userName;
						user3 = userName;
					} else {
						System.out.println("ВВедіть слово ВХІД=) для роботи з базою клієнтів");
						command = "login";
					}
					command = "";
					break;
				case "Іванов":
					if (user != null) {
					System.out.println("моб.09787461234, 12 підїзд, 5 поверх, 62,3м2");}
					command = "";
					break;
				case "Петров":
					if (user2 != null){
					System.out.println("моб.0958264739, 9 підїзд, 7 поверх, 89 м2");}
					command = "";
					break;
				case "Сливка":
					if (user3 != null) {
						System.out.println("моб.0952345412, 2 підїзд, 3 поверх, 41 м2");
					command = "";
					break;
					}


				case "Дякую":
					System.out.println("Хай щастить");
					System.exit(1);
				default:
					if (user != null) {
						System.out.println("Ведіть прізвище клієнта");
						command = input.nextLine();
					} else {
						System.out.println("=))");
						command = "login";
					}

			}

		}
	}
}