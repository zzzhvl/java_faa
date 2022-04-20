package ru.zzzhvl.faa.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupCreateTests extends TestBase {

    @Test
    public void testGroupCreate() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        GroupData group = new GroupData("test1", "test2", "test3");
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);

        int max = 0;
        for (GroupData g : after) {
          if (g.getId() > max) {
              max = g.getId();
          }
        }
        group.setId(max);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
