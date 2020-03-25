package map;

import org.openqa.selenium.By;

public class ConfirmacoesPageMap {
	public By confirmarEndereco = By.xpath("//p//button[@name='processAddress']");

	public By checkBoxShipping = By.xpath("//input[@name='cgv']");

	public By confirmarShipping = By.xpath("//p//button[@name='processCarrier']");

	public By tipoPagamento(String tipo) {
		return By.xpath("//a[@class='" + tipo + "']");
	}

	public By confirmarOrdem = By.xpath("//p//button[@class='button btn btn-default button-medium']");
}
