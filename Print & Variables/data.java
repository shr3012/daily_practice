// Print your name, age and city in 3 different lines.

import java.util.Scanner;
class details{
    String name;
    int age;
    String city;
    
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
    }
}
public class data{
    public static void main(String [] args){
        details d = new details();
        d.name = "Shreya";
        d.age = 22;
        d.city = "Patna";
        
        d.display();
    }
}