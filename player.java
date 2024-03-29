
package footballmanagement;



//The public class is a keyword ehich declars a mamber access as public.
//public members are visible to all other classes.

public class player {
//    The Private keyword is an access modifier used for attributes,
//    methods and constractors, making them only accessable within the declared 
//    class.
    private String name;
    private int number;
    private int age;
    private double salary;

    public player(String name, int number, int age, double salary) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.salary = salary;
    }
    
    
//this is getter mathod of Name
    public String getName() {
        return name;
    }
    
    
//this is setter mathod of Name
    public void setName(String name) {
        this.name = name;
    }
    
    
//this is getter mathod of Number
    public int getNumber() {
        return number;
    }
    
    
//this is setter mathod of Number
    public void setNumber(int number) {
        this.number = number;
    }
    
    
//this is getter mathod of Age
    public int getAge() {
        return age;
    }
    
    
//this is setter mathod of Age
    public void setAge(int age) {
        this.age = age;
    }
    
    
//this is getter mathod of Salary
    public double getSalary() {
        return salary;
    }
    
    
//this is setter mathod of Salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
//display player name, jusrsy number, age, player salary
//    \n using for line break
    
//    The void keyword spesifices that a method should not have a return value.
    
    public void displayPlayer() {
        System.out.println("Player name: " + name + "\nPlayer Number: " + number + "\nPlayer Age: " + age
                + "\nPlayer Salary: " + salary);
    }
}
