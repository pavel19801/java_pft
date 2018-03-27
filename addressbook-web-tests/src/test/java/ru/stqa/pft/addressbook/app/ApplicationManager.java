package ru.stqa.pft.addressbook.app;

import Session.SessionHelperGroupAndContact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class ApplicationManager {
    WebDriver wd;

    private NavigationHelper navigationHelper;
    private ContactHelper ContactHelper;
    public SessionHelperGroupAndContact sessionHelperGroupAndContact;
    private String browser;

    public ApplicationManager (String browser){
        this.browser = browser;
    }
    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

       wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
   wd.get("http://localhost/addressbook/");
        ContactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelperGroupAndContact = new SessionHelperGroupAndContact(wd);
        sessionHelperGroupAndContact.login("user", "pass", By.xpath("//form[@id='LoginForm']/input[3]"), "admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public ContactHelper getHelper() {
        return ContactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
