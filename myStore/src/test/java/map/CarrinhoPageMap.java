package map;

import org.openqa.selenium.By;

public class CarrinhoPageMap {
	public By confirmarCompra = By.xpath("//p//a[@title='Proceed to checkout']");

	public By getDeletarItem(String nome) {
		return By.xpath("//a[normalize-space(text())='"+nome+"']//ancestor::tr//a[@title='Delete']");
	}
}
