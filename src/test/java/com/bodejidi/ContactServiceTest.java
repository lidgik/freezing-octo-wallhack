package com.bodejidi;

import com.bodejidi.unit.TestCase;
import com.bodejidi.freezing.octo.wallhack.ContactService;
import com.bodejidi.freezing.octo.wallhack.Contact;

public class ContactServiceTest extends TestCase {
    public void test_username_is_empty_should_not_save() {
        MockContactDao contactDao = new MockContactDao();
        ContactService contactService = new ContactService(contactDao);
        Contact contact = new Contact();

        contact.setName("");
        contactService.save(contact);

        assertFalse(contactDao.saveHasInvoked);
    }
    
    public void test_username_is_blank_should_not_save() {
        MockContactDao contactDao = new MockContactDao();
        ContactService contactService = new ContactService(contactDao);
        Contact contact = new Contact();

        contact.setName("    ");
        contactService.save(contact);

        assertFalse(contactDao.saveHasInvoked);
    }

}
