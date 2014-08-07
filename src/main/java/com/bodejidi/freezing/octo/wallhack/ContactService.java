package com.bodejidi.freezing.octo.wallhack;

public class ContactService {
    private ContactDao contactDao;

    public ContactService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public Contact save(Contact contact) {
        if(contact.getName() != null && contact.getName().trim().length() > 0) {
            return contactDao.save(contact);
        }
        return contact;
    }

}
