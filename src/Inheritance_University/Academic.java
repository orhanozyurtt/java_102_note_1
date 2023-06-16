package Inheritance_University;

public class Academic extends Academician{
    private String doorNumber ;
    public Academic(String fullName , String phoneNuber , String email , String departman , String academicTitle,String doorNumber){
        super(fullName,phoneNuber,email,departman,academicTitle);
        this.doorNumber = doorNumber;
    }
    public String getDoorNumber(){
        return this.doorNumber;
    }
    public void setDoorNumber(String doorNumber){
        this.doorNumber = doorNumber;
    }
    public void meeting(){
        System.out.println("the meeting has started");
    }
    public void makeExam(){
        System.out.println("the exam is started !!!");
    }

}
