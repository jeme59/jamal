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

package ex_1;

import java.util.HashMap;

public class Person {
    private String Name;
    private String Gender;
    private String Address;
    private int Number;
    private int Height;
    private int Weight;
    private String Date;
    private String Email;
    private int Id;


    public void setName(String N){
        this.Name=N;
    }
    public String getName(){
        return Name;
    }
    public void setGender(String G){
        this.Gender=G;
    }
    public String getGender(){
        return Gender;
    }
    public void setAddress(String A){
        this.Address=A;
    }
    public String getAddress(){
        return Address;
    }
    public void setNumber(int N){
        this.Number=N;
    }
    public int getNumber(){
        return Number;
    }
    public void setHeight(int H){
        this.Height=H;
    }
    public int getHeight(){
        return Height;
    }
    public void setWeight(int W){
        this.Weight=W;
    }
    public int getWeight(){
        return Weight;
    }
    public void setDate(String D){
        this.Date=D;
    }
    public String getDate(){
        return Date;
    }
    public void setEmail(String E){
        this.Email=E;
    }
    public String getEmail(){
        return Email;
    }
    public void setId(int I){
        this.Id=I;
    }
    public int getId(){
        return Id;
    }
    public Person(String Name, String Gender, String Address, int Number, int height, int Weight, String Date,String email, int Id){
        this.Name=Name;
        this.Gender=Gender;
        this.Address=Address;
        this.Number=Number;
        this.Height=height;
        this.Weight=Weight;
        this.Date=Date;
        this.Email=email;
        this.Id=Id;
    }
    public Person( Person otherPerson){
        this.Name=otherPerson.Name;
        this.Gender=otherPerson.Gender;
        this.Address=otherPerson.Address;
        this.Number=otherPerson.Number;
        this.Height=otherPerson.Height;
        this.Weight=otherPerson.Weight;
        this.Date=otherPerson.Date;
        this.Email=otherPerson.Email;
        this.Id=otherPerson.Id;
    }
    public String toString(){
        return "the name:"+getName()+"\n"
                +"the Gender:"+getGender()+"\n"
                +"the Address :"+getAddress()+"\n"
                +"the Number :"+getNumber()+"\n"
                +"the height :"+getHeight()+"\n"
                +"the weight:"+getWeight()+"\n"
                +"the Date :"+getDate()+"\n"
                +"the Email :"+getEmail()+"\n"
                +"the Id :"+getId();
    }
}
