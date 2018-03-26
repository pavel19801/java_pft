package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class SessionHelperGroupAndContact extends HelperBase {

    public SessionHelperGroupAndContact(WebDriver wd) {
        super (wd);
    }

    public void login(String user, String pass, By xpath, String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        wd.findElement(xpath).click();
    }

    }

