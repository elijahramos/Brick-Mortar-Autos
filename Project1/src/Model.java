//Elijah Ramos
//Customer.java , View.java , Controller.java
//Represents the customer requesting a loan.
//Creates a model object that stores the customer's information
//Contains methods necessary to modify values and carry out loan calculations

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Model {
    //Initialize the attributes to containe the information needed from the customer
    private Calendar date = new GregorianCalendar();    //Today's Date
    private String firstName;                           //Customer's first name
    private String lastName;                            //Customer's last name
    private String spouseFirstName;                     //Spouse's first name
    private String spouseLastName;                      //Spouse's last name
    private int SSN;                                    //Customer's Social Security Number
    private int spouseSSN;                              //Spouse's Social Security Number
    private double monthlyIncome;                       //Customer's monthly income
    private double monthlyDebt;                         //Customer's monthly debt payments
    private double spouseMonthlyIncome;                 //Spouse's monthly income
    private double spouseMonthlyDebt;                   //Spouse's monthly debt payments
    private double carCost;                             //Cost of the new car
    private double tradeInValue;                        //Value of trade in
    private double downPayment;                         //Down payment on new car
    private int yearsPaid;                              //Number of years the loan is repaid
    private double creditScore;                         //Customer's credit score
    private double spouseCreditScore;                   //Spouse's credit score
    
    //Default constructor initializes all attributes at default values.
    Model()
    {
        firstName = "";
        lastName = "";
        spouseFirstName = "";
        spouseLastName = "";
        SSN = 0;
        spouseSSN = 0;
        monthlyIncome = 0;
        monthlyDebt = 0;
        spouseMonthlyIncome = 0;
        spouseMonthlyDebt = 0;
        carCost = 0;
        tradeInValue = 0;
        downPayment = 0;
        yearsPaid = 0;
        creditScore = 0;
    }
    
    //Argument constructor to assign attribute values from passed in arguments.
    Model(int day, int month, int year, String firstName, String lastName,
            String spouseFirstName, String spouseLastName, int SSN, int spouseSSN,
            double monthlyIncome, double monthlyDebt, double spouseMonthlyIncome,
            double spouseMonthlyDebt, double carCost, double tradeInValue,
            double downPayment, int yearsPaid, double creditScore)
    {
        date.set(Calendar.DAY_OF_MONTH, day);
	date.set(Calendar.MONTH, month);
	date.set(Calendar.YEAR, year);
        this.firstName = firstName;
        this.lastName = lastName;
        this.spouseFirstName = spouseFirstName;
        this.spouseLastName = spouseLastName;
        this.SSN = SSN;
        this.spouseSSN = spouseSSN;
        this.monthlyIncome = monthlyIncome;
        this.monthlyDebt = monthlyDebt;
        this.spouseMonthlyIncome = spouseMonthlyIncome;
        this.spouseMonthlyDebt =spouseMonthlyDebt;
        this.carCost = carCost;
        this.tradeInValue = tradeInValue;
        this.downPayment = downPayment;
        this.yearsPaid = yearsPaid;
        this.creditScore = creditScore;
    }
    
    //Create getters/setters methods for attributes
    public Calendar getDate()
    {
        return date;
    }
    
    public void setDate(int d, int m, int y)
    {
        date.set(Calendar.YEAR, y);
	date.set(Calendar.MONTH, m);
	date.set(Calendar.DAY_OF_MONTH, d);
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String s)
    {
        firstName = s;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String s)
    {
        lastName = s;
    }
    
    public String getSpouseFirstName()
    {
        return spouseFirstName;
    }
    
    public void setSpouseFirstName(String s)
    {
        spouseFirstName = s;
    }
    
    public String getSpouseLastName()
    {
        return spouseLastName;
    }
    
    public void setSpouseLastName(String s)
    {
        spouseLastName = s;
    }
    
    public int getSSN()
    {
        return SSN;
    }
    
    public void setSSN(int x)
    {
        SSN = x;
    }
    
    public int getSpouseSSN()
    {
        return spouseSSN;
    }
    
    public void setSpouseSSN(int x)
    {
        spouseSSN = x;
    }
    
    public double getMonthlyIncome()
    {
        return monthlyIncome;
    }
    
    public void setMonthlyIncome(double x)
    {
        monthlyIncome = x;
    }
    
    public double getMonthlyDebt()
    {
        return monthlyDebt;
    }
    
    public void setMonthlyDebt(double x)
    {
        monthlyDebt = x;
    }
    
    public double getSpouseMonthlyIncome()
    {
        return spouseMonthlyIncome;
    }
    
    public void setSpouseMonthlyIncome(double x)
    {
        spouseMonthlyIncome = x;
    }
    
    public double getSpouseMonthlyDebt()
    {
        return spouseMonthlyDebt;
    }
    
    public void setSpouseMonthlyDebt(double x)
    {
        spouseMonthlyDebt = x;
    }
    
    public double getCarCost()
    {
        return carCost;
    }
    
    public void setCarCost(double x)
    {
        carCost = x;
    }
    
    public double getTradeInValue()
    {
        return tradeInValue;
    }
    
    public void setTradeInValue(double x)
    {
        tradeInValue = x;
    }
    
    public double getDownPayment()
    {
        return downPayment;
    }
    
    public void setDownPayment(double x)
    {
        downPayment = x;
    }
    
    public int getYearsPaid()
    {
        return yearsPaid;
    }
    
    public void setYearsPaid(int x)
    {
        yearsPaid = x;
    }
    
    public double getCreditScore()
    {
        return creditScore;
    }
    
    public void setCreditScore(double x)
    {
        creditScore = x;
    }
    
    public double getSpouseCreditScore()
    {
        return spouseCreditScore;
    }
    
    public void setSpouseCreditScore(double x)
    {
        spouseCreditScore = x;
    }
    
    //Create methods that carry out loan calculations
    //Returns the combined monthly income of the customer and the spouse
    public double combinedMonthlyIncome()
    {
        return monthlyIncome + spouseMonthlyIncome;
    }
    
    //Returns the combined loan payments of the customer and the spouse
    public double combinedLoanPayments()
    {
        return monthlyDebt + spouseMonthlyDebt;
    }
    
    //Returns the average credit score of the customer and the spouse
    public double averageCreditScore()
    {
        return (creditScore + spouseCreditScore)/2;
    }
    
    //Returns the monthly loan payments to income ratio
    public double ratio()
    {
        return (this.combinedLoanPayments()/this.combinedMonthlyIncome());
    }
    
    //Returns the annual nominal interest rate of the new loan
    public double annualInterest()
    {
        return (this.ratio()/10);
    }
    
    //Returns the loan amount
    public double loanAmount()
    {
        return (carCost - (tradeInValue + downPayment));
    }
    
    //Returns the monthly payments
    public double monthlyPayment()
    {
        //initialize variables for the monthly payment formula
        double P = this.loanAmount();
        double r = this.annualInterest();
        int d = date.get(Calendar.DAY_OF_MONTH);
        
        //Calculate by using the monthly payment formula
        //Divisor and Dividend portions of formula are split
        
        //Top: P*r(1+(r/12))^(12N-(D/365N))
        double top = P*r*Math.pow((1+(r/12)), (12*yearsPaid - (d/(365*yearsPaid))));
        //Bottom: 12(1+(r/12))^(12N) - 12
        double bottom = 12*Math.pow((1+(r/12)), (12*yearsPaid)) - 12;
        return top/bottom;
    }
    
    //Returns the date of the last payment
    public String dateOfLastPayment()
    {
        String[] monthNames = {"January", "February", "March", "April", "May",
                                "June", "July", "August", "September", "October",
                                "Novermber", "December"};
        Calendar last = new GregorianCalendar();
        if(date.get(Calendar.DAY_OF_MONTH) > 1)
        {
            last.set(date.get(Calendar.YEAR) + yearsPaid, date.get(Calendar.MONTH) + 1, 1);
            return monthNames[last.get(Calendar.MONTH)] + " " + last.get(Calendar.DAY_OF_MONTH) + ", " + last.get(Calendar.YEAR);
        }
        else
        {
            return monthNames[date.get(Calendar.MONTH)] + " " + date.get(Calendar.DAY_OF_MONTH) + ", " +  (date.get(Calendar.YEAR) + yearsPaid);
        }
    }
}
