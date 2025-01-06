import java.util.Date;

public class Articulo {
    private String titulo;
    private Date fecha;
    private String contenido;
    private Autor autor;

    public Articulo(String titulo, Date fecha, String contenido, Autor autor) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.contenido = contenido;
        this.autor = autor;
        autor.agregarArticulo(this);
    }

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

        public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Contenido: " + contenido);
        autor.mostrarInfo();
    }
}


