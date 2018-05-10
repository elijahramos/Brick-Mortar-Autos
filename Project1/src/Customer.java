//Elijah Ramos
//Model.java , View.java , Controller.java
//Contains the main method that instantiates the model, view, and controller objects.

public class Customer {
    public static void main(String[] args) {
        System.out.println("Starting Program");
        
        //Initialize the model, which represents the Customer and its attributes.
        Model m = new Model();
        
        //Initialize the view, which manages the GUI.
        View v= new View();
        
        //Initialize the controller, which acts as an intermediary between
        //the model and the view in order to carry out the necessary calculations.
        Controller c = new Controller(v, m);
        v.registerListener(c);
    }
}
