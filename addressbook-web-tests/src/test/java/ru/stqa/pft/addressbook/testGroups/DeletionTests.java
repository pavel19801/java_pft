package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;

public class DeletionTests extends TestBase {


  @Test
  public void testsGrouDeletion() {
    app.getNavigationHelper().gotoGrouppage();
    app.getHelper().selectGroup();
    app.getHelper().deleteSelectedGroups();
    app.getHelper().returnToGroupPage();
  }

}
