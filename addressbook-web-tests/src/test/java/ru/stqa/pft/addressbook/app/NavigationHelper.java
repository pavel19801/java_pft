package ru.stqa.pft.addressbook.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super (wd);
    }

    public void gotoGrouppage() {
        click(By.linkText("groups"));
    }
}
