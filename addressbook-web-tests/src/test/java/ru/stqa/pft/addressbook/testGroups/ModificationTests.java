package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class ModificationTests extends TestBase {
  @Test
  public void testGroupModification(){
      app.getNavigationHelper().gotoGrouppage();
      app.getHelper().selectGroup();
    app.getHelper().initGroupModification();
    app.getHelper().fillgroupForm(new GroupData("test000", "testoo1", "test010"));
    app.getHelper().submitGroupModification();
    app.getHelper().returnToGroupPage();
  }

}
