package com.ventas.ventas;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VentasApplication {

	private VentasApplication ventasApplication;
	private static final Logger logger= LoggerFactory.getLogger(VentasApplication.class);
	public static void main(String[] args) {
		logger.error("Mi primer log xd");
		logger.trace("Mensaje de rastreo");
		logger.debug("mensaje de depuracion");
		logger.info("mensaje informacion");
		logger.warn("mensaje advertencia");
		SpringApplication.run(VentasApplication.class, args);
	}

}
