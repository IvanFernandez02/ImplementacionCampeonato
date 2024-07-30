import java.util.List;
import java.util.ArrayList;

public class Calendario {
    private List<Partido> partidoList;

    // Constructor
    public Calendario() {
        this.partidoList = new ArrayList<>();
    }

    // Métodos
    public void generarCalendario() {
        System.out.println("Generando el calendario.");
    }

    public void actualizarCalendario() {
        System.out.println("Actualizando el calendario.");
    }

    // Getters y Setters
    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void agregarPartido(Partido partido) {
        this.partidoList.add(partido);
    }
}
