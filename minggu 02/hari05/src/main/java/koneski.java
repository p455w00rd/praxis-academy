import java.sql.*;

public class koneski {
    public static void main( String[] args ) throws SQLException {
        String query = "SELECT film.id, film.film FROM orang as orang INNER JOIN sewa as sewa ON orang.id = sewa.id_orang INNER JOIN film as film ON sewa.id_film = film.id WHERE orang.id = 1";
        //create connection for a server installed in localhost, with a user "root" with no password
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/sewa", "root", "p455w00rd")) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                //execute query
                try (ResultSet rs = stmt.executeQuery(query)) {
                    //position result to first
                    System.out.println("Janet Jones rents:");
                    while (rs.next())
                    {
                        Integer nama = rs.getInt("id");
                        String film = rs.getString("film");
                        // print the results
                        System.out.format("%s, %s,\n", nama, film);
                    }
                    stmt.close();
                }
            }
        }
    }
}
