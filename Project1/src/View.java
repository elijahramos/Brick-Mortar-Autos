//Elijah Ramos
//Customer.Java, Model.java, Controller.java
//Creates a View object that handles the GUI
//Contains methods that creates and modifies the GUI

import java.awt.Component;
import javax.swing.*;
import java.sql.*;

public class View extends JFrame {
    //Initialize GUI componenets
    JFrame frame;
    JFrame result;
    JFrame cust;
    JFrame start;
    JFrame query;
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
    
    JPanel contentPane2;
    JCheckBox custBox;
    JCheckBox dataBox;
    JButton go;
    
    JCheckBox box1;
    JCheckBox box2;
    JCheckBox box3;
    JCheckBox box4;
    JCheckBox box5;
    JCheckBox box6;
    JCheckBox box7;
    JCheckBox box8;
    JCheckBox box9;
    JCheckBox box10;
    JCheckBox box11;
    JCheckBox box12;
    JCheckBox box13;
    JCheckBox box14;
    JCheckBox box15;
    JPanel contentPane3;
    JButton display;
    
    View()
    {
        start = new JFrame("Menu");
        SpringLayout layout = new SpringLayout();
        //Set up the content pane.
        contentPane = new JPanel(layout);
        start.setContentPane(contentPane);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel text = new JLabel("Please choose one of the following:");
        contentPane.add(text);
        
        custBox = new JCheckBox("Customer Auto Loan Form");
        dataBox = new JCheckBox("View Queries"); 
        contentPane.add(custBox);
        contentPane.add(dataBox);
        
        go = new JButton("Go");
        contentPane.add(go);
        
        //custBox
        layout.putConstraint(SpringLayout.WEST, custBox,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, custBox,
                             25,
                             SpringLayout.NORTH, text);
        
        //dataBox
        layout.putConstraint(SpringLayout.WEST, dataBox,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, dataBox,
                             25,
                             SpringLayout.NORTH, custBox);
        
        //go
        layout.putConstraint(SpringLayout.WEST, go,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, go,
                             25,
                             SpringLayout.NORTH, dataBox);
        
        
        start.pack();
        start.setVisible(true);
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
    
    void registerListener2(Controller c)
    {
        Component[] component = contentPane2.getComponents();
        for(int i = 0; i < component.length; i++)
        {
            if(component[i] instanceof AbstractButton)
            {
                AbstractButton b = (AbstractButton) component[i];
                b.addActionListener(c);
            }
        }
    }
    
    void registerListener3(Controller c)
    {
        Component[] component = contentPane3.getComponents();
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
    
    public void custMenu()
    {
        //Create and set up the window.
        frame = new JFrame("Auto Loan");
        SpringLayout layout = new SpringLayout();
        
        //Set up the content pane.
        contentPane2 = new JPanel(layout);
        frame.setContentPane(contentPane2);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
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
        contentPane2.add(date);
        contentPane2.add(textField1);
        contentPane2.add(textField2);
        contentPane2.add(textField3);
        contentPane2.add(name);
        contentPane2.add(textField4);
        contentPane2.add(textField5);
        contentPane2.add(spouseName);
        contentPane2.add(textField6);
        contentPane2.add(textField7);
        contentPane2.add(ssn);
        contentPane2.add(textField8);
        contentPane2.add(spouseSSN);
        contentPane2.add(textField9);
        contentPane2.add(income);
        contentPane2.add(textField10);
        contentPane2.add(debt);
        contentPane2.add(textField11);
        contentPane2.add(spouseIncome);
        contentPane2.add(textField12);
        contentPane2.add(spouseDebt);
        contentPane2.add(textField13);
        contentPane2.add(cost);
        contentPane2.add(textField14);
        contentPane2.add(trade);
        contentPane2.add(textField15);
        contentPane2.add(downpay);
        contentPane2.add(textField16);
        contentPane2.add(years);
        contentPane2.add(textField17);
        contentPane2.add(credit);
        contentPane2.add(textField18);
        contentPane2.add(spouseCredit);
        contentPane2.add(textField19);
        contentPane2.add(submit);
        
        
        //Spring Layout constraints for labels and text fields
        //Today's Date
        layout.putConstraint(SpringLayout.WEST, date,
                             5,
                             SpringLayout.WEST, contentPane2);
        layout.putConstraint(SpringLayout.NORTH, date,
                             5,
                             SpringLayout.NORTH, contentPane2);
 
        layout.putConstraint(SpringLayout.WEST, textField1,
                             5,
                             SpringLayout.EAST, date);
        layout.putConstraint(SpringLayout.NORTH, textField1,
                             5,
                             SpringLayout.NORTH, contentPane2);
        
        layout.putConstraint(SpringLayout.WEST, textField2,
                             5,
                             SpringLayout.EAST, textField1);
        layout.putConstraint(SpringLayout.NORTH, textField2,
                             5,
                             SpringLayout.NORTH, contentPane2);
 
        layout.putConstraint(SpringLayout.WEST, textField3,
                             5,
                             SpringLayout.EAST, textField2);
        layout.putConstraint(SpringLayout.NORTH, textField3,
                             5,
                             SpringLayout.NORTH, contentPane2);
 
        //First and Last Name
        layout.putConstraint(SpringLayout.WEST, name,
                             5,
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.WEST, contentPane2);
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
                             SpringLayout.HORIZONTAL_CENTER, contentPane2);
        layout.putConstraint(SpringLayout.NORTH, submit,
                             50,
                             SpringLayout.NORTH, spouseCredit);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public void queries()
    {
        query = new JFrame("Queries");
        SpringLayout layout = new SpringLayout();
        contentPane3 = new JPanel(layout);
        query.setContentPane(contentPane3);
        
        box1 = new JCheckBox("Query 1");
        box2 = new JCheckBox("Query 2");
        box3 = new JCheckBox("Query 3");
        box4 = new JCheckBox("Query 4");
        box5 = new JCheckBox("Query 5");
        box6 = new JCheckBox("Query 6");
        box7 = new JCheckBox("Query 7");
        box8 = new JCheckBox("Query 8");
        box9 = new JCheckBox("Query 9");
        box10 = new JCheckBox("Query 10");
        box11 = new JCheckBox("Query 11");
        box12 = new JCheckBox("Query 12");
        box13 = new JCheckBox("Query 13");
        box14 = new JCheckBox("Query 14");
        box15 = new JCheckBox("Query 15");
        
        contentPane3.add(box1);
        contentPane3.add(box2);
        contentPane3.add(box3);
        contentPane3.add(box4);
        contentPane3.add(box5);
        contentPane3.add(box6);
        contentPane3.add(box7);
        contentPane3.add(box8);
        contentPane3.add(box9);
        contentPane3.add(box10);
        contentPane3.add(box11);
        contentPane3.add(box12);
        contentPane3.add(box13);
        contentPane3.add(box14);
        contentPane3.add(box15);
        
        display = new JButton("Display");
        contentPane3.add(display);
        
        //box1
        layout.putConstraint(SpringLayout.WEST, box1,
                             5,
                             SpringLayout.WEST,contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box1,
                             5,
                             SpringLayout.NORTH, contentPane3);
        
        //box2
        layout.putConstraint(SpringLayout.WEST, box2,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box2,
                             25,
                             SpringLayout.NORTH, box1);
        
        //box3
        layout.putConstraint(SpringLayout.WEST, box3,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box3,
                             25,
                             SpringLayout.NORTH, box2);
        
        //box4
        layout.putConstraint(SpringLayout.WEST, box4,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box4,
                             25,
                             SpringLayout.NORTH, box3);
        
        //box5
        layout.putConstraint(SpringLayout.WEST, box5,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box5,
                             25,
                             SpringLayout.NORTH, box4);
        
        //box6
        layout.putConstraint(SpringLayout.WEST, box6,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box6,
                             25,
                             SpringLayout.NORTH, box5);
        
        //box7
        layout.putConstraint(SpringLayout.WEST, box7,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box7,
                             25,
                             SpringLayout.NORTH, box6);
        
        //box8
        layout.putConstraint(SpringLayout.WEST, box8,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box8,
                             25,
                             SpringLayout.NORTH, box7);
        
        //box9
        layout.putConstraint(SpringLayout.WEST, box9,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box9,
                             25,
                             SpringLayout.NORTH, box8);
        
        //box10
        layout.putConstraint(SpringLayout.WEST, box10,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box10,
                             25,
                             SpringLayout.NORTH, box9);
        
        //box11
        layout.putConstraint(SpringLayout.WEST, box11,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box11,
                             25,
                             SpringLayout.NORTH, box10);
        
        //box12
        layout.putConstraint(SpringLayout.WEST, box12,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box12,
                             25,
                             SpringLayout.NORTH, box11);
        
        //box13
        layout.putConstraint(SpringLayout.WEST, box13,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box13,
                             25,
                             SpringLayout.NORTH, box12);
        
        //box14
        layout.putConstraint(SpringLayout.WEST, box14,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box14,
                             25,
                             SpringLayout.NORTH, box13);
        
        //box15
        layout.putConstraint(SpringLayout.WEST, box15,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, box15,
                             25,
                             SpringLayout.NORTH, box14);
        
        //display
        layout.putConstraint(SpringLayout.WEST, display,
                             5,
                             SpringLayout.WEST, contentPane3);
        layout.putConstraint(SpringLayout.NORTH, display,
                             25,
                             SpringLayout.NORTH, box15);
        
        query.pack();
        query.setVisible(true);
    }
    
    public static String dispNull (String input) {
        //because of short circuiting, if it's null, it never checks the length.
        if (input == null || input.length() == 0)
            return "N/A";
        else
            return input;
    }
    
    public void printQuery1(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Address", "Phone #", "Last Purchase Date");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String lastPurchase = rs.getString("lastPurchaseDate");

                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(address), dispNull(phone), dispNull(lastPurchase));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery2(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s%-15s%-5s%-5s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Phone #", "Make", "Model", "Year Made", "Last Purchase Date");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String phone = rs.getString("phone");
                String make = rs.getString("make");
                String model = rs.getString("model");
                String yearMade = rs.getString("yearMade");
                String lastPurchase = rs.getString("lastPurchaseDate");

                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(phone), dispNull(make), dispNull(model), dispNull(yearMade), dispNull(lastPurchase));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery3(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s%-15s%-5s%-5s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Phone #", "Make", "Model", "Year Made", "Last Purchase Date");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String phone = rs.getString("phone");
                String make = rs.getString("make");
                String model = rs.getString("model");
                String yearMade = rs.getString("yearMade");
                String lastPurchase = rs.getString("lastPurchaseDate");

                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(phone), dispNull(make), dispNull(model), dispNull(yearMade), dispNull(lastPurchase));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery4(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Phone #", "Last Purchase Date");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String phone = rs.getString("phone");
                String lastPurchase = rs.getString("lastPurchaseDate");

                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(phone), dispNull(lastPurchase));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery5(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Department", "Unused Vacation Days");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String department = rs.getString("department");
                String unused = rs.getString("unusedVacationDays");

                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(department), dispNull(unused));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery6(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Credential Name", "Pay Rate");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String credential = rs.getString("credentialsName");
                String payRate = rs.getString("payRate");

                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(credential), dispNull(payRate));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery7(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Sales Count");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String sales = rs.getString("salesCount");
                
                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(sales));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery8(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Gross Sales");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String gross = rs.getString("grossSales");
                
                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(gross));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery9(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s\n";
        System.out.printf(displayFormat, "First Name", "Last Name", "Loyal Sales");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                String loyal = rs.getString("loyalSales");
                
                //Display values
                System.out.printf(displayFormat,
                        dispNull(first), dispNull(last), dispNull(loyal));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery10(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s\n";
        System.out.printf(displayFormat, "Make", "Model", "Year Made");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String make = rs.getString("make");
                String model = rs.getString("model");
                String yearMade = rs.getString("yearMade");
                
                //Display values
                System.out.printf(displayFormat,
                        dispNull(make), dispNull(model), dispNull(yearMade));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery11(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s%-15s\n";
        System.out.printf(displayFormat, "Make", "Model", "Year Made", "Stock of Model", "Car Type");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String make = rs.getString("make");
                String model = rs.getString("model");
                String yearMade = rs.getString("yearMade");
                String stock = rs.getString("stockOfModel");
                String carType = rs.getString("carType");
                
                //Display values
                System.out.printf(displayFormat,
                        dispNull(make), dispNull(model), dispNull(yearMade), dispNull(stock), dispNull(carType));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
    
    public void printQuery12(ResultSet rs)
    {
        String displayFormat="%-5s%-15s%-15s%-15s\n";
        System.out.printf(displayFormat, "Make", "Model", "Year Made", "Car Type");
        try
        {
        while (rs.next()) {
                //Retrieve by column name
                String make = rs.getString("make");
                String model = rs.getString("model");
                String yearMade = rs.getString("yearMade");
                String carType = rs.getString("carType");
                
                //Display values
                System.out.printf(displayFormat,
                        dispNull(make), dispNull(model), dispNull(yearMade), dispNull(carType));
            }
        System.out.println();
        rs.close();
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
