import java.util.Scanner;

public class EmployeeSalary
{

public static int salary(int hrsPerWeek, int moneyPerHour, int vacationDays)
{
    
    int yearlyWorkingHours = hrsPerWeek * 52;
    int actualWorkingHours = yearlyWorkingHours - (vacationDays*8);

    int finalYearlySalary = actualWorkingHours*moneyPerHour;

    return finalYearlySalary;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hours per week");
    int hoursPerWeek = sc.nextInt();


    System.out.println("Enter money per hour");
    int moneyPerHr = sc.nextInt();

    System.out.println("Enter vacation days");
    int vacation = sc.nextInt();

    int finalSalary = salary(hoursPerWeek, moneyPerHr, vacation);
    System.out.println("Yearly salary = " + finalSalary);


}



}
