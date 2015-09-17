package school;

import java.util.ArrayList;

public class Course {
    
    enum Type
    {
        Math,Science,English,History,Language,Elective,PE;
    }
    
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    private int period;
    private Type type;
    
    private Person thePerson;
    
    public static Course addCourse(String _name, Type _type, int _period)
    {
        Course temp = new Course(_name, _type, _period);
        courses.add(temp);
        return(temp);
    }
    
    Course()
    {
        name = "none";
        period = 0;
        type = Type.Elective;
    }
    Course(String _name, Type _type, int _period)
    {
        name = _name;
        type = _type;
        period = _period;
    }
    public void addPerson(Person _person)
    {
        if(thePerson == null)
        {
            thePerson = _person;
            thePerson.addCourse(this);
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
    public void setperiod(int _period)
    {
        period = _period;
    }
    public int getPeriod()
    {
        return (period);
    }
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type type()
    {
        return (type);
    }
    public static void printCourses()
    {
        System.out.println("====PrintCourse=====");
        for (Course temp : courses)
        {
            if(temp!= null)
            {
                     System.out.println(temp.getName());
            }
        }
    }
     public static void printPeriod()
    {
        System.out.println("====PrintPeriods=====");
        for (Course temp : courses)
        {
            if(temp!= null)
            {
                     System.out.println(temp.getName() + " = " + temp.getPeriod());
            }
        }
    }
    public static void printCourse(Type _type)
    {
        System.out.println("===PrintCourses=== " + _type);
        for (Course temp : courses)
        {
            if(temp.type == _type)
            {
                     System.out.println(temp.getName());
            }
        }
    }
}
