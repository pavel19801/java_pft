package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.testGroups.TestBase;
import ru.stqa.pft.addressbook.module.ContactData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {
        app.getHelper().selectContactModificaion();
        app.getHelper().modifiyContactModification();
        app.getHelper().fillContactForm(new ContactData("vovan", "vasiliev", "murzick", "vovan@inbox.ru", null), false);
        app.getHelper().submitContactModification();
        app.getHelper().returnHomePage();
    }
}
