/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // Question 12
        if age >= 16{
            system.out.println("can drive");
        }else
        system.out.println("must wait " + 16 - age + " years(s)");
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // Question 13
        totalSalary = HourlyWage * unpaidHours;
        afterTaxes = totalSalary * 0.3;
        return afterTaxes;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // Question 14
        system.out.println("John Deere has received a wire transfer of " + calculatePay + " CAD");
        unpaidHours = 0;
    }
    
    public void setYearOfBirth(int year)
    {
        // Question 11
        this.yearOfBirth = year;
    }
    
    public int getYearOfBirth()
    {
        // Question 11
        return yearOfBirth;
    }
}