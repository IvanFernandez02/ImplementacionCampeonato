import java.util.List;
import java.util.ArrayList;

public class TablaPosiciones {
    private List<Equipo> equipoList;
    private List<Estadisticas> estadisticaList;

    // Constructor
    public TablaPosiciones() {
        this.equipoList = new ArrayList<>();
        this.estadisticaList = new ArrayList<>();
    }

    // Métodos
    public void actualizarTabla() {
        System.out.println("Actualizando la tabla de posiciones.");
    }

    // Getters y Setters
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void agregarEquipo(Equipo equipo) {
        this.equipoList.add(equipo);
    }

    public List<Estadisticas> getEstadisticaList() {
        return estadisticaList;
    }

    public void agregarEstadistica(Estadisticas estadistica) {
        this.estadisticaList.add(estadistica);
    }
}
