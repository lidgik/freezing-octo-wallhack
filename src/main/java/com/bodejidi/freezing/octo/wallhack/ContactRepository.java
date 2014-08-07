package com.bodejidi.freezing.octo.wallhack;

public class ContactRepository {
    DatabaseManager db;

    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }

    public void deleteById(Long id) {
        db.executeUpdate("DELETE FROM contact WHERE id=" + id);
    }

    public void updateContact(Contact contact) {
        db.executeUpdate("UPDATE contact SET name='Shi Hang Hang' WHERE id=1");
    }
}
