import java.util.ArrayList;
import java.util.List;

public abstract class Equipo {
    private String nombre;
    private List<Jugador> jugadorList;
    private Estadisticas estadistica;

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadorList = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadorList.add(jugador);
    }

    public Estadisticas getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(Estadisticas estadistica) {
        this.estadistica = estadistica;
    }
}
