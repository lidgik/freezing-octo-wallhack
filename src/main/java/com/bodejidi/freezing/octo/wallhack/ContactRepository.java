package com.bodejidi.freezing.octo.wallhack;

public class ContactRepository {
    DatabaseManager db;

    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }

    public void deleteById(Long id) {
        db.executeUpdate("DELETE FROM contact WHERE id=" + id);
    }

    public Object[] updateContact(Contact contact) {
        Long id = contact.getId();
        String name = contact.getName();
//        db.executeUpdate("UPDATE contact SET name='" + "s " + "' WHERE id=" + id);
        return new Object[]{id, name};
    }
}
