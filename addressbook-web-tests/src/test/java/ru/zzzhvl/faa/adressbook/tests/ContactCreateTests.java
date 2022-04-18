package ru.zzzhvl.faa.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

import java.util.List;

public class ContactCreateTests extends TestBase {

    @Test
    public void testContactCreate(){
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("testName", "testLastname", "testCity 22", "89098887744", "test@mail.com", "test1"), true);
        app.getContactHelper().confirmAddition();
        app.getContactHelper().returntoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
