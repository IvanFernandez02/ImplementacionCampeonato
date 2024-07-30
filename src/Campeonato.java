import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public abstract class Campeonato {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Equipo> equipoList;
    private Calendario calendario;
    private TablaPosiciones tablaPosiciones;
    private FaseGrupos faseGrupos;
    private MuerteSubita muerteSubita;

    // Constructor
    public Campeonato(String nombre, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.equipoList = new ArrayList<>();
        this.calendario = new Calendario();
        this.tablaPosiciones = new TablaPosiciones();
        this.faseGrupos = new FaseGrupos();
        this.muerteSubita = new MuerteSubita();
    }

    // Métodos
    public void inscribirEquipos() {
        System.out.println("Inscribiendo equipos.");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void agregarEquipo(Equipo equipo) {
        this.equipoList.add(equipo);
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public TablaPosiciones getTablaPosiciones() {
        return tablaPosiciones;
    }

    public void setTablaPosiciones(TablaPosiciones tablaPosiciones) {
        this.tablaPosiciones = tablaPosiciones;
    }

    public FaseGrupos getFaseGrupos() {
        return faseGrupos;
    }

    public void setFaseGrupos(FaseGrupos faseGrupos) {
        this.faseGrupos = faseGrupos;
    }

    public MuerteSubita getMuerteSubita() {
        return muerteSubita;
    }

    public void setMuerteSubita(MuerteSubita muerteSubita) {
        this.muerteSubita = muerteSubita;
    }
}
