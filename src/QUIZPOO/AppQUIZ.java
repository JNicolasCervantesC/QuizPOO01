package QUIZPOO;

public class AppQUIZ {

	public static void datosp()
	{
		System.out.println("*******************************************");
		System.out.println("* Nombre: Jose Nicolas Cervantes Castro   *");
		System.out.println("* Codigo: 20232007088                     *");
		System.out.println("* Grupo: 741                              *");
		System.out.println("* Universidad Francisco Jose de caldas    *");
		System.out.println("* Ing Electrica                           *");
		System.out.println("*******************************************");
	}
	public static void responderPreguntas() {

	    System.out.println("\n1. ¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?");
	    System.out.println("Rta (1): La clase 'Persona' es nuestra super calse la cual tiene como atributos nombre(tipo String) y  edad(tipo int); La cual tiene como metodos su respectivo constructor y el metodo 'mostrar informacion' el cual nos muestra lo que contiene cada atributo.\nMientras que la clase 'Empleado' es una clase heredada de la super clase 'Persona' la cual contiene los atributos de 'Persona' y unos nuevos que se definen en ella(Empleados), como lo son salario(double) y cargo(String); la cual tiene el mismo metodo 'mostrarInformacion' de las superclase pero con nuevas caracteristicas.");
	    
	    System.out.println("\n2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
	    System.out.println("La herencia en Java la manejamos de las siguiente manera:\nDefinimos una nueva clase la cual va a heredar con la sig sintaxis: public class (Name_clase_heredada) extends (Name_superclase), donde vamos a manejar un constructor el cual contendra los atributos heredados de la superclase y la de ella misma");
	    
	    System.out.println("\n3. ¿Qué es un constructor en Java y cuál es su propósito?");
	    System.out.println("Un constructor es un metodo que nos dice como vamos a inicializar nuestras variables al tiempo que especificamos a cual hacemos referencia 'this.(variable)=(variable)'");
	    
	    System.out.println("\n4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?");
	    System.out.println("La herencia nos facilita la reutilizacion de codigo para taereas repetitivas o caracteristicas comunes entre varios elementos (Clases).");
	    
	    System.out.println("\n5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?");
	    System.out.println("Instanciación de un clase.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		datosp();
		responderPreguntas();
	}

}
