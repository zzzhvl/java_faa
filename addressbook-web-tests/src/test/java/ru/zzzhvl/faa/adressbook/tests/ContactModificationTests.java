package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void testModificationContact() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("testName", "testLastname", "testCity 22", "89098887744", "test@mail.com", "test1"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(0);
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("testName1", "testLastname2", "testCity 33", "89098887755", "test@mail.ru", null), false);
        app.getContactHelper().confirmModification();
        app.getContactHelper().returntoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
    }
}
