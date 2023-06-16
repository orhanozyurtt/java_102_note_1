package Inheritance_University;
//super class
public class Employee {

    private String fullName;
    private String phoneNumber;
    private String email;



    public Employee(String fullName , String phoneNumber , String email){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;


    }

    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void enter(){
        System.out.println("entry to school happened ");
    }
    public void exit(){
        System.out.println("out of school");
    }
    public void diningHall(){
        System.out.println("entry dining hall");
    }
}
