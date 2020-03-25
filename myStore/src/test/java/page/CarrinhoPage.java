package page;

import org.openqa.selenium.WebDriver;

import map.CarrinhoPageMap;

public class CarrinhoPage extends BasePage {
	CarrinhoPageMap carrinhoPageMap = new CarrinhoPageMap();

	public CarrinhoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void confirmarCompra() {
		click(driver.findElement(carrinhoPageMap.confirmarCompra));
	}

	public void tirarCarrinho(String nome) {
		wait(carrinhoPageMap.getDeletarItem(nome));
		click(driver.findElement(carrinhoPageMap.getDeletarItem(nome)));
		waitInvisiblitity(carrinhoPageMap.getDeletarItem(nome));
	}
}
