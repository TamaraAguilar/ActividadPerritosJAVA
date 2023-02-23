package com.generation.objetos23febrero;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.objetos23febrero.models.Perro;

@SpringBootApplication
public class Objetos23febreroApplication {
	
	public static String machoHembra (char mh){
		if(mh == 'H'){
			return "hembra";
		}else{
			return "macho";
		}
	}
		

	

	public static void main(String[] args) {
		//Crea un perro por defecto
		Perro perrodefault = new Perro();
		//Crear un perro con todos los atributos
		Perro perroCompleto = new Perro("Salchicha", "Café", 40.5, "Pelo duro", 'F', 12345);

		
		//perro por defecto aparece null
		// System.out.println(perrodefault.toString());
		// //perro completo tiene todos los datos que le dimos
		// System.out.println(perroCompleto.toString());
	
		// perrodefault.setRaza("Quiltro");
		// perrodefault.setColor("Blanco");

		// System.out.println(perrodefault.toString());

		// //con get traemos el dato
		// System.out.println(perroCompleto.getTamanio()+20);

		//con el set editamos el dato original
		//perroCompleto.setTamanio(50,8);

		//Para guardar un atributo en una variable
		//Double tamanioPerroCompleto = perroCompleto.getTamanio();
	
		//Crear un Array List de perros en el que se pueden agregar objetos de tipo perro
		// ArrayList <Perro> misPerros = new ArrayList<>();
		// misPerros.add(perroCompleto);
		// misPerros.add(perrodefault);

		// System.out.println("Desde aquí es el array");
		// System.out.println(misPerros);
		// //1 es la posición del perro default
		// misPerros.get(1).setTamanio(85.6);

		// System.out.println("Desde aquí es el array modificado");
		// System.out.println(misPerros);

	/*-----------------------ACTIVIDAD-----------------------------*/

	Scanner input = new Scanner(System.in);


	System.out.println("*********************************************************");
	System.out.println("¡Bienvenido/a a la fábrica de Perritos.java!");
	System.out.println("A continuación vamos a crear un perrito :D");

	System.out.println("Ingrese el tipo de raza de su perrito: ");
	String razaPerro = input.nextLine();
	perrodefault.setRaza(razaPerro);

	System.out.println("Ingrese el color de su perrito: ");
	String colorPerro = input.nextLine();
	perrodefault.setColor(colorPerro);

	System.out.println("Ingrese el tamaño de su perrito (en cm): ");
	Double tamanioPerro = input.nextDouble();
	perrodefault.setTamanio(tamanioPerro);

	System.out.println("Ingrese el tipo de pelaje de su perrito: ");
	input.nextLine();
	String pelajePerro = input.nextLine();
	perrodefault.setPelaje(pelajePerro);

	System.out.println("Ingrese el sexo de su perrito. M para macho y H para hembra.");
	String sexoPerro = input.next();
	char mh = sexoPerro.charAt(0);
	perrodefault.setSexo(mh);


	System.out.println("Paciencia por favor, estamos creando su perrito...");
	System.out.println("3");
	System.out.println("2");
	System.out.println("1");

	System.out.println("¡Su perrito está listo! Estás son sus características: ");
	System.out.println("Su raza es " + perrodefault.getRaza());
	System.out.println("Su color es " + perrodefault.getColor());
	System.out.println("Su tamaño es de " + perrodefault.getTamanio() + " cm");
	System.out.println("Su tipo de pelaje es " + perrodefault.getPelaje());
	System.out.println("Su sexo es " + machoHembra(mh));
	System.out.println("¡Disfrute su perrito! :D");





	
	// int cantPerritos;
	// ArrayList <Perro> misPerros = new ArrayList<>();
	// java.util.Random random = new java.util.Random();

	// 	do{
	// 	System.out.println("¿Cuántos perritos desea crear hoy?");
	// 	cantPerritos = input.nextInt();
	// } while(cantPerritos <= 0);
	// //Recorremos el array
	// for(int i = 0; i < cantPerritos; i++){
	// 	input.nextLine();
	// 	System.out.println("Ingrese la raza del perrito: ");
	// 	String razaPerro = input.nextLine();
	// 	System.out.println("Ingrese el color de su perrito: ");
	// 	String colorPerro = input.nextLine();
	// 	System.out.println("Ingrese el tamaño de su perrito (en cm): ");
	// 	Double tamanioPerro = input.nextDouble();
	// 	System.out.println("Ingrese el tipo de pelaje de su perrito: ");
	// 	input.nextLine(); //Consume el salto de línea vacío
	// 	String pelajePerro = input.nextLine();
	// 	System.out.println("Ingrese el sexo de su perrito. M para macho y H para hembra.");
	// 	String sexoPerro = input.next();
	// 	char mh = sexoPerro.charAt(0);
	// 	Integer chipPerro = new java.util.Random().nextInt(100);


		
		
			
	// //Crear objeto con todos los atributos
	// 	Perro nuevoPerro = new Perro(razaPerro, colorPerro, tamanioPerro, pelajePerro, sexoPerro, chipPerro);
	// 	misPerros.add(nuevoPerro);
	

			
	// 	}

	// 	System.out.println(misPerros);




		// System.out.println("Su raza es " + misPerros.get(0).getRaza());
	
	
	}

}
