package ru.stqa.pft.addressbook.testGroups;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;
import ru.stqa.pft.addressbook.testGroups.TestBase;

public class CreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getHelper().createGroup(new GroupData("test1", "test2", "test3"));
    }

}
