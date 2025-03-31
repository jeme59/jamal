# jamal
package ex_1;

public class tester {
public static void main(String[] args) {
Person person1=new Person("jamal", "male","Hebron",052,178,88,"5/9/2006","jamal.janazreh@gmail.com",216308841);

        Person person2=new Person(person1);

        System.out.println(person1);
        System.out.println("..............");
        person2.setName("jamel");
        person2.getName();
        System.out.println(person2);
    }

}
