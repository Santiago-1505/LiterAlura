import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1) Buscar libro por título");
            System.out.println("2) Buscar libro por autor");
            System.out.println("3) Listar todos los libros");
            System.out.println("4) Añadir un nuevo libro");
            System.out.println("5) Eliminar un libro");
            System.out.println("6) Salir");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.println("Ingrese el título del libro:");
                    String title = scanner.nextLine();
                    // Lógica para buscar libro por título
                    break;
                case 2:
                    System.out.println("Ingrese el autor del libro:");
                    String author = scanner.nextLine();
                    // Lógica para buscar libro por autor
                    break;
                case 3:
                    // Lógica para listar todos los libros
                    break;
                case 4:
                    System.out.println("Ingrese el título del nuevo libro:");
                    String newTitle = scanner.nextLine();
                    System.out.println("Ingrese el autor del nuevo libro:");
                    String newAuthor = scanner.nextLine();
                    // Lógica para añadir un nuevo libro
                    break;
                case 5:
                    System.out.println("Ingrese el ID del libro a eliminar:");
                    int id = scanner.nextInt();
                    // Lógica para eliminar un libro
                    break;
                case 6:
                    System.out.println("Gracias por usar LiterAlura.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija otra.");
            }
        }
    }
}
