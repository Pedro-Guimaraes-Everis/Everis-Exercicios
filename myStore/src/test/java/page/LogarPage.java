package page;

import org.openqa.selenium.WebDriver;

import map.LogarPageMap;
import map.PrincipalPageMap;

public class LogarPage extends BasePage {

	LogarPageMap logarPageMap = new LogarPageMap();

	public LogarPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void logar(String email, String senha) {
		scrollPage(driver.findElement(logarPageMap.email));
		wait(logarPageMap.email);
		driver.findElement(logarPageMap.email).sendKeys(email);
		driver.findElement(logarPageMap.senha).sendKeys(senha);
		click(driver.findElement(logarPageMap.submitLogin));
	}

	public void voltarPrincipalPage() {
		click(driver.findElement(logarPageMap.voltarPrincipalPage));
	}
}
