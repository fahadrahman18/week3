package week3.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Launch the URL  https://www.ajio.com/
		driver.get(" https://www.ajio.com/");
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		
		
		//To the left  of the screen under " Gender" click the "Men"
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        
        Thread.sleep(7000);
        
        //Under "Category" click "Fashion Bags"
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
        
        Thread.sleep(6000);
        //Print the count of the items Found. 
        
        String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
        System.out.println(count);
        
        // Get the list of brand of the products displayed in the page and print the list.
        
        List<WebElement> brandlist = driver.findElements(By.xpath("//div[@class='brand']"));
        
        System.out.println("Total number of brands in the page: " + brandlist.size());
        System.out.println("Brand Names below ");
        
        for (WebElement webElement1 : brandlist) {
        	
        	System.out.println(webElement1.getText());
			
		}
        
        //Get the list of names of the bags and print it
        
        List<WebElement> productnamelist = driver.findElements(By.xpath("//div[@class='nameCls']")); 
        
        System.out.println("Total number of products in the page:" + productnamelist.size());
        System.out.println("Product Names below ");
       
        for (WebElement webElement2 : productnamelist) {
        	
        	System.out.println(webElement2.getText());
			
		}
        
        
	}

}
