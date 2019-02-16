package org.techquiero.tarea2;

import java.util.Scanner;

public class test {
	public static void main (String[] args) {
		perro Perro = new perro();
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Dame el nombre del perro");
		Perro.setNombre(scanner.nextLine());
		
		System.out.println("Cual es su edad");
		Perro.setEdad(scanner.nextInt());
		
		System.out.println("Cual es la raza");
		Perro.setRaza(scanner.nextLine());
		
		System.out.println("Cual es su longitud");
		Perro.setLongitud(scanner.nextDouble());
		
		System.out.println("Cual es su genero");
		Perro.setGenero(scanner.nextBoolean());
		
		System.out.println(Perro.toString());
		
		
	}

}
