import java.sql.*;
public class PerfectCodeNoNotes {
  Connection getCon(String url) throws SQLException {
    return DriverManager.getConnection(url,
        /*username*/ "leroy",
        /*password*/ "jenkins");
  }
}
