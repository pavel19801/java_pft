package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.testGroups.TestBase;
import ru.stqa.pft.addressbook.module.ContactData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {
        if (!app.getHelper().isThereAcontact()) {
            app.getHelper().createContact(new ContactData("pavel", "Sidorenko", "777", "sidorenko-p@inbox.ru", "test1"));
        }
        app.getHelper().selectContactModificaion();
        app.getHelper().fillContactForm(new ContactData("vovan", "vasiliev", "murzick", "vovan@inbox.ru", null), false);
        app.getHelper().submitContactModification();
        app.getHelper().returnHomePage();
    }
}
