package week3;

import java.util.ArrayList;
import java.util.Random;

public class Registration extends Person{
    public static void main(String args[]){
        Random random = new Random();
        Person student;
        Person teacher;
        Course cc;
        ArrayList teacherArray= new ArrayList();
        ArrayList studentArray= new ArrayList();
        ArrayList teacherCourses= new ArrayList();
        ArrayList studentCourses= new ArrayList();

        for (int n=0;n<=random.nextInt(6);n++)
        {
            student = new Person(23,"Kerem","Ocak","male",2);
            Object Str="Name: " + student.name+ " Surname: " +student.surname +" Age: "+ student.age +" Gender: "+ student.gender +" Year: "+ student.year;
            studentArray.add(Str);
        }

        for (int s=0;s<=random.nextInt(6);s++)
        {
            teacher = new Person(s+20,"Nazim","Hikmet","male");
            Object Ttr="Name: " + teacher.name+ " Surname: " +teacher.surname +" Age: "+ teacher.age +" Gender: "+ teacher.gender;
            teacherArray.add(Ttr);
        }

        //Teacher Courses
        for (int k=1;k<teacherArray.size();k++)
        {
            for (int i=1;i<=3;i++)
            {
                int credit= i+4;
                String name = "Course"+i;
                int studentCount=20;
                cc = new Course(credit,name,studentCount);
                // c1.printCourse();
                Object crs="Name: " + cc.name+ " Credit: "+ cc.credit +" Student Count: "+ cc.studentCount;
                String teacherCourse= teacherArray.get(k) + " HAVE " + crs.toString();
                teacherCourses.add( teacherCourse);
            }
            System.out.println("Teacher : " + teacherCourses.get(k).toString() +" ");
        }

        //Student Courses
        for (int j=1;j<studentArray.size();j++)
        {
            int totalCredit=0;
            while(totalCredit<=20)
            {
                int credit= j+4;
                String name = "Course"+j;
                int studentCount=20;
                totalCredit =totalCredit+credit;
                cc = new Course(credit,name,studentCount);
                Object crs="Name: " + cc.name+ " Credit: "+ cc.credit +" Student Count: "+ cc.studentCount;
                String studentCourse= studentArray.get(j) + " registered " + crs.toString() + "Total Credit: " +totalCredit;
                studentCourses.add(studentCourse);
            }
            System.out.println("Student : " + studentCourses.get(j).toString() +" ");
        }
    }
}