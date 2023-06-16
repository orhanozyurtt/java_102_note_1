package Inheritance_University;

public class Assistant extends Academician{

    private String officeTime;
    public Assistant(String fullName , String phoneNumber , String email,String departman , String academicTitle,String officeTime ){
        super(fullName,phoneNumber,email,departman,academicTitle);
        this.officeTime = officeTime;
    }
    public String getOfficeTime(){
        return this.officeTime;
    }
    public void setOfficeTime(String officeTime){
        this.officeTime = officeTime;
    }
    public void startQuiz(){
        System.out.println("Quiz is started !! ");
    }
}
