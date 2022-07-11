package thith2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface StoreBooks {
    public int insert(StoreBooks book) throws SQLException;
    public List<StoreBooks> getAll() throws SQLException;
}