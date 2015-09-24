
package school;

 
public class School {

    public static void main(String[] args) 
    {
         Person joe = Person.addPerson("Joe", Person.Gender.Male, 146);
         Student may = Student.addStudent("May", Person.Gender.Female, 112,10);
         Student max = Student.addStudent("Max", Person.Gender.Male, 123,10);
         Student joey = Student.addStudent("Joey", Person.Gender.Male, 176,10);
         Student jessie = Student.addStudent("Jessie", Person.Gender.Female, 105,10);
         Student lynda = Student.addStudent("Lynda", Person.Gender.Female, 140,10);
         Student marry = Student.addStudent("Marry", Person.Gender.Female, 135,10);
         Student luke = Student.addStudent("Luke", Person.Gender.Male, 148,10);
         Student johnny = Student.addStudent("Johnny", Person.Gender.Male, 158,10);
         Student karen = Student.addStudent("Karen", Person.Gender.Female, 113,10);
         
         Student bobby = Student.addStudent("Bobby", Person.Gender.Female, 158, 10);
         Student noah = Student.addStudent("Noah", Person.Gender.Male, 206, 10);
       //  Student bobby = new Student("Bobby",Person.Gender.Female,136,12);
         
         joe.setBirthDate(14, 9, 1999);
         joe.getAge();
         may.setBirthDate(28, 12, 1999);
         may.getAge();
         max.setBirthDate(12, 10, 2002);
         max.getAge();
         joey.setBirthDate(4, 6, 1998);
         joey.getAge();
         jessie.setBirthDate(18, 7, 2000);
         jessie.getAge();
         lynda.setBirthDate(30, 2, 1999);
         lynda.getAge();
         marry.setBirthDate(16, 5, 2002);
         marry.getAge();
         luke.setBirthDate(19, 1, 2002);
         luke.getAge();
         johnny.setBirthDate(12, 6, 1997);
         johnny.getAge();
         karen.setBirthDate(31, 7, 2000);
         karen.getAge();
         bobby.setBirthDate(16, 8, 1998);
         bobby.getAge();
         noah.setBirthDate(25, 5, 2000);
         noah.getAge();
         
         ///////////////////////////////////////////////////////////////////////
         
         Course geom = Course.addCourse("Geometry", Course.Type.Math, 2);
         Course music = Course.addCourse("Music", Course.Type.Elective, 1);
         
         ///////////////////////////////////////////////////////////////////////
         
         geom.addStudent(noah);
         
         ///////////////////////////////////////////////////////////////////////
         Person.printNames();
         Student.printName();
         Person.printWeight();
         Person.printNames(Person.Gender.Male);
         Person.printNames(Person.Gender.Female);
         Person.printAge();
         System.out.println(noah.getName() + " - " + noah.getCourseName());
//         noah.printCourse();
         
         ///////////////////////////////////////////////////////////////////////
         
         Course.printCourses();
         Course.printPeriod();         
         
         ///////////////////////////////////////////////////////////////////////
         
//         System.out.println(joe);
    }
}
