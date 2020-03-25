package cenarios;

import org.junit.Before;
import org.junit.Test;

import page.CarrinhoPage;
import page.ConfirmacoesPage;
import page.LogarPage;
import page.PrincipalPage;

public class FazerCompra extends BaseTest {

	PrincipalPage principalpage;
	LogarPage logarPage;
	CarrinhoPage carrinhoPage;
	ConfirmacoesPage confirmacoesPage;

	@Before
	public void beforetest() {
		principalpage = new PrincipalPage(driver);
		logarPage = new LogarPage(driver);
		carrinhoPage = new CarrinhoPage(driver);
		confirmacoesPage = new ConfirmacoesPage(driver);
	}

	@Test
	public void test() throws Exception {
		driver.navigate().to("http://automationpractice.com/index.php");
		principalpage.logarConta();
		logarPage.logar("pedrominella99@hotmail.com", "vDdbAJ@HmBi@Qp3");
		logarPage.voltarPrincipalPage();
		principalpage.adicionarItem("Faded Short Sleeve T-shirts");
		carrinhoPage.confirmarCompra();
		confirmacoesPage.confirmarEndereco();
		confirmacoesPage.confirmarShipping();
		confirmacoesPage.pagamento("cheque");
		confirmacoesPage.confirmarOrdem();
	}

}
