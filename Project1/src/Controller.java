//Elijah Ramos
//Customer.java, Model.java, View.java
//Creates a Controller object that carries out actions in the GUI
//Acts as an intermediary between the model and view

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

//Handles events in the GUI
public class Controller implements ActionListener {
    View view;
    Model model;
    
    Controller(View a, Model b)
    {
        view = a;
        model = b;
    }
    
    //Take customer info in the GUI and store into model
    public void actionPerformed(ActionEvent e) {
	String c = e.getActionCommand();
        
        if(c.equals("Go"))
        {
            if(view.custBox.isSelected())
            {
                view.custMenu();
                view.registerListener2(Customer.c);
            }
            if(view.dataBox.isSelected())
            {
                view.queries();
                view.registerListener3(Customer.c);
            }
        }
        
        if(c.equals("Submit Information")) //Check if submit button has been pressed
        {
            //Get data from JTextFields
            model.setDate(Integer.parseInt(view.textField2.getText()),
                            Integer.parseInt(view.textField1.getText()) - 1,
                            Integer.parseInt(view.textField3.getText()));
            model.setFirstName(view.textField4.getText());
            model.setLastName(view.textField5.getText());
            model.setSpouseFirstName(view.textField6.getText());
            model.setSpouseLastName(view.textField7.getText());
            model.setSSN(Integer.parseInt(view.textField8.getText()));
            model.setSpouseSSN(Integer.parseInt(view.textField9.getText()));
            model.setMonthlyIncome(Double.parseDouble(view.textField10.getText()));
            model.setMonthlyDebt(Double.parseDouble(view.textField11.getText()));
            model.setSpouseMonthlyIncome(Double.parseDouble(view.textField12.getText()));
            model.setSpouseMonthlyDebt(Double.parseDouble(view.textField13.getText()));
            model.setCarCost(Double.parseDouble(view.textField14.getText()));
            model.setTradeInValue(Double.parseDouble(view.textField15.getText()));
            model.setDownPayment(Double.parseDouble(view.textField16.getText()));
            model.setYearsPaid(Integer.parseInt(view.textField17.getText()));
            model.setCreditScore(Double.parseDouble(view.textField18.getText()));
            model.setSpouseCreditScore(Double.parseDouble(view.textField19.getText()));
            
            //Check if the customer's and spouse's average credit score is above 500
            if(model.averageCreditScore() >= 500) //if above 500, loan request is accepted
            {
                //Calculate all the values to be displayed in the results window
                double combinedMonthlyIncome = model.combinedMonthlyIncome();
                double combinedLoanPayments = model.combinedLoanPayments();
                double ratio = model.ratio();
                double annualInterest = model.annualInterest();
                double loanAmount = model.loanAmount();
                double monthlyPayment = model.monthlyPayment();
                String dateOfLastPayment = model.dateOfLastPayment();
                
                view.update(combinedMonthlyIncome,
                            combinedLoanPayments,
                            ratio,
                            annualInterest,
                            loanAmount,
                            monthlyPayment,
                            dateOfLastPayment);
            }
            else //Display window rejecting loan request
            {
                view.error();
            }
        }
        
        if(c.equals("Display"))
        {
            if(view.box1.isSelected())
            {
                view.error();
            }
        }
    }
}
