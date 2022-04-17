package ru.zzzhvl.faa.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

public class ContactDeleteTests extends TestBase {

    @Test
    public void testContactDelete() {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("testName", "testLastname", "testCity 22", "89098887744", "test@mail.com", "test1"));
        }
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteContact();
        app.getContactHelper().confirmContactDeletion();
        app.getNavigationHelper().gotoHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }

}
