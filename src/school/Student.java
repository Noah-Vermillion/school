package school;


public class Student extends Person{
    
    private int gradeLvl;
    
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
    
    
}