package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class DeletionTests extends TestBase {


  @Test
  public void testsGrouDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getHelper().isThereAgroup()) {
      app.getHelper().createGroup(new GroupData("test1", "test2", "test3"));
    }
    app.getHelper().selectGroup();
    app.getHelper().deleteSelectedGroups();
    app.getHelper().returnToGroupPage();
  }

}
