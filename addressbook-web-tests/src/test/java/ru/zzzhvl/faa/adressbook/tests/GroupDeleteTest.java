package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;


public class GroupDeleteTest extends TestBase {

    @Test
    public void testDeleteGroup() throws Exception {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returntoGroupPage();
    }

}