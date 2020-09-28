package cz.jr.jdbcutils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Jiří Rýdel
 * @created 2019/06/13
 */
public class ResultSetHandlerMap implements ResultSetHandler<Map<String, Object>> {

    /**
     * Converts ResultSet into a Map of Objects.
     *
     * @param rs The ResultSet to handle.
     * @return A Map of objects initialized with ResultSet data.
     * @throws SQLException
     */
    @Override
    public Map<String, Object> handle(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        Map<String, Object> map = new LinkedHashMap<>();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            String name = metaData.getColumnLabel(i);
            map.put(name, rs.getObject(i));
        }
        return map;
    }
}