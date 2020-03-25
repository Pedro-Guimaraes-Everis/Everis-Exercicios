package page;

import org.openqa.selenium.WebDriver;

import map.ConfirmacoesPageMap;

public class ConfirmacoesPage extends BasePage{
	ConfirmacoesPageMap confirmacoesPageMap = new ConfirmacoesPageMap();
	
	public ConfirmacoesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void confirmarEndereco() {
		click(driver.findElement(confirmacoesPageMap.confirmarEndereco));
	}

	public void confirmarShipping() {
		click(driver.findElement(confirmacoesPageMap.checkBoxShipping));
		click(driver.findElement(confirmacoesPageMap.confirmarShipping));
	}

	public void pagamento(String tipoPagamneto) {
		click(driver.findElement(confirmacoesPageMap.tipoPagamento(tipoPagamneto)));
	}

	public void confirmarOrdem() {
		click(driver.findElement(confirmacoesPageMap.confirmarOrdem));
	}
}
