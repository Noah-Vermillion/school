package school;
public class School {
    public static void main(String[] args) {
        Student joe =  Student.addStudent("Joe",Person.Gender.Male,120,10);
        Student jill =  Student.addStudent("Jill",Person.Gender.Female,105,9);
        Student billyJoe =  Student.addStudent("BillyJoe",Person.Gender.Male,210,12);
        Student bobby =  Student.addStudent("Bobby",Person.Gender.Male,168,11);        
        Student ann =  Student.addStudent("Annie",Person.Gender.Female,98,11);        
        Student sean =  Student.addStudent("Sean",Person.Gender.Male,138,11);        
                
        Teacher price = Teacher.addTeacher("Price", Person.Gender.Male, 206,4.7);
        Teacher hudson = Teacher.addTeacher("Hudson", Person.Gender.Female, 106,7.2);
        Teacher anderson = Teacher.addTeacher("Anderson", Person.Gender.Female, 112,3.2);
        Teacher smith = Teacher.addTeacher("Smith", Person.Gender.Male, 152,8.2);
        Teacher jones = Teacher.addTeacher("Jones", Person.Gender.Female, 102,1.2);
        
        Course geom =  Course.addCourse("Geometry", Course.Type.Math, 4, true);
        Course algebra1 =  Course.addCourse("Algebra1", Course.Type.Math, 2, false);
        Course algebra2 =  Course.addCourse("Algebra2", Course.Type.Math, 3, true);
        Course trigonometry =  Course.addCourse("Trigonometry", Course.Type.Math, 4, false);
        
        Course photo =  Course.addCourse("Photography", Course.Type.Elective, 3, false);       
        Course compsci2 =  Course.addCourse("Compsci2", Course.Type.Elective, 2, false);  
        Course compsci1 =  Course.addCourse("Compsci1", Course.Type.Elective, 1, false);  
        Course webDesign =  Course.addCourse("WebDesign", Course.Type.Elective, 4, false);  
        
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 3, false);  
        Course chemistry =  Course.addCourse("Chemistry", Course.Type.Science, 1, true);  
        Course earthsciences =  Course.addCourse("Earthsciences", Course.Type.Science, 3, false);  
        Course anatomy =  Course.addCourse("Anatomy", Course.Type.Science, 4, true);  
        
        Course worldHistory1 =  Course.addCourse("WorldHistory", Course.Type.History, 1, false);       
        Course apeuro =  Course.addCourse("Ap euro", Course.Type.History, 3, true);       
        Course apush =  Course.addCourse("Apush", Course.Type.History, 2, true);       
        Course worldHistory2 =  Course.addCourse("WorldHistory2", Course.Type.History, 4, false);       

        geom.addStudent(bobby,4.0);
         webDesign.addStudent(bobby,3.9);
          biology.addStudent(bobby,3.1);
           apeuro.addStudent(bobby,3.5);
          
         photo.addStudent(jill,4.0);
          algebra1.addStudent(jill,2.9 );
           worldHistory1.addStudent(jill,2.9);
            chemistry.addStudent(jill,3.3);
        
        biology.addStudent(ann,4.0);
         geom.addStudent(ann,3.6);
          photo.addStudent(ann,3.2);
           worldHistory1.addStudent(ann,3.6);
         
        
        apush.addStudent(sean,3.0);
         compsci1.addStudent(sean,2.9);
          geom.addStudent(sean,3.2);
           biology.addStudent(sean,3.7);
          
        apush.addTeacher(anderson);
        compsci1.addTeacher(hudson);
        geom.addTeacher(price);
        photo.addTeacher(anderson);
        biology.addTeacher(smith);
        worldHistory1.addTeacher(hudson);
        
//        System.out.println(bobby.getGpa());
//        Course.printNames();
//        Person.printNames();
//        Student.printNames();
//        Teacher.printNames();
//        Student.printNamesGPAGreaterThan(3.5);
//        Student HighestGPA = Student.getHighestGPA();
//        System.out.println(HighestGPA.getName());
//        Teacher mostEC = Teacher.mostElectiveCoursees();
//        System.out.println(mostEC.getName());
//        price.printStudentsNamesOfGrade(11);
      //  hudson.printStudentsNames();
        Student.printKidsWhoHaveHonors();
        System.out.println(sean.getTeacherNameWithLowestMeanLvl().getName());
        Teacher.printTeachersWhoTeachKidsOfGrade(11);
    }
}
