import java.util.List;
import java.util.ArrayList;

public class Liga {
    private String nombreLiga;
    private List<Campeonato> campeonatos;

    // Constructor
    public Liga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
        this.campeonatos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombreLiga() {
        return nombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    public List<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    public void agregarCampeonato(Campeonato campeonato) {
        this.campeonatos.add(campeonato);
    }
}
