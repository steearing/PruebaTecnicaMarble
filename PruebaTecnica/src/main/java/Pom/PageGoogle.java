package Pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageGoogle {
	
	public PageGoogle() {
		//throw new IllegalStateException();
	}
	
	@FindBy(name = "q")
	private WebElement txtBuscador;
	
	@FindBy(name = "btnK")
	private WebElement btnBuscar;	
	
	
	@FindBy(xpath = "//*[@id=\"taw\"]/div[2]/div/p/a/b/i")
	private WebElement lnkPalabraCorrecta;
	
	@FindBy(className = "ellip")
	private List<WebElement> lnkResultados;
	
	
	/*public static List<WebElement> lnkResultados(WebDriver driver) {
		elementos = driver.findElements(By.className("ellip"));
		return elementos;
	}*/
	
	public void  ingresarPalabra(WebDriver driver) {
		txtBuscador.sendKeys("pruebaz");
		btnBuscar.click();
	}
	
	public void seleccionarPalabraCorrecta(WebDriver driver) {
		lnkPalabraCorrecta.click();
	}
	
	public void resultadosObtenido(WebDriver driver) {		
		System.out.println("Resultado obtenidos de la busqueda,: " + lnkResultados.size());
		for (WebElement ele : lnkResultados) {
			System.out.println(ele.getText());
			System.out.println(ele.getTagName());
			System.out.println(ele.getAttribute("innerText"));
			System.out.println("");
			System.out.println("");
		}
	}
	
	public void verificarResultados(WebDriver driver) {
		if (lnkResultados.size() > 6) {
			driver.quit();
		}else {
			Assert.fail();
			driver.quit();
		}
	}
	

}
