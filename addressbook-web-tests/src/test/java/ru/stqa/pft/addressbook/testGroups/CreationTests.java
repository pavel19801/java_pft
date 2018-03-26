package ru.stqa.pft.addressbook.testGroups;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class CreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGrouppage();
        app.getHelper().initGroupCreation();
        app.getHelper().fillgroupForm(new GroupData("test1", "test2", "test3"));
        app.getHelper().submitGroupCreation();
        app.getHelper().returnToGroupPage();
    }

}
