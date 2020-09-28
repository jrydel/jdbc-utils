package cz.jr.jdbcutils;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Jiří Rýdel
 * @created 2019/06/13
 */
public class ResultSetHandlerObject<T> implements ResultSetHandler<T> {

    private final Class<T> classType;

    public ResultSetHandlerObject(Class<T> classType) {
        this.classType = classType;
    }

    /**
     * Converts the first value from ResultSet into an Object.
     *
     * @param rs The ResultSet to handle.
     * @return First value from the ResultSet data. Null if ResultSet is empty.
     * @throws SQLException
     */
    @Override
    public T handle(ResultSet rs) throws SQLException {
        if (rs.next()) {
            return rs.getObject(1, classType);
        }
        return null;
    }
}
