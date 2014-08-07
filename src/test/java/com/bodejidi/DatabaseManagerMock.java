package com.bodejidi;

import com.bodejidi.freezing.octo.wallhack.DatabaseManager;

public class DatabaseManagerMock implements DatabaseManager {
    public int executeUpdateShouldReturn = 0;
    public String executeUpdateParam;
    public Object[] executeUpdateParam2;
    public int executeUpdate(String sql, Object... params) {
        executeUpdateParam = sql;
        executeUpdateParam2 = params;
        return executeUpdateShouldReturn;
    }
}
