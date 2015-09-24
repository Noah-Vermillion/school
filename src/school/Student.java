package school;


public class Student extends Person{
    
    private int gradeLvl;
    private Course theCourse;

    
     public static Student addStudent(String _name,Gender _gender,int _weight,int _gradelvl)
    {
        Student temp = new Student(_name, _gender, _weight,_gradelvl);
        addPerson(temp);
        return(temp);
    }
    
    Student(String _name, Gender _gender, int _weight, int _gradelvl)
    {
        super(_name,_gender,_weight);
        gradeLvl = _gradelvl;
    }
    public void setGradeLvl(int _gradeLvl)
    {
        gradeLvl = _gradeLvl;
    }
    public int _gradeLvl()
    {
        return (gradeLvl);
    }
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            theCourse.addStudent(this);
        }    
    }
    public String getCourseName()
    {
         return(theCourse.getName());
    }
     public static void printName()
    {
        System.out.println("===PrintNamesOfStudents===");
        for (Person temp : people)
        {
            if(temp instanceof Student)
            System.out.println(temp.getName());
        }
    }
//    public void printCourse()
//    {
//        System.out.println("===PrintStudentAndTheirCourse===");
//        for  (Person temp : people)
//        {
//            System.out.println(temp.getName() + " - " + theCourse.getName());
//        }
//    }
    
}