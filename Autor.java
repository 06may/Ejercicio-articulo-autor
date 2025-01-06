
import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private List<Articulo> articulos;

    public Autor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.articulos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " " + apellido);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Artículos escritos:");
        if (articulos.isEmpty()) {
            System.out.println("No tiene artículos registrados.");
        } else {
            for (Articulo articulo : articulos) {
                System.out.println("- " + articulo.getTitulo());
            }
        }
    }
    public List<Articulo> getArticulos() {
        return articulos;
    }
}

