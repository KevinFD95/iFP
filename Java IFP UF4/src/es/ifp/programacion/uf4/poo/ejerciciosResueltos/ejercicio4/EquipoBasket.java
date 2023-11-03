package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * CLASE EJERCICIOS RESUELTOS 4, 5, 6 Y 7: EQUIPOBASKET
 * 
 * Clase independiente a la clase Persona pero que trabaja por composición con las hijas
 * de ésta.
 * 
 * Datos y objetos:
 * String nombreEquipo
 * Entrenador entrenador
 * JugadorBasket jugador1
 * JugadorBasket jugador2
 * JugadorBasket jugador3
 * JugadorBasket jugador4
 * JugadorBasket jugador5
 * int gamesJugados
 * int gamesGanados
 * int gamesPerdidos
 * 
 * Constructor con los datos sin añadir los int como parámetros
 * 
 * Métodos get, set y toString
 * Métodos para sumar partidos a los int
 */

public class EquipoBasket {

	//ATRIBUTOS
	
	private String nombreEquipo;
	
	private Entrenador entrenador;
	
	private JugadorBasket jugador1;
	private JugadorBasket jugador2;
	private JugadorBasket jugador3;
	private JugadorBasket jugador4;
	private JugadorBasket jugador5;
	
	private int gamesJugados;
	private int gamesGanados;
	private int gamesPerdidos;
	
	//CONSTRUCTORES
	
	public  EquipoBasket(String nombreEquipo, Entrenador entrenador, JugadorBasket j1, JugadorBasket j2, JugadorBasket j3, JugadorBasket j4, JugadorBasket j5) {
		this.nombreEquipo = nombreEquipo;
		this.entrenador = entrenador;
		this.jugador1 = j1;
		this.jugador2 = j2;
		this.jugador3 = j3;
		this.jugador4 = j4;
		this.jugador5 = j5;
		this.gamesJugados = 0;
		this.gamesGanados = 0;
		this.gamesPerdidos = 0;
	}
	
	//METODOS

	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * @return the entrenador
	 */
	public Entrenador getEntrenador() {
		return entrenador;
	}

	/**
	 * @param entrenador the entrenador to set
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	/**
	 * @return the jugador1
	 */
	public JugadorBasket getJugador1() {
		return jugador1;
	}

	/**
	 * @param jugador1 the jugador1 to set
	 */
	public void setJugador1(JugadorBasket jugador1) {
		this.jugador1 = jugador1;
	}

	/**
	 * @return the jugador2
	 */
	public JugadorBasket getJugador2() {
		return jugador2;
	}

	/**
	 * @param jugador2 the jugador2 to set
	 */
	public void setJugador2(JugadorBasket jugador2) {
		this.jugador2 = jugador2;
	}

	/**
	 * @return the jugador3
	 */
	public JugadorBasket getJugador3() {
		return jugador3;
	}

	/**
	 * @param jugador3 the jugador3 to set
	 */
	public void setJugador3(JugadorBasket jugador3) {
		this.jugador3 = jugador3;
	}

	/**
	 * @return the jugador4
	 */
	public JugadorBasket getJugador4() {
		return jugador4;
	}

	/**
	 * @param jugador4 the jugador4 to set
	 */
	public void setJugador4(JugadorBasket jugador4) {
		this.jugador4 = jugador4;
	}

	/**
	 * @return the jugador5
	 */
	public JugadorBasket getJugador5() {
		return jugador5;
	}

	/**
	 * @param jugador5 the jugador5 to set
	 */
	public void setJugador5(JugadorBasket jugador5) {
		this.jugador5 = jugador5;
	}
	
	/**
	 * @return the gamesJugados
	 */
	public int getGamesJugados() {
		return this.gamesJugados;
	}

	/**
	 * @return the gamesGanados
	 */
	public int getGamesGanados() {
		return this.gamesGanados;
	}

	/**
	 * @return the gamesPerdidos
	 */
	public int getGamesPerdidos() {
		return this.gamesPerdidos;
	}
	
	public void gameGanado() {
		this.gamesGanados++;
		this.gamesJugados++;
	}
	
	public void gamePerdido() {
		this.gamesPerdidos++;
		this.gamesJugados++;
	}
	
	public String toString() {
		return  "Nombre del equipo: "+this.getNombreEquipo()+"\n\n"+
				"Entrenador:\n"+this.getEntrenador()+"\n\n"+
				"Jugador 1:\n"+this.getJugador1()+"\n\n"+
				"Jugador 2:\n"+this.getJugador2()+"\n\n"+
				"Jugador 3:\n"+this.getJugador3()+"\n\n"+
				"Jugador 4:\n"+this.getJugador4()+"\n\n"+
				"Jugador 5:\n"+this.getJugador5()+"\n\n"+
				"Partidos jugados: "+this.getGamesJugados()+"\n"+
				"Partidos ganados: "+this.getGamesGanados()+"\n"+
				"Partidos perdidos: "+this.getGamesPerdidos();
	}
}
