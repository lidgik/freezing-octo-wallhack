package com.bodejidi;

import com.bodejidi.freezing.octo.wallhack.ContactRepository;
import com.bodejidi.freezing.octo.wallhack.Contact;
import com.bodejidi.unit.TestCase;

public class ContactRepositoryTest extends TestCase {
    public void test_delete_by_id() {
        DatabaseManagerMock db = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(db);
        contactRepository.deleteById(1L);
        assertEquals("DELETE FROM contact WHERE id=1", db.executeUpdateParam);
    }

    public void test_update_contact() {
        DatabaseManagerMock db = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(db);
        Contact contact = new Contact();
        contact.setId(1L);
        contact.setName("Shi Hang Hang");
        
        contactRepository.updateContact(contact);
        assertArrayEquals(new Object[]{1L,"Shi Hang Hang"}, contactRepository.updateContact(contact));
//        assertEquals("UPDATE contact SET name='Shi Hang Hang' WHERE id=1", db.executeUpdateParam);
    }
}

