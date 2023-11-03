package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * EJERCICIOS RESUELTOS 4, 5, 6 y 7: GESTION DE UN EQUIPO DE BALONCESTO
 * 
 * Programa Principal de prueba de los ejercicios 4, 5, 6 y 7 en el que se prueban todas las clases codificadas
 * y se crean objetos a partir de ellas, probando los métodos de las clases.
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//OBJETOS
		
		Entrenador entrenador = new Entrenador("Santiago", "Pérez Duran", "45839210-Z", 5);
		
		JugadorBasket jb1 = new JugadorBasket("Kevin", "Fuentes Duran", "77794709-S", 7);
		JugadorBasket jb2 = new JugadorBasket("Alejandro", "Pérez Duran", "39569241-X", 9);
		JugadorBasket jb3 = new JugadorBasket("Aman", "Kumar", "69748392-R", 10);
		JugadorBasket jb4 = new JugadorBasket("Salva", "Godo Sánchez", "37958402-T", 5);
		JugadorBasket jb5 = new JugadorBasket("Iñigo", "Salguero García", "53856791-B", 2);
		
		EquipoBasket equipoBasket1 = new EquipoBasket("BC Salou", entrenador, jb1, jb2, jb3, jb4, jb5);
		
		JugadorFutbol jf1 = new JugadorFutbol("Martin", "Camacho García", "30958413-K", true);
		JugadorFutbol jf2 = new JugadorFutbol("Eric", "Berck Valencia", "37928711-Q", false);
		
		Nadador n1 = new Nadador("Maria", "González Amoros", "63998214-J", 1.64f, 52.4f);
		
		//SALIDA DE DATOS
		
		System.out.println("==============Equipo de Baloncesto==================");
		System.out.println(equipoBasket1.toString());
		System.out.println(" ");
		
		System.out.println("==============Acciones equipo Baloncesto==================");
		
		equipoBasket1.gameGanado();
		
		equipoBasket1.gamePerdido();
		
		System.out.println(equipoBasket1.toString());
		System.out.println(" ");
		
		System.out.println("==============Jugadores de Futbol==================");
		System.out.println(jf1.toString());
		System.out.println(" ");
		jf1.compitiendo();
		System.out.println(" ");
		System.out.println(jf2.toString());
		System.out.println(" ");
		jf2.compitiendo();
		System.out.println(" ");
		
		System.out.println("==============Nadadores==================");
		System.out.println(n1.toString());
		n1.compitiendo();
	}
}
