package com.marble.pruebaTecnica;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.marble.dto.Respuesta;

public class Configuracion {

	public Respuesta leerArchivo(String valor) {
		Respuesta respuesta = new Respuesta();
		try {

			Properties config = new Properties();
			config.load(new FileInputStream("Properties/Configuracion.config"));
			String dato = config.getProperty(valor);
			respuesta.setCodigo(0);
			respuesta.setMensaje(dato);
			return respuesta;

		} catch (IOException e) {
			System.err.println(e);
			respuesta.setCodigo(1);
			respuesta.setMensaje(null);
			return respuesta;
		}

	}

}
