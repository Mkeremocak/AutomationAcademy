package week1;

import java.util.Scanner;

public class Week1Homework {
    public static void main(String[] args){
        //Weekday working hours input
        System.out.println("Please enter weekday working hour: ");
        Scanner scanner = new Scanner(System.in);
        int WeekdayHours = scanner.nextInt();
        //Weekend working hours input
        System.out.println("Please enter weekend working hour: ");
        int WeekendHours = scanner.nextInt();
        scanner.close();
        int TotalWorkingHours = WeekdayHours + WeekendHours;
        int HourlyUnitWage = 25;

        //Eger haftalik calisma toplam 40 saat ise
        if (TotalWorkingHours == 40){
            double BaseSalary = 1000;
            System.out.println("Your grade is : " + BaseSalary);
        }


        //Toplam calisma 40 saatten fazla
        else if (TotalWorkingHours > 40){
            //Haftaici 40 saatten fazlayken
            if (WeekdayHours>=40){
                if(WeekendHours >10) {
                    int ExtraWeekdayHours = WeekdayHours - 40;
                    double Salary = 1000 + (ExtraWeekdayHours * HourlyUnitWage * 1.5) + (WeekendHours * HourlyUnitWage * 2) + 500;
                    System.out.println("Your grade is : " + Salary);
                }
                else{
                    int ExtraWeekdayHours = WeekdayHours - 40;
                    double Salary = 1000 + (ExtraWeekdayHours * HourlyUnitWage * 1.5) + (WeekendHours * HourlyUnitWage * 2);
                    System.out.println("Your grade is : " + Salary);
                }
            }
            //Haftaici 40 saatten az iken
            else {
                int ExtraWeekendHours = TotalWorkingHours - 40;
                double Salary = 1000 + (ExtraWeekendHours * 2);
                System.out.println("Your grade is : " + Salary);
            }
        }

        //Eger haftalik calisma toplam 40 saatten az ise
        else {
            double Salary = TotalWorkingHours * HourlyUnitWage;
            System.out.println("Your salary is : " + Salary);
        }

    }
}
