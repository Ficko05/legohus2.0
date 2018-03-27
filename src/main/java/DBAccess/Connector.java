package DBAccess;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            MysqlDataSource source = new MysqlDataSource();
            source.setServerName("159.89.103.5");
            source.setPort(3306);
            source.setDatabaseName("useradmin");
            source.setUser("Ficko");
            source.setPassword("Beograd05");
            singleton = source.getConnection();
        }

        return singleton;
    }

}
