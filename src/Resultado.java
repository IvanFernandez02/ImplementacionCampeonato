public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    // Métodos
    public String obtenerGanador() {
        if (golesLocal > golesVisitante) {
            return "Gana Local";
        } else if (golesLocal < golesVisitante) {
            return "Gana Visitante";
        } else {
            return "Empate";
        }
    }

    // Getters y Setters
    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}
