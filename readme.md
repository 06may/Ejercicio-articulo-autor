### Ejercicio -ARTÍCULO-AUTOR 

 El objetivo de este ejercicio es crear dos clases en Java: **`Articulo`** y **`Autor`**, donde un artículo está asociado a un autor, y un autor puede escribir múltiples artículos. Además, el programa debe incluir un método que permita listar todos los artículos escritos por un autor determinado.

### Descripción del Ejercicio 

### **Clase `Articulo`** La clase `Articulo` representa un artículo escrito por un autor. Los atributos que debe tener la clase `Articulo` son los siguientes:

 - **Título**: El nombre o encabezado del artículo.

 - **Fecha**: La fecha en la que el artículo fue escrito o publicado.

 - **Contenido**: El texto o descripción breve del artículo.

 - **Autor**: El autor que ha escrito el artículo. Este atributo será de tipo `Autor` y deberá referenciar a una instancia de la clase `Autor`. 

#### Relación entre `Articulo` y `Autor`

 - Cada **artículo** estará ligado a un **autor**. Es decir, cada artículo tendrá una referencia a un objeto `Autor`. - Un **autor** puede escribir más de un **artículo**, por lo que el autor tendrá la capacidad de tener una lista de artículos que ha escrito.

### **Clase `Autor`** La clase `Autor` representa a un escritor o creador de artículos. Los atributos de esta clase son:
 
 - **Nombre**: El primer nombre del autor.
 - **Apellido**: El apellido del autor. 
- **Nacionalidad**: La nacionalidad o país de origen del autor.
 - **Artículos**: Una lista que contendrá todos los artículos que el autor ha escrito. 

### Código (main)

    import java.util.Date; // Importa la clase Date para trabajar con fechas.

    import java.util.List; // Importa la clase List para manejar listas.

    import java.util.Scanner; // Importa la clase Scanner para capturar entrada del usuario.

    public class Main { // Define la clase principal del programa.

    public static void main(String[] args) { // Punto de entrada del programa.

        // Crea instancias de la clase Autor con su nombre, apellido y nacionalidad.

        Autor autor1 = new Autor("Gabriel", "García Márquez", "Colombiana");

        Autor autor2 = new Autor("Isabel", "Allende", "Chilena");

        Autor autor3 = new Autor("Nicholas", "Sparks", "estadunidense");

        // Crea instancias de la clase Articulo asociadas a los autores.

        Articulo articulo1 = new Articulo(

                "Cien años de soledad", // Título del artículo.

                new Date(), // Fecha de creación (actual).

                "Un artículo sobre el realismo mágico y su impacto en la literatura", // Descripción del artículo.

                autor1 // Autor del artículo.
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

        // Crea una lista con todos los autores.

        List<Autor> autores = List.of(autor1, autor2, autor3);

        // Crea un objeto Scanner para capturar la entrada del usuario.

        Scanner scanner = new Scanner(System.in);

        // Muestra el menú para seleccionar un autor.

        System.out.println("Selecciona un autor:");

        for (int i = 0; i < autores.size(); i++) { // Recorre la lista de autores.

            Autor autor = autores.get(i); // Obtiene un autor de la lista.
            System.out.println((i + 1) + ". " + autor.getNombre() + " " + autor.getApellido()); // Muestra la opción.

        }

        int seleccion = scanner.nextInt(); // Captura la selección del usuario.

        // Valida si la selección está dentro del rango permitido.

        if (seleccion < 1 || seleccion > autores.size()) {

            System.out.println("Selección inválida."); // Muestra un mensaje de error si la selección no es válida.

        } else {

            Autor autorSeleccionado = autores.get(seleccion - 1); // Obtiene el autor seleccionado.

            System.out.println("\nArtículos escritos por " + autorSeleccionado.getNombre() + ":"); // Muestra al autor.

            autorSeleccionado.mostrarInfo(); // Llama al método mostrarInfo para mostrar los artículos.

        }

        scanner.close(); // Cierra el objeto Scanner.

      }

    }

### código (autor)

    // Define la clase Autor con atributos y métodos relacionados.

    import java.util.ArrayList; // Importa ArrayList para manejar listas de artículos.

    import java.util.List; // Importa List para definir listas.

    public class Autor {

    private String nombre; // Nombre del autor.

    private String apellido; // Apellido del autor.

    private String nacionalidad; // Nacionalidad del autor.

    private List<Articulo> articulos; // Lista de artículos del autor.

    // Constructor que inicializa los atributos.
    public Autor(String nombre, String apellido, String nacionalidad) {

        this.nombre = nombre;

        this.apellido = apellido;

        this.nacionalidad = nacionalidad;

        this.articulos = new ArrayList<>(); // Inicializa la lista de artículos.

    }

    // Métodos para obtener los atributos del autor.

    public String getNombre() {

        return nombre;

    }

    public String getApellido() {

        return apellido;

    }

    public String getNacionalidad() {

        return nacionalidad;

    }

    // Agrega un artículo a la lista del autor.

    public void agregarArticulo(Articulo articulo) {

        articulos.add(articulo);

    }

    // Muestra la información del autor y sus artículos.

    public void mostrarInfo() {

        System.out.println("Autor: " + nombre + " " + apellido); // Muestra el nombre completo.

        System.out.println("Nacionalidad: " + nacionalidad); // Muestra la nacionalidad.

        System.out.println("Artículos escritos:");

        if (articulos.isEmpty()) { // Verifica si no hay artículos.
            System.out.println("No tiene artículos registrados.");

        } else {

            for (Articulo articulo : articulos) { // Recorre la lista de artículos.

                System.out.println("- " + articulo.getTitulo()); // Muestra el título de cada artículo.

            }

        }

    }

    // Método para obtener la lista de artículos.

    public List<Articulo> getArticulos() {

        return articulos;

      }

    }


### código (artículo) 

    // Define la clase Articulo con atributos y métodos relacionados.

    import java.util.Date; // Importa la clase Date para manejar fechas.

    public class Articulo {

    private String titulo; // Título del artículo.

    private Date fecha; // Fecha de publicación del artículo.

    private String contenido; // Contenido o descripción del artículo.

    private Autor autor; // Autor del artículo.

    // Constructor que inicializa los atributos y asocia el artículo al autor.

    public Articulo(String titulo, Date fecha, String contenido, Autor autor) {

        this.titulo = titulo;

        this.fecha = fecha;

        this.contenido = contenido;

        this.autor = autor;
      
        autor.agregarArticulo(this); // Asocia el artículo al autor.

    }

    // Métodos para obtener los atributos del artículo.

    public String getTitulo() {

        return titulo;

    }

    public Date getFecha() {

        return fecha;

    }

    public String getContenido() {

        return contenido;

    }

    public Autor getAutor() {

        return autor;

    }

    // Muestra la información completa del artículo.

    public void mostrarInfo() {

        System.out.println("Título: " + titulo); // Muestra el título.

        System.out.println("Fecha: " + fecha); // Muestra la fecha.

        System.out.println("Contenido: " + contenido); // Muestra el contenido.

        autor.mostrarInfo(); // Muestra la información del autor.

      }

    }
