import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Ingresar datos del jugador
            System.out.print("Ingrese nombre del jugador: ");
            String nombreJugador = scanner.nextLine();
            System.out.print("Ingrese edad del jugador: ");
            int edadJugador = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
            System.out.print("Ingrese posición del jugador: ");
            String posicionJugador = scanner.nextLine();
            System.out.print("Ingrese goles del jugador: ");
            int golesJugador = scanner.nextInt();
            System.out.print("Ingrese asistencias del jugador: ");
            int asistenciasJugador = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            Jugador jugador1 = new Jugador(nombreJugador, edadJugador, posicionJugador, golesJugador, asistenciasJugador);

            // Ingresar datos del equipo
            System.out.print("Ingrese nombre del equipo: ");
            String nombreEquipo = scanner.nextLine();

            Equipo equipo1 = new Equipo(nombreEquipo) {
                // Implementación de cualquier método abstracto si es necesario
            };
            equipo1.agregarJugador(jugador1);

            // Ingresar estadísticas
            Estadisticas estadisticas1 = new Estadisticas();
            System.out.print("Ingrese partidos jugados: ");
            estadisticas1.setPartidosJugados(scanner.nextInt());
            System.out.print("Ingrese partidos ganados: ");
            estadisticas1.setPartidosGanados(scanner.nextInt());
            System.out.print("Ingrese partidos perdidos: ");
            estadisticas1.setPartidosPerdidos(scanner.nextInt());
            System.out.print("Ingrese partidos empatados: ");
            estadisticas1.setPartidosEmpatados(scanner.nextInt());
            System.out.print("Ingrese goles totales: ");
            estadisticas1.setTotGoles(scanner.nextInt());
            System.out.print("Ingrese goles a favor: ");
            estadisticas1.setGolesFavor(scanner.nextInt());
            System.out.print("Ingrese goles en contra: ");
            estadisticas1.setGolesContra(scanner.nextInt());
            scanner.nextLine(); // Consumir nueva línea
            equipo1.setEstadistica(estadisticas1);

            // Ingresar datos del árbitro
            System.out.print("Ingrese nombre del árbitro: ");
            String nombreArbitro = scanner.nextLine();
            System.out.print("Ingrese edad del árbitro: ");
            int edadArbitro = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            Arbitro arbitro1 = new Arbitro(nombreArbitro, edadArbitro);

            // Ingresar resultado
            Resultado resultado1 = new Resultado();
            System.out.print("Ingrese goles del equipo local: ");
            resultado1.setGolesLocal(scanner.nextInt());
            System.out.print("Ingrese goles del equipo visitante: ");
            resultado1.setGolesVisitante(scanner.nextInt());
            scanner.nextLine(); // Consumir nueva línea

            // Ingresar datos del partido
            System.out.print("Ingrese fecha del partido (yyyy-MM-dd): ");
            Date fechaPartido = sdf.parse(scanner.nextLine());
            System.out.print("Ingrese hora del partido (HH:mm): ");
            String horaPartido = scanner.nextLine();

            Partido partido1 = new Partido(fechaPartido, horaPartido);
            partido1.setResultado(resultado1);
            partido1.agregarArbitro(arbitro1);

            // Crear calendario y agregar el partido
            Calendario calendario = new Calendario();
            calendario.agregarPartido(partido1);

            // Crear tabla de posiciones y agregar el equipo
            TablaPosiciones tablaPosiciones = new TablaPosiciones();
            tablaPosiciones.agregarEquipo(equipo1);
            tablaPosiciones.agregarEstadistica(estadisticas1);

            // Ingresar datos del campeonato
            System.out.print("Ingrese nombre del campeonato: ");
            String nombreCampeonato = scanner.nextLine();
            System.out.print("Ingrese fecha de inicio del campeonato (yyyy-MM-dd): ");
            Date fechaInicio = sdf.parse(scanner.nextLine());
            System.out.print("Ingrese fecha de fin del campeonato (yyyy-MM-dd): ");
            Date fechaFin = sdf.parse(scanner.nextLine());

            Campeonato campeonato = new Campeonato(nombreCampeonato, fechaInicio, fechaFin) {

            };
            campeonato.agregarEquipo(equipo1);
            campeonato.setCalendario(calendario);
            campeonato.setTablaPosiciones(tablaPosiciones);

            // Inscribir equipos en el campeonato
            campeonato.inscribirEquipos();

            // Generar y actualizar calendario
            calendario.generarCalendario();
            calendario.actualizarCalendario();

            // Jugar partido
            partido1.jugarPartido();

            // Obtener y mostrar el resultado del partido
            System.out.println("Resultado del partido: " + resultado1.obtenerGanador());

            // Actualizar tabla de posiciones
            tablaPosiciones.actualizarTabla();

            // Mostrar estadísticas en formato de tabla
            mostrarEstadisticas(estadisticas1);

            // Mostrar tabla de posiciones en formato de tabla
            mostrarTablaPosiciones(tablaPosiciones, nombreCampeonato);

        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void mostrarEstadisticas(Estadisticas estadisticas) {
        System.out.println("+------------------------------+");
        System.out.println("| Estadísticas                 |");
        System.out.println("+------------------------------+");
        System.out.printf("| Partidos Jugados: %-2d         |\n", estadisticas.getPartidosJugados());
        System.out.printf("| Partidos Ganados: %-2d         |\n", estadisticas.getPartidosGanados());
        System.out.printf("| Partidos Perdidos: %-2d        |\n", estadisticas.getPartidosPerdidos());
        System.out.printf("| Partidos Empatados: %-2d       L|\n", estadisticas.getPartidosEmpatados());
        System.out.printf("| Goles Totales: %-2d            |\n", estadisticas.getTotGoles());
        System.out.printf("| Goles a Favor: %-2d            |\n", estadisticas.getGolesFavor());
        System.out.printf("| Goles en Contra: %-2d          |\n", estadisticas.getGolesContra());
        System.out.println("+------------------------------+");
    }

    public static void mostrarTablaPosiciones(TablaPosiciones tablaPosiciones, String nombreCampeonato) {
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("|                          Tabla de Posiciones                                 |");
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.printf("|                           Campeonato: %-12s                              |\n", nombreCampeonato);
        System.out.println("+------------------------------------------------------------------------------+");
        for (int i = 0; i < tablaPosiciones.getEquipoList().size(); i++) {
            Equipo equipo = tablaPosiciones.getEquipoList().get(i);
            Estadisticas estadisticas = equipo.getEstadistica();
            System.out.printf("| Equipo: %-12s | PJ: %2d | PG: %2d | PP: %2d | PE: %2d | GF: %2d | GC: %2d   |\n",
                    equipo.getNombre(), estadisticas.getPartidosJugados(), estadisticas.getPartidosGanados(),
                    estadisticas.getPartidosPerdidos(), estadisticas.getPartidosEmpatados(),
                    estadisticas.getGolesFavor(), estadisticas.getGolesContra());
        }
        System.out.println("+------------------------------------------------------------------------------+");
    }
}
