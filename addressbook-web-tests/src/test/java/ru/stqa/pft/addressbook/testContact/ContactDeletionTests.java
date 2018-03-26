package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.testGroups.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testsContactDeletion() {
        app.getHelper().gotoEditFormContact();
        app.getHelper().deleteContactAndBackMain();
    }

}
