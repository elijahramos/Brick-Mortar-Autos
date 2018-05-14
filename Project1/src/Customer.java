//Elijah Ramos
//Model.java , View.java , Controller.java
//Contains the main method that instantiates the model, view, and controller objects.
import java.sql.*;
import java.util.Scanner;

public class Customer {
    static Controller c;
    static String USER;
    static String PASS;
    static String DBNAME;
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/";
    
    public static void main(String[] args) {
        System.out.println("Starting Program");
        Scanner in = new Scanner(System.in);
        System.out.print("Name of the database (not the user account): ");
        DBNAME = in.nextLine();
        System.out.print("Database user name: ");
        USER = in.nextLine();
        System.out.print("Database password: ");
        PASS = in.nextLine();
        //Constructing the database URL connection string
        DB_URL = DB_URL + DBNAME + ";user="+ USER + ";password=" + PASS;
        Connection conn = null; //initialize the connection
        Statement stmt = null;  //initialize the statement that we're using
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL);
        }
        catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
        //end finally try
                                      }
                   }
        //Initialize the model, which represents the Customer and its attributes.
        Model m = new Model();
        
        //Initialize the view, which manages the GUI.
        View v= new View();
        
        //Initialize the controller, which acts as an intermediary between
        //the model and the view in order to carry out the necessary calculations.
        c = new Controller(v, m);
        v.registerListener(c);
    }
}
