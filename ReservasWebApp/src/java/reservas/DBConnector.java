package reservas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBConnector {
   

    private String PG_HOST;
    private String PG_DB;
    private String USER;
    private String PWD;

    /*private String PG_HOST="localhost";
    private String PG_DB="postgres";
    private String USER="postgres";
    private String PWD="miguel";*/
    
    Connection con = null;
    Statement stmt = null;

    public DBConnector( String PG_HOST, String PG_DB, String USER, String PWD) {
        this.PG_HOST=PG_HOST;
        this.PG_DB=PG_DB;
        this.USER=USER;
        this.PWD=PWD;
    }

    public void connect() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + PG_HOST + ":5432/" + PG_DB,
                    USER, PWD);

            stmt = con.createStatement();
            

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Problems setting the connection");
        }
    }

    public void disconnect() {    
        try {
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return stmt;
    }

}

