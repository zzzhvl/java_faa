package ru.zzzhvl.faa.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.GroupData;

public class GroupCreateTests extends TestBase {

    @Test
    public void testGroupCreate() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
    }

}
