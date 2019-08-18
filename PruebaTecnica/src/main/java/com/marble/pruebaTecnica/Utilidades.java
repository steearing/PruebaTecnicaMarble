package com.marble.pruebaTecnica;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilidades {
	
	public String getscreenshot(WebDriver driver, String rutaEvidencia) throws Exception {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File carpetaScreenshot = new File(rutaEvidencia);
		if (!carpetaScreenshot.exists()) {
			carpetaScreenshot.mkdir();
		}
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String nombreArchivo = rutaEvidencia + timeStamp + ".png";
		FileUtils.copyFile(scrFile, new File(nombreArchivo));
		return nombreArchivo;
	}

}
