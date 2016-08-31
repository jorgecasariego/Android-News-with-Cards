package atc.android.noticias;

/**
 * Created by jorgecasariego on 31/8/16.
 */
public class Noticias {
    private String titulo;
    private String fecha;
    private int thumbnail;

    public Noticias() {
    }

    public Noticias(String titulo, String fecha, int thumbnail) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.thumbnail = thumbnail;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
