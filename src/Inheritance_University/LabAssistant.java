package Inheritance_University;

public class LabAssistant extends Assistant{


    public LabAssistant(String fullName , String phoneNumber , String email,String departman , String academicTitle,String officeTime ){
        super(fullName,phoneNumber,email,departman,academicTitle,officeTime);

    }
    public void enterLab(){
        System.out.println("enter lab");
    }
    public void getLesson(){
        System.out.println("entered the class");
    }

}
