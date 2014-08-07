package com.bodejidi;

import com.bodejidi.freezing.octo.wallhack.ContactDao;
import com.bodejidi.freezing.octo.wallhack.Contact;

public class MockContactDao implements ContactDao {
    public Boolean saveHasInvoked = false;
    public Contact save(Contact contact) {
        saveHasInvoked = true;
        return contact;
    }
}
