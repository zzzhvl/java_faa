package ru.zzzhvl.faa.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zzzhvl.faa.adressbook.model.ContactData;

import java.util.List;

public class ContactDeleteTests extends TestBase {

    @Test
    public void testContactDelete() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("testName", "testLastname", "testCity 22", "89098887744", "test@mail.com", "test1"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteContact();
        app.getContactHelper().confirmContactDeletion();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }

}
