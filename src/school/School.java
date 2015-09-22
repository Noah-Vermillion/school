
package school;

 
public class School {

    public static void main(String[] args) 
    {
         Person joe = Person.addPerson("Joe", Person.Gender.Male, 146);
         Person may = Person.addPerson("May", Person.Gender.Female, 112);
         Person max = Person.addPerson("Max", Person.Gender.Male, 123);
         Person joey = Person.addPerson("Joey", Person.Gender.Male, 176);
         Person jessie = Person.addPerson("Jessie", Person.Gender.Female, 105);
         Person lynda = Person.addPerson("Lynda", Person.Gender.Female, 140);
         Person marry = Person.addPerson("Marry", Person.Gender.Female, 135);
         Person luke = Person.addPerson("Luke", Person.Gender.Male, 148);
         Person johnny = Person.addPerson("Johnny", Person.Gender.Male, 158);
         Person karen = Person.addPerson("Karen", Person.Gender.Female, 113);
         
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
         
         ///////////////////////////////////////////////////////////////////////
         
         Course geom = Course.addCourse("Geometry", Course.Type.Math, 2);
         Course music = Course.addCourse("Music", Course.Type.Elective, 1);
         
         ///////////////////////////////////////////////////////////////////////
         
         Person.printNames();
         Person.printWeight();
         Person.printNames(Person.Gender.Male);
         Person.printNames(Person.Gender.Female);
         Person.printAge();

         ///////////////////////////////////////////////////////////////////////
//       
         geom.addPerson(joe);
         
         ///////////////////////////////////////////////////////////////////////
         
         Course.printCourses();
         Course.printPeriod();         
         
         ///////////////////////////////////////////////////////////////////////
         
         Student bobby = Student.addStudent("Bobby", Person.Gender.Male, 158, 10);
       //  Student bobby = new Student("Bobby",Person.Gender.Female,136,12);
         System.out.println(bobby.getName());
         
         ///////////////////////////////////////////////////////////////////////
         
//         System.out.println(joe);
    }
}
