package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

    @Test
    public void testModificationContact() {
        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("testName1", "testLastname2", "testCity 33", "89098887755", "test@mail.ru"));
        app.getContactHelper().confirmModification();
        app.getContactHelper().returntoHomePage();
    }
}
