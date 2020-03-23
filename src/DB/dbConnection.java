package DB;

import java.sql.DriverManager;
import java.sql.*;

public class DbConnection {

    private String nomeDb;
    private String driver;
    private String urlDb;
    private ResultSet rs;
    private Connection conn;
    private String query;
    private ResultSetMetaData rsmd;

    public Connection startConnection() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String connectionUrl = "jdbc:sqlite:src/DB/DbApp.db";
            conn = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: " + cE.toString());
        }
        return conn;
    }

    public void insert(String genere, String piattaforma, int age, String descrizione, String datauscita, int disponibile, int quantita, String nome, double prezzo) throws SQLException {
        conn = startConnection();
        query = "INSERT INTO giochi (genere, piattaforma,age,descrizione,datauscita,disponibile,quantita,nome, prezzo) VALUES ('" + genere + "','" + piattaforma + "','" + age + "','" + descrizione + "','" + datauscita + "','" + disponibile + "','" + quantita + "','" + nome + "', '" + prezzo + "')";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
    }

    public void select(String nome, String piattaforma) throws SQLException {
        conn = startConnection();
        query = "SELECT * FROM giochi WHERE nome ='" + nome + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString("nome"));
            System.out.println(rs.getString ("piattaforma"));
            System.out.println(rs.getInt ("age"));
            System.out.println(rs.getString ("descrizione"));
        }
        stmt.close();
        conn.close();

    }

    public void inserimentoUser(String username, String password, String tipo) throws SQLException {
        query = "INSERT INTO users(username,password,tipo) VALUES ('" + username + "' ,'" + password + "','" + tipo + "')";
        Statement stmt = startConnection().createStatement();
        stmt.executeUpdate(query);
        System.out.println("dati aggiunti");
        stmt.close();

    }

    public void selectUser() throws SQLException {
        try ( Connection connection = this.startConnection()) {

            query = "SELECT * FROM users";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("username") + " " + rs.getString("password") + " " + rs.getString("tipo"));

            }

        } catch (Exception ex) {
        }

    }

    public void delete(String query) {
        query = "";
    }
    
    public void update (int ID,String nome, double prezzo) throws SQLException{
        conn = startConnection();
        query = "UPDATE giochi SET nome ='"+nome+"' && SET prezzo = '"+prezzo+"' WHERE ID = '"+ID+"'";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
    }

    public String getNomeDb() {
        return nomeDb;
    }

    public void setNomeDb(String nomeDb) {
        this.nomeDb = nomeDb;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrlDb() {
        return urlDb;
    }

    public void setUrlDb(String urlDb) {
        this.urlDb = urlDb;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ResultSetMetaData getRsmd() {
        return rsmd;
    }

    public void setRsmd(ResultSetMetaData rsmd) {
        this.rsmd = rsmd;
    }

    public static void main(String[] args) {

        try {
            DbConnection dbConn = new DbConnection();
            dbConn.update(1, "darksouls2", 30.99 );
            dbConn.select("darksouls2", "xbox");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
