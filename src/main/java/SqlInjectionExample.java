// ============================================================================
// INTENTIONALLY VULNERABLE CODE - DO NOT USE IN PRODUCTION
// ----------------------------------------------------------------------------
// This file is a SAST/security-scanner test fixture. It exists to exercise
// static-analysis tooling (e.g., Black Duck) by containing a known-bad
// pattern: SQL injection via string concatenation of untrusted input.
//
// Expected scanner finding: CWE-89 (SQL Injection).
//
// Do NOT copy this pattern. The secure form uses PreparedStatement with
// parameter binding - see the commented block at the bottom of the file.
// ============================================================================

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjectionExample {

    // VULNERABLE: concatenates user input directly into the SQL string.
    public static ResultSet findUserByName(Connection conn, String userName) throws Exception {
        Statement stmt = conn.createStatement();
        String sql = "SELECT id, email FROM users WHERE name = '" + userName + "'";
        return stmt.executeQuery(sql);
    }

    // Secure equivalent (for reference):
    //
    // public static ResultSet findUserByName(Connection conn, String userName) throws Exception {
    //     PreparedStatement ps = conn.prepareStatement(
    //         "SELECT id, email FROM users WHERE name = ?");
    //     ps.setString(1, userName);
    //     return ps.executeQuery();
    // }
}
