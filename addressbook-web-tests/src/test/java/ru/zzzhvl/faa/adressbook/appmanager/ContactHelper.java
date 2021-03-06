package ru.zzzhvl.faa.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.zzzhvl.faa.adressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

import static ru.zzzhvl.faa.adressbook.model.ContactData.getGroup;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void returntoHomePage() {
        click(By.linkText("home page"));
    }

    public void addNewContact() {
        click(By.linkText("add new"));
    }

    public void editContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void confirmAddition() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(getGroup());
        } else Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

    public void selectContact(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void confirmContactDeletion() {
        allertAccept();
    }

    public void confirmModification() {
        click(By.xpath("//div[@id='content']/form/input[22]"));
    }

    public void createContact(ContactData contact) {
        addNewContact();
        fillContactForm(contact, true);
        confirmAddition();
        returntoHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = driver.findElements(By.name("selected[]"));
        for (WebElement element : elements) {
            String name = element.getText();
            ContactData contact = new ContactData(name, null, null, null, null, null);
            contacts.add(contact);
        }
        return contacts;
    }
}
