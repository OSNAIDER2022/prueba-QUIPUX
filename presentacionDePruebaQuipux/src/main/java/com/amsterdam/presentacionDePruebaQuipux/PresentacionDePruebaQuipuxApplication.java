package com.amsterdam.presentacionDePruebaQuipux;

import com.amsterdam.presentacionDePruebaQuipux.DB.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PresentacionDePruebaQuipuxApplication {

	public static void main(String[] args) {
		Database.crearTablas();
		SpringApplication.run(PresentacionDePruebaQuipuxApplication.class, args);
	}

}
