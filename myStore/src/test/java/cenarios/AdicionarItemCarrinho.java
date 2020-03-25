package cenarios;

import org.junit.Before;
import org.junit.Test;

import page.CarrinhoPage;
import page.ConfirmacoesPage;
import page.LogarPage;
import page.PrincipalPage;

public class AdicionarItemCarrinho extends BaseTest {
	PrincipalPage principalpage;
	CarrinhoPage carrinhoPage;

	@Before
	public void beforetest() {
		principalpage = new PrincipalPage(driver);
		carrinhoPage = new CarrinhoPage(driver);
	}

	@Test
	public void test() throws Exception {
		driver.navigate().to("http://automationpractice.com/index.php");
		principalpage.adicionarItem("Faded Short Sleeve T-shirts");
		carrinhoPage.tirarCarrinho("Faded Short Sleeve T-shirts");
	}
}
