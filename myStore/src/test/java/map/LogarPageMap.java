package map;

import org.openqa.selenium.By;

public class LogarPageMap {
	public By email = By.xpath("//form[@id='login_form']//input[@data-validate='isEmail']");
	public By senha = By.xpath("//form[@id='login_form']//input[@data-validate='isPasswd']");
	public By submitLogin = By.xpath("//form[@id='login_form']//button[@id='SubmitLogin']");
	public By voltarPrincipalPage = By.xpath("//a[@title='My Store']");
}
