package qa.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
/**
 * Created by ben on 2/6/2016.
 */
public class Base {

    public    String        host    =       "http://96.56.6.219/";
    public    WebDriver     wd      =       null;


    public Base(){

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");
        this.wd = new ChromeDriver();

    }
    /*
    @Parameters({"cbrome"})
    @BeforeClass
    public void setUp(String browser){

        if(browser.equals("chrome"))
            this.wd = new ChromeDriver();


    }
*/
    public void click(String selector){

        WebElement element = null;
        try{

        element =  this.wd.findElement(By.cssSelector(selector));
        element.click();

    }catch(Exception ex){
        ex.printStackTrace();
    }
}
    public void type(String selector, String words){

        WebElement element = null;
        try{

            element =  this.wd.findElement(By.cssSelector(selector));
            element.sendKeys(words);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
