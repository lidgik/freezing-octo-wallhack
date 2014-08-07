package com.bodejidi;

import com.bodejidi.unit.TestCase;
import com.bodejidi.freezing.octo.wallhack.ContactService;
import com.bodejidi.freezing.octo.wallhack.Contact;

public class ContactServiceTest extends TestCase {
    
    MockContactDao contactDao = new MockContactDao();
    ContactService contactService = new ContactService(contactDao);

    public void test_username_is_empty_should_not_save() {
        contactService.save(createContactWithUsername(""));

        assertFalse(contactDao.saveHasInvoked);
    }
    
    public void test_username_is_blank_should_not_save() {
        contactService.save(createContactWithUsername("    "));

        assertFalse(contactDao.saveHasInvoked);
    }

    private Contact createContactWithUsername(String username) {
        Contact contact = new Contact();

        contact.setName(username);
        return contact;
    }
}
