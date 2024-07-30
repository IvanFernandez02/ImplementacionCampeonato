public class FaseGrupos {
    private String nombreEquipo;
    private int numEquipos;

    // Métodos
    public void clasificarEquipos() {
        System.out.println("Clasificando equipos.");
    }

    public void eliminarEquipos() {
        System.out.println("Eliminando equipos.");
    }

    // Getters y Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
}
