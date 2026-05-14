import java.sql.*;

public class PerfectCode {
  Connection getCon(String url) throws SQLException {
    return DriverManager.getConnection(url,
        /*username*/ "leroy",
        /*password*/ "jenkins");
  }
}
