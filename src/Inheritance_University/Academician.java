package Inheritance_University;

public class Academician extends Employee{
    private String departman;
    private String academicTitle;
    public Academician(String fullName , String phoneNumber , String email,String departman , String  academicTitle ){
        super(fullName,phoneNumber,email);
        this.departman = departman;
        this.academicTitle = academicTitle;

    }
    public void getLesson(){
        System.out.println("entered the class");
    }

    @Override
    public void diningHall(){
        System.out.println(this.getFullName()+" "+"entry dining hall");
    }
}
