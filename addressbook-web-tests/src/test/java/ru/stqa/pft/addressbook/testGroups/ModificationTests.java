package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class ModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getHelper().isThereAgroup()) {
            app.getHelper().createGroup(new GroupData("test1", "test2", "test3"));}
        app.getHelper().selectGroup();
        app.getHelper().initGroupModification();
        app.getHelper().fillgroupForm(new GroupData("test000", "testoo1", "test010"));
        app.getHelper().submitGroupModification();
        app.getHelper().returnToGroupPage();
    }

}
