package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.marble.pruebaTecnica.Configuracion;
import com.marble.pruebaTecnica.Utilidades;

import Pom.PageGoogle;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinitions {

	public static WebDriver driver;
	Configuracion configuracion = new Configuracion();
	Utilidades utilidades = new Utilidades();

	/*@Given("abro el navegador e ingreso al buscador de google")
	public void abro_el_navegador_e_ingreso_al_buscador_de_google() {
		System.setProperty(configuracion.leerArchivo("webDriver").getMensaje(),
				configuracion.leerArchivo("ruta.driver").getMensaje());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(configuracion.leerArchivo("url").getMensaje());
	}*/

	@When("dijito la palabra pruebaz")
	public void dijito_la_palabra_pruebaz() throws Exception {
		Reporter.addScreenCaptureFromPath(
				utilidades.getscreenshot(driver, configuracion.leerArchivo("ruta.Evidencia").getMensaje()));
		PageGoogle pageGoogle = PageFactory.initElements(driver, PageGoogle.class);
		pageGoogle.ingresarPalabra(driver);
		Reporter.addScreenCaptureFromPath(
				utilidades.getscreenshot(driver, configuracion.leerArchivo("ruta.Evidencia").getMensaje()));

	}

	@When("el buscador cargue la palabra correcta")
	public void el_buscador_cargue_la_palabra_correcta() throws Exception {
		PageGoogle pageGoogle = PageFactory.initElements(driver, PageGoogle.class);
		pageGoogle.seleccionarPalabraCorrecta(driver);
		Reporter.addScreenCaptureFromPath(
				utilidades.getscreenshot(driver, configuracion.leerArchivo("ruta.Evidencia").getMensaje()));
	}

	@Then("obtengo la lista de los resultados")
	public void obtengo_la_lista_de_los_resultados() {
		PageGoogle pageGoogle = PageFactory.initElements(driver, PageGoogle.class);
		pageGoogle.resultadosObtenido(driver);

	}

	@Then("verifico que sean mas de seis")
	public void verifico_que_sean_mas_de() {
		PageGoogle pageGoogle = PageFactory.initElements(driver, PageGoogle.class);
		pageGoogle.verificarResultados(driver);
	}
	
	
	
	@Given("^abro el navegador e ingreso al buscador de google$")
	public void abro_el_navegador_e_ingreso_al_buscador_de_google() throws Throwable {
		System.setProperty(configuracion.leerArchivo("webDriver").getMensaje(),
				configuracion.leerArchivo("ruta.driver").getMensaje());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(configuracion.leerArchivo("url").getMensaje());
	}

}
