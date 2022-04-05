package ru.zzzhvl.faa.adressbook;

import org.testng.annotations.Test;


public class GroupDeleteTest extends TestBase {

    @Test
    public void testDeleteGroup() throws Exception {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returntoGroupPage();
    }

}