package AulaAutomacaoRefatorando;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTesteRefatorado {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	

	@Before //Ele é executado antes de qualquer teste
	public void setUp() throws Exception {
		 metodos.abrirNavegador("https://www.amazon.com.br");
		
	}

	@After // Ele é executado após qualquer teste
	public void tearDown() throws Exception {
		metodos.fecharNavegador();	
	}
	
	@Test
	public void amazon() throws IOException {
		metodos.evidenciarTeste("CT01 - Validando titulo");
		metodos.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");
		
	}
	@Test
	public void buscarProduto() throws IOException {
		metodos.buscarProduto(pesquisar, "Iphone 14");
		metodos.evidenciarTeste("CT02 - Buscando produto");
	}

}
