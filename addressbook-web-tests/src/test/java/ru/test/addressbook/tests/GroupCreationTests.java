package ru.test.addressbook.tests;

import org.testng.annotations.Test;
import ru.test.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void creationGroupTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
