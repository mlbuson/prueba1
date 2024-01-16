package com.example.demo;

import com.example.demo.Prueba.OperacionServiceImpl;
import com.example.demo.Prueba.TarjetaCredito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) {

		OperacionServiceImpl operacionService = new OperacionServiceImpl();
		// Crear tres objetos de TarjetaCredito
		TarjetaCredito tarjeta1 = new TarjetaCredito("VISA", "1234567890123456", "John Doe", LocalDate.of(2023, 12, 31));
		TarjetaCredito tarjeta2 = new TarjetaCredito("NARA", "9876543210987654", "Jane Doe", LocalDate.of(2024, 6, 15));
		TarjetaCredito tarjeta3 = new TarjetaCredito("AMEX", "1111222233334444", "Alice Smith", LocalDate.of(2022, 9, 30));

		// Invocar métodos
		System.out.println("Información de Tarjeta 1: " + tarjeta1.getMarca() + " " + tarjeta1.getNumero());

		try {
			System.out.println("Operación válida para Tarjeta 2: " + operacionService.esOperacionValida(800));
			System.out.println("Tarjeta 3 válida para operar: " + operacionService.esTarjetaValida(tarjeta3));
			System.out.println("Tarjeta 1 es distinta a Tarjeta 2: " + operacionService.sonTarjetasDistintas(tarjeta1, tarjeta2));
			System.out.println("Tasa para Tarjeta 1 y monto 500: " + operacionService.obtenerTasa(tarjeta1.getMarca(), 500));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}




























































/*import com.example.demo.Prueba.OperacionService;
import com.example.demo.Prueba.TarjetaCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {


public static void main(String[] args) {
	SpringApplication.run(DemoApplication.class, args);
   }

	@Autowired
	private OperacionService operacionService;

	// Crear tres objetos de TarjetaCredito
	TarjetaCredito tarjeta1 = new TarjetaCredito("VISA", "1234567890123456", "John Doe", LocalDate.of(2023, 12, 31));
	TarjetaCredito tarjeta2 = new TarjetaCredito("NARA", "9876543210987654", "Jane Doe", LocalDate.of(2024, 6, 15));
	TarjetaCredito tarjeta3 = new TarjetaCredito("AMEX", "1111222233334444", "Alice Smith", LocalDate.of(2022, 9, 30));

	public static void imprimir (){
		TarjetaCredito tarjeta1 = new TarjetaCredito("VISA", "1234567890123456", "John Doe", LocalDate.of(2023, 12, 31));
		System.out.println("Información de Tarjeta 1: " + tarjeta1.getMarca() + " " + tarjeta1.getNumero());
	}


	/*try {
		System.out.println("Información de Tarjeta 1: " + tarjeta1.getMarca() + " " + tarjeta1.getNumero());
		System.out.println("Operación válida para Tarjeta 2: " + operacionService.esOperacionValida(800));
		System.out.println("Tarjeta 3 válida para operar: " + operacionService.esTarjetaValida(tarjeta3));
		System.out.println("Tarjeta 1 es distinta a Tarjeta 2: " + operacionService.sonTarjetasDistintas(tarjeta1, tarjeta2));
		System.out.println("Tasa para Tarjeta 1 y monto 500: " + operacionService.obtenerTasa(tarjeta1.getMarca(), 500));
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
} */

