package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.ContactData;
import ru.stqa.pft.addressbook.testGroups.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testsContactDeletion() {
        if (!app.getHelper().isThereAcontact()) {
         app.getHelper().createContact(new ContactData("pavel", "Sidorenko", "777", "sidorenko-p@inbox.ru", "test1"));
      }
        app.getHelper().selectContact();
        app.getHelper().deleteContactAndBackMain();
        app.getHelper().deleteAlert();
    }

}