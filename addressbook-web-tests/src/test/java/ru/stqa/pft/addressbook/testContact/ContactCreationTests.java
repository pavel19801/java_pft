package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.testGroups.TestBase;
import ru.stqa.pft.addressbook.module.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testsContactCreation() {

        app.getHelper().initContactCreation();
        app.getHelper().fillContactForm(new ContactData("pavel", "Sidorenko", "777", "sidorenko-p@inbox.ru", "Test1"), true);
        app.getHelper().submitContactCreate();
    }

}
