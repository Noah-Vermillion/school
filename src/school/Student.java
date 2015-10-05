package school;
import java.util.ArrayList;
import static school.Person.people;
public class Student extends Person{
    private int gradeLevel;
//    private Course theCourse;
    private Course courses[] = new Course[4];
    public double grade[] = new double[4]; 
    private double gpa = 0;
    
    public static Student addStudent(String _name,
    Gender _gender, int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        addPerson(temp);
        return(temp);
    }    
    Student (String _name,Gender _gender,int _weight,
    int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    }
    
    public boolean addCourse(Course _course, double _grade)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course, _grade);
        return(true);
    }  
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);
        if (courses[_course.getPeriod()-1] != null)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course, double _grade)
    {
        courses[_course.getPeriod()-1]=_course;
        grade[_course.getPeriod()-1] = _grade;
    }
    
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    } 
    public double getGpa()
    {
        int numValid = 0;
        for(int x =0; x < grade.length;x++)
        {
            if(courses[x] != null)
            {
                gpa += grade[x];
                numValid ++;
            } 
        }
        if(numValid == 0)
            return(0.0);
        
        
        gpa /= numValid;
        return(gpa);
    } 
    public static void printNames()
    {
        System.out.println(
        "===printNamesOf=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    }
    public static void printKidsWhoHaveHonors()
    {
        System.out.println("===printNamesOfKidsWhoHaveHonors=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
            {
                Student student =(Student)temp;
                for(int x = 0;x<Course.numPeriods;x++)
                {
                    if(student.courses[x] != null && student.courses[x].getHonors() == true)
                    {
                        System.out.println(temp.getName() + " ");
                        x = Course.numPeriods;
                    }
                }
                
            }
        }
             
    }
     public Teacher getTeacherNameWithLowestMeanLvl()
    {
        double lowestMeanLvl = 10.0;
        Teacher lowMeanLvl = null;
        for (int x = 0;x<Course.numPeriods;x++)
        {
            if (courses[x] != null)
            {
                if(courses[x].getTeacher() != null)
                {
                    if(lowMeanLvl == null || courses[x].getTeacher().getMeanLevel() < lowestMeanLvl)
                    {
                          lowestMeanLvl = courses[x].getTeacher().getMeanLevel();
                          lowMeanLvl = courses[x].getTeacher();
                    }
                }
            }    
        }
        return(lowMeanLvl); 
    }
    public void printTeacherNames()
    {
        System.out.println(getName() + " learns from ");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                    System.out.println(temp.getTeacher().getName());   
            }
        }
    }
    public static void printNamesGPAGreaterThan(double _grades)
    {
        System.out.println ("===printNamesOfPeopleWhoHaveAGreaterGPAThan" + _grades + "=== ");
        for (Person temp : people)
        {
                if (temp instanceof Student)
                {
                    Student student = (Student)temp;
                   // System.out.println(temp.getName() + " " + student.getGpa());
                    if(student.getGpa() > _grades)
                    {
                        System.out.println(temp.getName() + " " + student.getGpa());
                    }
                }
        }
             
    }
    public static Student getHighestGPA()
    {
        double curHigh = 0.0;
        Student CurHighName = new Student("CurHighStuden", Person.Gender.Female,100,10);
        for (Person temp : people)
        {
             if (temp instanceof Student)
             {
                 Student student = (Student)temp;
                // System.out.println(temp.getName() + " " + student.getGpa());
                 if(student.getGpa() > curHigh)
                 {
                     curHigh = student.getGpa();
                     CurHighName.gpa = curHigh;
                     CurHighName.setName(student.getName());
                     CurHighName.setGender(student.getGender());
                     CurHighName.setWeight(student.getWeight());
                     CurHighName.gradeLevel = student.gradeLevel;
                 }
             }
        }
        return(CurHighName);
    }
}
