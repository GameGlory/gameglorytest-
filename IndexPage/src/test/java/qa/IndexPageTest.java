package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import qa.base.Base;
import qa.base.IndexPageBase;

/**
 * Created by ben on 2/19/2016.
 */
public class IndexPageTest {

    Base        base                            =      null;
    String      join_buttton                 =      "#homepage_signup_module_button";
    String      username_text_box            =      "#gamer_signup_popup_form_username_box";
    String      password_test_box            =      "#gamer_signup_popup_form_password_box";
    String      email_address_text_box       =      "#gamer_signup_popup_form_email_box";
    String      birhday_date_box             =      "#gamer_signup_popup_form_birthday_box";
    String      xbox_username_text_box       =      "#gamer_signup_popup_form_xbox_tag_box";
    String      psn_username_text_box        =      "#gamer_signup_popup_form_psn_tag_box";
    String      signup_button                =      "#gamer_signu_popup_form_submit_button";

@Parameters({"username","password","xbox_id","psn_id","email","birthday"})
    @Test
    public void signUp(String username, String password , String  xbox_id , String psn_id , String email , String birthday){

        try {

            this.base = new IndexPageBase();
            this.base.wd.get(this.base.host);

            this.base.click(this.join_buttton);
            this.base.type(this.username_text_box, username);
            this.base.type(this.password_test_box, password);
            this.base.type(this.email_address_text_box,email);
            this.base.type(this.birhday_date_box, birthday);
            this.base.type(this.xbox_username_text_box, xbox_id);
            this.base.type(this.psn_username_text_box, psn_id);
            this.base.click(this.signup_button);

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

}
