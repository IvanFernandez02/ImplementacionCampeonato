public class Jugador extends Persona {
    private String posicion;
    private int golesMarcados;
    private int asistencia;

    // Constructor
    public Jugador(String nombre, int edad, String posicion, int golesMarcados, int asistencia) {
        super(nombre, edad);
        this.posicion = posicion;
        this.golesMarcados = golesMarcados;
        this.asistencia = asistencia;
    }

    // Métodos
    public void respetarReglas() {
        System.out.println("Respetar las reglas.");
    }

    // Getters y Setters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
}
