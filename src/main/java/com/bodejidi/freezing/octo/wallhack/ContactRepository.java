package com.bodejidi.freezing.octo.wallhack;

public class ContactRepository {
    DatabaseManager db;

    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }

    public void deleteById(Long id) {
        db.executeUpdate("DELETE FROM contact WHERE id=" + id);
    }
}
