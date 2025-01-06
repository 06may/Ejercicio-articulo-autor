
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel", "García Márquez", "Colombiana");
        Autor autor2 = new Autor("Isabel", "Allende", "Chilena");
        Autor autor3 =  new Autor("Nicholas", "Sparks", "estadunidense");

        Articulo articulo1 = new Articulo(
                "Cien años de soledad",
                new Date(),
                "Un artículo sobre el realismo mágico y su impacto en la literatura",
                autor1
        );
        Articulo articulo2 = new Articulo(
                "El amor en los tiempos del cólera",
                new Date(),
                "Un análisis sobre el amor y la enfermedad en la obra de García Márquez",
                autor1
        );
        Articulo articulo3 = new Articulo(
                "La casa de los espíritus",
                new Date(),
                "Un análisis sobre los temas de la familia y la política en la obra de Isabel Allende",
                autor2
        );
        Articulo articulo4 = new Articulo(
                "Paula",
                new Date(),
                "Reflexión personal de Isabel Allende sobre la muerte de su hija Paula",
                autor2

        );
        Articulo articulo5 = new Articulo(
                "El cuaderno de Noha",
                new Date(),
                "un joven que se enamora de una chica adinerada ",
                autor3
        );
        Articulo articulo6 = new Articulo(
                "Un paseo para recordar",
                new Date(),
                "Un estudiante que se enamora de una chica con cancer terminal ",
                autor3
        );
        List<Autor> autores = List.of(autor1, autor2,autor3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un autor:");
        for (int i = 0; i < autores.size(); i++) {
            Autor autor = autores.get(i);
            System.out.println((i + 1) + ". " + autor.getNombre() + " " + autor.getApellido());
        }
        int seleccion = scanner.nextInt();
        if (seleccion < 1 || seleccion > autores.size()) {
            System.out.println("Selección inválida.");
        } else {
            Autor autorSeleccionado = autores.get(seleccion - 1);
            System.out.println("\nArtículos escritos por " + autorSeleccionado.getNombre() + ":");
            autorSeleccionado.mostrarInfo();
        }
        scanner.close();
    }
}
