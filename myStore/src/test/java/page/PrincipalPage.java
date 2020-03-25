package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import map.PrincipalPageMap;

// Email: pedrominella99@hotmail.com
// Senha: vDdbAJ@HmBi@Qp3

public class PrincipalPage extends BasePage {
	PrincipalPageMap principalPageMap = new PrincipalPageMap();

	public PrincipalPage(WebDriver driver) {
		super(driver);
	}

	public void adicionarItem(String nome) {
		wait(principalPageMap.scrollMaisVendidos);
		scrollPage(driver.findElement(principalPageMap.scrollMaisVendidos));

		action.moveToElement(driver.findElement(principalPageMap.getHoverItem(nome)))
				.perform();

		WebElement element = driver.findElement(principalPageMap.getComprarItem(nome));
		click(element);

		wait(principalPageMap.checkout);
		element = driver.findElement(principalPageMap.checkout);
		click(element);
	}

	public void logarConta() {
		wait(principalPageMap.botaoLogar);
		click(driver.findElement(principalPageMap.botaoLogar));
	}
}
