package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;


public class GroupDeleteTest extends TestBase {

    @Test
    public void testDeleteGroup() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returntoGroupPage();
    }

}