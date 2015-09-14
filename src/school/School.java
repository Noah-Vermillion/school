
package school;

 
public class School {

    public static void main(String[] args) 
    {
         Person joe = Person.addPerson("Joe", Person.Gender.Male, 134);
         Person may = Person.addPerson("May", Person.Gender.Female, 112);
         Person max = Person.addPerson("Max", Person.Gender.Male, 100);
         Person joey = Person.addPerson("Joey", Person.Gender.Male, 176);
         Person jessie = Person.addPerson("Jessie", Person.Gender.Female, 134);
         Person lynda = Person.addPerson("Lynda", Person.Gender.Female, 140);
         Person marry = Person.addPerson("Marry", Person.Gender.Female, 135);
         Person luke = Person.addPerson("Luke", Person.Gender.Male, 148);
         Person johnny = Person.addPerson("Johnny", Person.Gender.Male, 158);
         Person karen = Person.addPerson("Karen", Person.Gender.Female, 113);
         Person.printNames();
         Person.printWeight();
         Person.printNames(Person.Gender.Male);
         Person.printNames(Person.Gender.Female);
//         System.out.println(joe);
    }
}
