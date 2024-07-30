import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Partido {
    private Date fecha;
    private String hora;
    private Resultado resultado;
    private List<Arbitro> arbitroList;

    // Constructor
    public Partido(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.arbitroList = new ArrayList<>();
    }

    // Métodos
    public void jugarPartido() {
        System.out.println("Jugando el partido.");
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public List<Arbitro> getArbitroList() {
        return arbitroList;
    }

    public void agregarArbitro(Arbitro arbitro) {
        this.arbitroList.add(arbitro);
    }
}
