package cz.jr.jdbcutils;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jiří Rýdel on 2020/10/07
 */
public abstract class ResultSetHandlerRowIterator implements ResultSetHandler<Void> {

    @Override
    public Void handle(ResultSet rs) throws SQLException {
        while (rs.next()) {
            handleRow(rs);
        }
        return null;
    }

    public abstract void handleRow(ResultSet row) throws SQLException;
}
