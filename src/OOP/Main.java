package OOP;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("orhan","öz","1","izmir",85);
        Student s2 = new Student("ahmet","bük","2","izmir",85);
        Student s3 = new Student("mert","özt","3","ankara",85);

       // System.out.println(s2.getNote());
  //      System.out.println(s1.getNote());
        Instructor teacher = new Instructor("mahmut","öz","CENG");


        // course has a Instructor (sınıfın bir öğretmeni vardır)
        Course k1 = new Course("mat","101",teacher);

        System.out.println(k1.getInstructor().getName()  +" "+ k1.getInstructor().getSurname());
/*
        Student[] st = {s1,s2,s3};
        System.out.println("ortalama = "+k1.calcAvarage(st));;*/

    }
}
