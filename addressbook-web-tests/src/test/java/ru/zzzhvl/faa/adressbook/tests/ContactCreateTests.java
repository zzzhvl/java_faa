package ru.zzzhvl.faa.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

public class ContactCreateTests extends TestBase {

    @Test
    public void testContactCreate(){
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("testName", "testLastname", "testCity 22", "89098887744", "test@mail.com", "test1"), true);
        app.getContactHelper().confirmAddition();
        app.getContactHelper().returntoHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

}
