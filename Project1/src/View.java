//Elijah Ramos
//Customer.Java, Model.java, Controller.java
//Creates a View object that handles the GUI
//Contains methods that creates and modifies the GUI

import java.awt.Component;
import javax.swing.*;

public class View extends JFrame {
    //Initialize GUI componenets
    JFrame frame;
    JFrame result;
    JPanel contentPane;
    JLabel output1;
    JLabel output2;
    JLabel output3;
    JLabel output4;
    JLabel output5;
    JLabel output6;
    JLabel output7;
    JButton submit;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField7;
    JTextField textField8;
    JTextField textField9;
    JTextField textField10;
    JTextField textField11;
    JTextField textField12;
    JTextField textField13;
    JTextField textField14;
    JTextField textField15;
    JTextField textField16;
    JTextField textField17;
    JTextField textField18;
    JTextField textField19;
    
    View()
    {
        //Create and set up the window.
        frame = new JFrame("Auto Loan");
        SpringLayout layout = new SpringLayout();
        
        //Set up the content pane.
        contentPane = new JPanel(layout);
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and add the components.
        //Each textField# contains one component of the Customer's input
        /* textField#:
        1: Month
        2: Day
        3: Year
        4: First Name
        5: Last Name
        6: Spouse First Name
        7: Spouse Last Name
        8: SSN
        9: Spouse SSN
        10: Self Monthly Income
        11: Self Monthly Debt
        12: Spouse Monthly Income
        13: Spouse Monthly Debt
        14: Cost of Car
        15: Trade in Value
        16: Down payment of new car
        17: Number of years loan is repaid
        18: Credit Score
        19: Spouse Credit Score
        */
        
        //Today's Date
        JLabel date = new JLabel("Today's Date: ");
        textField1 = new JTextField("MM", 5);
        textField2 = new JTextField("DD", 5);
        textField3 = new JTextField("YYYY", 5);
        
        //First and Last Name
        JLabel name = new JLabel("Full Name: ");
        textField4 = new JTextField("First", 5);
        textField5 = new JTextField("Last", 5);
        
        //Spouse First and Last Name
        JLabel spouseName = new JLabel("Spouse Full Name: ");
        textField6 = new JTextField("First", 5);
        textField7 = new JTextField("Last", 5);
        
        //SSN
        JLabel ssn = new JLabel("Social Security Number: ");
        textField8 = new JTextField("", 15);
        
        //Spouse SSN
        JLabel spouseSSN = new JLabel("Spouse Social Security Number: ");
        textField9 = new JTextField("", 15);
        
        //Self Monthly Income
        JLabel income = new JLabel("Monthly Income (Self): ");
        textField10 = new JTextField("", 15);
        
        //Self Monthly Debt
        JLabel debt = new JLabel("Monthly Debt Payment (Self): ");
        textField11 = new JTextField("", 15);
        
        //Spouse Monthly Income
        JLabel spouseIncome = new JLabel("Monthly Income (Spouse): ");
        textField12 = new JTextField("", 15);
        
        //Spouse Monthly Debt
        JLabel spouseDebt = new JLabel("Monthly Debt Payment (Spouse): ");
        textField13 = new JTextField("",15);
        
        //Cost of Car
        JLabel cost = new JLabel("Cost of Car: ");
        textField14 = new JTextField("", 15);
        
        //Value of Trade In
        JLabel trade = new JLabel("Value of Trade In: ");
        textField15 = new JTextField("If none, put 0", 15);
        
        //Down payment on new car
        JLabel downpay = new JLabel("Down payment on new car: ");
        textField16 = new JTextField("", 15);
        
        //Number of years loan is repaid
        JLabel years = new JLabel("Number of years loan is repaid: ");
        textField17 = new JTextField("", 15);
        
        //Credit Score
        JLabel credit = new JLabel("Credit Score: ");
        textField18 = new JTextField("", 15);
        
        //Spouse Credit Score
        JLabel spouseCredit = new JLabel("Spouse Credit Score: ");
        textField19 = new JTextField("", 15);
        
        //Submit button
        submit = new JButton("Submit Information");
        
        //Add components to the content pane
        contentPane.add(date);
        contentPane.add(textField1);
        contentPane.add(textField2);
        contentPane.add(textField3);
        contentPane.add(name);
        contentPane.add(textField4);
        contentPane.add(textField5);
        contentPane.add(spouseName);
        contentPane.add(textField6);
        contentPane.add(textField7);
        contentPane.add(ssn);
        contentPane.add(textField8);
        contentPane.add(spouseSSN);
        contentPane.add(textField9);
        contentPane.add(income);
        contentPane.add(textField10);
        contentPane.add(debt);
        contentPane.add(textField11);
        contentPane.add(spouseIncome);
        contentPane.add(textField12);
        contentPane.add(spouseDebt);
        contentPane.add(textField13);
        contentPane.add(cost);
        contentPane.add(textField14);
        contentPane.add(trade);
        contentPane.add(textField15);
        contentPane.add(downpay);
        contentPane.add(textField16);
        contentPane.add(years);
        contentPane.add(textField17);
        contentPane.add(credit);
        contentPane.add(textField18);
        contentPane.add(spouseCredit);
        contentPane.add(textField19);
        contentPane.add(submit);
        
        
        //Spring Layout constraints for labels and text fields
        //Today's Date
        layout.putConstraint(SpringLayout.WEST, date,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, date,
                             5,
                             SpringLayout.NORTH, contentPane);
 
        layout.putConstraint(SpringLayout.WEST, textField1,
                             5,
                             SpringLayout.EAST, date);
        layout.putConstraint(SpringLayout.NORTH, textField1,
                             5,
                             SpringLayout.NORTH, contentPane);
        
        layout.putConstraint(SpringLayout.WEST, textField2,
                             5,
                             SpringLayout.EAST, textField1);
        layout.putConstraint(SpringLayout.NORTH, textField2,
                             5,
                             SpringLayout.NORTH, contentPane);
 
        layout.putConstraint(SpringLayout.WEST, textField3,
                             5,
                             SpringLayout.EAST, textField2);
        layout.putConstraint(SpringLayout.NORTH, textField3,
                             5,
                             SpringLayout.NORTH, contentPane);
 
        //First and Last Name
        layout.putConstraint(SpringLayout.WEST, name,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, name,
                             25,
                             SpringLayout.NORTH, date);
        
        layout.putConstraint(SpringLayout.WEST, textField4,
                             5,
                             SpringLayout.EAST, name);
        layout.putConstraint(SpringLayout.NORTH, textField4,
                             25,
                             SpringLayout.NORTH, textField1);
        
        layout.putConstraint(SpringLayout.WEST, textField5,
                             5,
                             SpringLayout.EAST, textField4);
        layout.putConstraint(SpringLayout.NORTH, textField5,
                             25,
                             SpringLayout.NORTH, textField3);
        
        //Spouse First and Last Name
        layout.putConstraint(SpringLayout.WEST, spouseName,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, spouseName,
                             25,
                             SpringLayout.NORTH, name);
        
        layout.putConstraint(SpringLayout.WEST, textField6,
                             5,
                             SpringLayout.EAST, spouseName);
        layout.putConstraint(SpringLayout.NORTH, textField6,
                             25,
                             SpringLayout.NORTH, textField4);
        
        layout.putConstraint(SpringLayout.WEST, textField7,
                             5,
                             SpringLayout.EAST, textField6);
        layout.putConstraint(SpringLayout.NORTH, textField7,
                             25,
                             SpringLayout.NORTH, textField5);
        
        //SSN
        layout.putConstraint(SpringLayout.WEST, ssn,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, ssn,
                             25,
                             SpringLayout.NORTH, spouseName);
 
        layout.putConstraint(SpringLayout.WEST, textField8,
                             5,
                             SpringLayout.EAST, ssn);
        layout.putConstraint(SpringLayout.NORTH, textField8,
                             25,
                             SpringLayout.NORTH, textField7);
        
        //Spouse SSN
        layout.putConstraint(SpringLayout.WEST, spouseSSN,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, spouseSSN,
                             25,
                             SpringLayout.NORTH, ssn);
 
        layout.putConstraint(SpringLayout.WEST, textField9,
                             5,
                             SpringLayout.EAST, spouseSSN);
        layout.putConstraint(SpringLayout.NORTH, textField9,
                             25,
                             SpringLayout.NORTH, textField8);
        
        //Self Monthly Income
        layout.putConstraint(SpringLayout.WEST, income,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, income,
                             25,
                             SpringLayout.NORTH, spouseSSN);
 
        layout.putConstraint(SpringLayout.WEST, textField10,
                             5,
                             SpringLayout.EAST, income);
        layout.putConstraint(SpringLayout.NORTH, textField10,
                             25,
                             SpringLayout.NORTH, textField9);
        
        //Self Monthly Debt
        layout.putConstraint(SpringLayout.WEST, debt,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, debt,
                             25,
                             SpringLayout.NORTH, income);
 
        layout.putConstraint(SpringLayout.WEST, textField11,
                             5,
                             SpringLayout.EAST, debt);
        layout.putConstraint(SpringLayout.NORTH, textField11,
                             25,
                             SpringLayout.NORTH, textField10);
        
        //Spouse Monthly Income
        layout.putConstraint(SpringLayout.WEST, spouseIncome,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, spouseIncome,
                             25,
                             SpringLayout.NORTH, debt);
 
        layout.putConstraint(SpringLayout.WEST, textField12,
                             5,
                             SpringLayout.EAST, spouseIncome);
        layout.putConstraint(SpringLayout.NORTH, textField12,
                             25,
                             SpringLayout.NORTH, textField11);
        
        //Spouse Monthly Debt
        layout.putConstraint(SpringLayout.WEST, spouseDebt,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, spouseDebt,
                             25,
                             SpringLayout.NORTH, spouseIncome);
 
        layout.putConstraint(SpringLayout.WEST, textField13,
                             5,
                             SpringLayout.EAST, spouseDebt);
        layout.putConstraint(SpringLayout.NORTH, textField13,
                             25,
                             SpringLayout.NORTH, textField12);
        
        //Cost of Car
        layout.putConstraint(SpringLayout.WEST, cost,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, cost,
                             25,
                             SpringLayout.NORTH, spouseDebt);
 
        layout.putConstraint(SpringLayout.WEST, textField14,
                             5,
                             SpringLayout.EAST, cost);
        layout.putConstraint(SpringLayout.NORTH, textField14,
                             25,
                             SpringLayout.NORTH, textField13);
        
        //Trade in Value
        layout.putConstraint(SpringLayout.WEST, trade,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, trade,
                             25,
                             SpringLayout.NORTH, cost);
 
        layout.putConstraint(SpringLayout.WEST, textField15,
                             5,
                             SpringLayout.EAST, trade);
        layout.putConstraint(SpringLayout.NORTH, textField15,
                             25,
                             SpringLayout.NORTH, textField14);
        
        //Down payment on new car
        layout.putConstraint(SpringLayout.WEST, downpay,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, downpay,
                             25,
                             SpringLayout.NORTH, trade);
 
        layout.putConstraint(SpringLayout.WEST, textField16,
                             5,
                             SpringLayout.EAST, downpay);
        layout.putConstraint(SpringLayout.NORTH, textField16,
                             25,
                             SpringLayout.NORTH, textField15);
        
        //Number of years the loan is repaid
        layout.putConstraint(SpringLayout.WEST, years,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, years,
                             25,
                             SpringLayout.NORTH, downpay);
 
        layout.putConstraint(SpringLayout.WEST, textField17,
                             5,
                             SpringLayout.EAST, years);
        layout.putConstraint(SpringLayout.NORTH, textField17,
                             25,
                             SpringLayout.NORTH, textField16);
        
        //Credit Score
        layout.putConstraint(SpringLayout.WEST, credit,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, credit,
                             25,
                             SpringLayout.NORTH, years);
 
        layout.putConstraint(SpringLayout.WEST, textField18,
                             5,
                             SpringLayout.EAST, credit);
        layout.putConstraint(SpringLayout.NORTH, textField18,
                             25,
                             SpringLayout.NORTH, textField17);
        
        //Spouse Credit Score
        layout.putConstraint(SpringLayout.WEST, spouseCredit,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, spouseCredit,
                             25,
                             SpringLayout.NORTH, credit);
 
        layout.putConstraint(SpringLayout.WEST, textField19,
                             5,
                             SpringLayout.EAST, spouseCredit);
        layout.putConstraint(SpringLayout.NORTH, textField19,
                             25,
                             SpringLayout.NORTH, textField18);
        
        //Submit button
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, submit,
                             0,
                             SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.NORTH, submit,
                             50,
                             SpringLayout.NORTH, spouseCredit);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
    }
    
    //Create the action listener that processes when a button has been pressed
    void registerListener(Controller c)
    {
        Component[] component = contentPane.getComponents();
        for(int i = 0; i < component.length; i++)
        {
            if(component[i] instanceof AbstractButton)
            {
                AbstractButton b = (AbstractButton) component[i];
                b.addActionListener(c);
            }
        }
    }
    
    //Create the window that displays the result of a successful loan request
    public void update(double combinedMonthlyIncome,    //Combined income of customer and spouse
                       double combinedLoanPayments,     //Combined loan payments of customer and spouse
                       double ratio,                    //Monthly loan payment to income ratio
                       double annualInterest,           //Annual nominal interest rate of the new loan
                       double loanAmount,               //Loan amount
                       double monthlyPayment,           //Monthly payment
                       String dateOfLastPayment)        //Date of last payment
    {
        
        result = new JFrame("Results");
        SpringLayout layout = new SpringLayout();
        JPanel content = new JPanel(layout);
        result.setContentPane(content);
        
        output1 = new JLabel("");
        output2 = new JLabel("");
        output3 = new JLabel("");
        output4 = new JLabel("");
        output5 = new JLabel("");
        output6 = new JLabel("");
        output7 = new JLabel("");
        
        output1.setText("Combined Monthly Incomes: " + Double.toString(combinedMonthlyIncome));
        output2.setText("Combined Monthly Loan Payments: " + Double.toString(combinedLoanPayments));
        output3.setText("Monthly Loan Payment to Income Ratio: " + Double.toString(ratio));
        output4.setText("Annual Nominal Interest Rate of New Loan: " + Double.toString(annualInterest));
        output5.setText("Loan Amount: " + Double.toString(loanAmount));
        output6.setText("Monthly Payment: " + Double.toString(monthlyPayment));
        output7.setText("Date of Last Payment: " + dateOfLastPayment);
        
        content.add(output1);
        content.add(output2);
        content.add(output3);
        content.add(output4);
        content.add(output5);
        content.add(output6);
        content.add(output7);
        
        //output1
        layout.putConstraint(SpringLayout.WEST, output1,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output1,
                             5,
                             SpringLayout.NORTH, content);
        
        //output2
        layout.putConstraint(SpringLayout.WEST, output2,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output2,
                             25,
                             SpringLayout.NORTH, output1);
        
        //output3
        layout.putConstraint(SpringLayout.WEST, output3,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output3,
                             25,
                             SpringLayout.NORTH, output2);
        
        //output4
        layout.putConstraint(SpringLayout.WEST, output4,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output4,
                             25,
                             SpringLayout.NORTH, output3);
        
        //output5
        layout.putConstraint(SpringLayout.WEST, output5,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output5,
                             25,
                             SpringLayout.NORTH, output4);
        
        //output6
        layout.putConstraint(SpringLayout.WEST, output6,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output6,
                             25,
                             SpringLayout.NORTH, output5);
        
        //output7
        layout.putConstraint(SpringLayout.WEST, output7,
                             5,
                             SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, output7,
                             25,
                             SpringLayout.NORTH, output6);
        
        result.pack();
        result.setVisible(true);
    }
    
    //Method displays a window that the loan request has been denied.
    public void error()
    {
        JFrame deny = new JFrame("Results");
        JPanel content = new JPanel();
        deny.setContentPane(content);
        
        JLabel output = new JLabel("Your loan as been denied.");
        content.add(output);
        
        deny.pack();
        deny.setVisible(true);
    }
}
