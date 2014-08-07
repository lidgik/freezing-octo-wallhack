package com.bodejidi.freezing.octo.wallhack;

public class ContactDaoImpl implements ContactDao {
    public Contact save(Contact contact) {
        System.out.println("ContactDao.save: " + contact);
        contact.setId(1L);
        return contact; 
    }
}
