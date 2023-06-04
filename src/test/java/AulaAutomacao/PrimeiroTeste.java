package AulaAutomacao;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {
	
	//Classe
	WebDriver driver; //Variavel
	

	@Before //Ele é executado antes de qualquer teste
	public void setUp() throws Exception {
		 
		//Peguei do stackOverflow porque nao estava funcionando
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		        // driver     fixo     nav    fixo       //Caminho do driver
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Instanciando o driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After // Ele é executado após qualquer teste
	public void tearDown() throws Exception {
		//Fechar a tela
		driver.quit();
		
	}

	@Test
	public void e2etreinamentos() {
		driver.get("https://ead.e2etreinamentos.com.br/");
		
		String titulo = driver.getTitle();
		// Verificar se o titulo da pagina esta igual ao texto abaixo
		assertEquals("E2E Treinamentos", titulo);
		
		
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com/");
		
		String titulo = driver.getTitle();
		
		assertEquals("Google", titulo);
	}
	
	@Test
	public void amazon() {
		driver.get("https://www.amazon.com.br/");
		
		String titulo = driver.getTitle();
		
		assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", titulo);

		
		
	}

}






/*

public class PrimeiroTeste {
	
	
	 * Modificador de acesso
	 * Public - todas as class
	 * Protectrd - Mesmo ou herdeiras em pacotes diferentes
	 * Default - Somente o mesmo pacote
	 * Private - Somente a mesma class
	 * 
	 * 
	 * Tipo de retorno
	 * Void - Vazio
	 * Ou qualque Class ou atributo exempli int, double.....
	 * 
	
	
	//Metodos
	public void mensagem() {
		System.out.println("Quer mais? Torne-se mais!!");
	}
	
	public void outraMensagem (String mensagem) {
		System.out.println(mensagem);
	}
	
}
*/
