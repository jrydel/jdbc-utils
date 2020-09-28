package cz.jr.jdbcutils;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Jiří Rýdel
 * @created 2019/06/13
 */
public interface ResultSetHandler<T> {

    /**
     * Converts ResultSet into an Object.
     *
     * @param rs The ResultSet to handle.
     * @return An Object initialized with ResultSet data.
     * @throws SQLException
     */
    T handle(ResultSet rs) throws SQLException;
}
