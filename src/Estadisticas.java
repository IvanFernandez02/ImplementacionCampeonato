public class Estadisticas {
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int totGoles;
    private int golesFavor;
    private int golesContra;

    // Métodos
    public String obtenerEstadisticas() {
        return "Partidos Jugados: " + partidosJugados +
                ", Partidos Ganados: " + partidosGanados +
                ", Partidos Perdidos: " + partidosPerdidos +
                ", Partidos Empatados: " + partidosEmpatados +
                ", Goles Totales: " + totGoles +
                ", Goles a Favor: " + golesFavor +
                ", Goles en Contra: " + golesContra;
    }

    // Getters y Setters
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getTotGoles() {
        return totGoles;
    }

    public void setTotGoles(int totGoles) {
        this.totGoles = totGoles;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }
}
