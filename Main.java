package testesFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://web1.qa.sambatech.com:10000/auth/login");
	    driver.manage().window().maximize();
	
	    driver.findElement(By.name("j_username")).sendKeys("avaliacao_qa_samba@sambatech.com.br");  
	    driver.findElement(By.name("j_password")).sendKeys("123456");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    boolean i = driver.getPageSource().contains("Email ou senha incorretos.");
        
	    System.out.println("Ocorreu falha no login? "+(i?"Sim":"Não"));
	    driver.close();
	}
}