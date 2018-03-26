package ru.stqa.pft.addressbook.app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;
import ru.stqa.pft.addressbook.module.ContactData;
import ru.stqa.pft.addressbook.module.GroupData;


/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void returnHomePage() {
    click(By.linkText("home page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillgroupForm(GroupData groupData) {
    type("group_name", groupData.getName());
    type("group_header", groupData.getHeader());
    type("group_footer", groupData.getFooter());
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

    public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void deleteContactAndBackMain() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void gotoEditFormContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }

  public void modifiyContactModification(){
    click(By.name("modifiy"));
  }
  public void submitContactModification() {click(By.xpath("//div[@id='content']/form[1]/input[22]"));}
  public void submitContactCreate() {click(By.xpath("//div[@id='content']/form/input[1]"));}
  public void selectContactModificaion()
  {
    click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[7]/a/img"));
  }
}
