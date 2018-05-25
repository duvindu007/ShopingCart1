package database;
import java.sql.*;
/*
*

*/
public class DB_Conn {
private String database="ShopingCartDB", username = "sa", password = "123";
private Connection con;
public Connection getConnection() throws SQLException, ClassNotFoundException {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ShopingCartDB;user=sa;password=123");
 
return con;
}
public String getDatabase() {
return database;
}
public void setDatabase(String database) {
this.database = database;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
}