package com.bodejidi;

import com.bodejidi.freezing.octo.wallhack.DatabaseManager;

public class DatabaseManagerMock implements DatabaseManager {
    public int executeUpdateShouldReturn = 0;
    public String executeUpdateParam;
    public int executeUpdate(String sql) {
        executeUpdateParam = sql;
        return executeUpdateShouldReturn;
    }
}
