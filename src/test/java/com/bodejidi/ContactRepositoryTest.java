package com.bodejidi;

import com.bodejidi.freezing.octo.wallhack.ContactRepository;
import com.bodejidi.unit.TestCase;

public class ContactRepositoryTest extends TestCase {
    public void test_delete_by_id() {
        DatabaseManagerMock db = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(db);
        contactRepository.deleteById(1L);
        assertEquals("DELETE FROM contact WHERE id=1", db.executeUpdateParam);
    }
}

