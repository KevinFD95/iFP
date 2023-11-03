package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio2;

/**
 * EJERCICIOS RESUELTOS 2 Y 3: GESTION DE UN CENTRO DOCENTE
 * 
 * En este ejercicio se introducen los datos de alumnos y profesores como objetos 
 * y se escriben en consola posteriormente
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//DECLARACION DE OBJETOS
		
		Persona juan = new Profesor("Juan", "Guarnizo", "Avellanero", "43792215-X", "juanga_90@gmail.com", 676952033, "Tarragona", 30, 'B', 
									"Salou", "Salou", "Licenciatura en Literatura Castellana", "Lengua Castellana");
		
		Persona maria = new Profesor("Maria", "Sanchez", "Gutierrez", "67293415-M", "mariasg_92@gmail.com", 695231468, "Sínies", 2, '1',
									 "Reus", "Reus", "Licenciatura en Matemáticas", "Matemáticas");
		
		Persona kevin = new Profesor("Kevin", "Fuentes", "Duran", "77794709-S");
		
		Direccion martinCasa = new Direccion("Barcelona", 102, 'D', "Silla", "Valencia");
		Persona martin = new Alumno("Martin", "Rodriguez", "Alonso", "65432891-Q", "martinra_15@gmail.com", 8, martinCasa);
		
		//SALIDA DE DATOS
		
		System.out.println(juan.toString());
		System.out.println("======================================================================================");
		System.out.println(maria.toString());
		System.out.println("======================================================================================");
		System.out.println(kevin.toString());
		System.out.println("======================================================================================");
		System.out.println(martin.toString());
		
		Direccion nuevaDireccionMaria = new Direccion("Barcelona", 30, 'B', "Salou", "Salou");
		maria.setDireccion(nuevaDireccionMaria);
		
		System.out.println("======================================================================================");
		System.out.println("Nueva dirección:\n"+maria.toString());
	}
}