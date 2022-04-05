package ru.zzzhvl.faa.adressbook;

import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase {

    @Test
    public void testGroupCreate() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returntoGroupPage();
    }

}
