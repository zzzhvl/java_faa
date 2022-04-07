package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

public class ContactCreateTest extends TestBase {

    @Test
    public void testContactCreate(){
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("testName", "testLastname", "testCity 22", "89098887744", "test@mail.com"));
        app.getContactHelper().confirmAddition();
        app.getContactHelper().returntoHomePage();
    }

}
