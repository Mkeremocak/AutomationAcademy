package week3;

public class Person {
    int age = 0;
    String name;
    String surname;
    String gender;
    int year = 0;

    public Person()
    {}

    //teacher
    public Person(int age, String name, String surname, String gender)
    {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    //student
    public Person(int age, String name, String surname, String gender,int year)
    {
        this.age = age;
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
}