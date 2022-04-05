package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.GroupData;

public class GroupCreateTest extends TestBase {

    @Test
    public void testGroupCreate() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returntoGroupPage();
    }

}
