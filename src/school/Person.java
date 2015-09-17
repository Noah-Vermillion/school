
package school;
import java.util.ArrayList;
import java.util.Calendar;
public class Person 
{
    
    enum Gender
    {
        Male,Female
    }
    
    
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
     private int weight; 
    
    private int age;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
            
    
    private Course theCourse;
    
    
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp = new Person(_name, _gender, _weight);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
    
    Person()
    {
        name = "None";
        gender = Gender.Female;
        weight = 0;
    }
    Person(String _name, Gender _gender, int _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }
    public void setBirthDate(int _day, int _month, int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        age = year - birthYear;
        return(age);
    }
    
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            theCourse.addPerson(this);
        }    
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return (name);
    }
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public double getWeight()
    {
        return (weight);
    }
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return (gender);
    }
    public static void printNames()
    {
        System.out.println("====PrintNames=====");
        for (Person temp : people)
        {
            if(temp!= null)
            {
                     System.out.println(temp.getName());
            }
        }
    }
    public static void printWeight()
    {
        System.out.println("====PrintWeight=====");
        for (Person temp : people)
        {
            if(temp!= null)
            {
                     System.out.println(temp.getName() + " = " + temp.getWeight());
            }
        }
    }
    public static void printNames(Gender _gender)
    {
        System.out.println("===PrintNames=== " + _gender);
        for (Person temp : people)
        {
            if(temp.gender == _gender)
            {
                     System.out.println(temp.getName());
            }
        }
    }
    public static void printAge()
    {
        System.out.println("===PrintAge=== ");
        for (Person temp : people)
        {
            System.out.println(temp.name + " = " + temp.age);
        }
    }
//    public String toString()
//    {
//        return(name + " " + weight + " " + gender + " " + theCourse);
//    }
    
    
}
