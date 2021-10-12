package week2;


public class Seniority {
    public void yearCalculator(double salary, int year)
    {
        if(year == 1)
        {
            double monthlySalary = (salary * 4);
            double yearSalary = (monthlySalary * 5 / 100 )+ monthlySalary;
            System.out.println("The salary raise worker will get : " + yearSalary+ "€");
        }
        else if (year == 2)
        {
            double monthlySalary = (salary * 4);
            double yearSalary = (monthlySalary * 10 / 100 )+ monthlySalary;
            System.out.println("The salary raise worker will get : " + yearSalary+ "€");

        }
        else if (year == 3)
        {
            double monthlySalary = (salary * 4);
            double yearSalary = (monthlySalary * 15 / 100 ) + monthlySalary;
            System.out.println("The salary raise worker will get : " + yearSalary+ "€");

        }
        else if (year == 4)
        {
            double monthlySalary = (salary * 4);
            double yearSalary = (monthlySalary * 20 / 100 )+ monthlySalary;
            System.out.println("The salary raise worker will get : " + yearSalary + "€");

        }
        else if (year >= 5)
        {
            double monthlySalary = (salary * 5);
            double yearSalary = (monthlySalary * 25 / 100 )+ monthlySalary;
            System.out.println("The salary raise worker will get : " + yearSalary+ "€");

        }
    }

}