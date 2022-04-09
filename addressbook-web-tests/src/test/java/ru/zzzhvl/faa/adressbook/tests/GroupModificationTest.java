package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.GroupData;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", null, "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returntoGroupPage();
    }
}
