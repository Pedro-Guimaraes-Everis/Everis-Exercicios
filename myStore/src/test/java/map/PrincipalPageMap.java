package map;

import org.openqa.selenium.By;

public class PrincipalPageMap {

	public By scrollMaisVendidos = By.xpath("//a[@class='homefeatured']");

	public By getHoverItem(String text) {
		return By.xpath("//ul[@id='homefeatured']//a[normalize-space(text())='" + text + "']");
	}

	public By getComprarItem(String text) {
		return By.xpath("//ul[@id='homefeatured']//a[normalize-space(text())='" + text
				+ "']//ancestor::li//span[text()='Add to cart']//ancestor::a");
	}

	public By checkout = By.xpath("//a[@title='Proceed to checkout']");

	public By botaoLogar = By.xpath("//a[@class='login']");

	
}
