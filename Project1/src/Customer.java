//Elijah Ramos
//Model.java , View.java , Controller.java
//Contains the main method that instantiates the model, view, and controller objects.

import java.sql.*;

public class Customer{

    private static Customer singletonInstance;
    private static Connection con;
    static Controller c;
    
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String DB_URL = "jdbc:mysql://cecs-db01.coe.csulb.edu/cecs323sec5g9";
        String USER = "cecs323sec5n12";
        String PASS = "uef7oo";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        con.setAutoCommit(false);
        
         //Initialize the model, which represents the Customer and its attributes.
        Model m = new Model();
        
        //Initialize the view, which manages the GUI.
        View v= new View();
        
        //Initialize the controller, which acts as an intermediary between
        //the model and the view in order to carry out the necessary calculations.
        c = new Controller(v, m);
        v.registerListener(c);
      }  
    
    public static Customer getInstance() throws SQLException, ClassNotFoundException
    {
        if (singletonInstance == null)
            singletonInstance = new Customer();
        
        return singletonInstance;
    }
}