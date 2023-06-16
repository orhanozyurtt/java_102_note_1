package tryCode;
import java.io.*;
import java.util.*;

class Aritmetic{


    public int add(int numb1 , int numb2){
        return (numb1 + numb2);

    }
}
class Adder extends Aritmetic{

    public Adder(int numb1, int numb2){
        System.out.println("My superclass is: Arithmetic");
        Aritmetic art = new Aritmetic();
        System.out.println( art.add(numb1,numb2));
    }
}
public class try1 {
    public static void main(String[] args) {
        Adder adder = new Adder(5,6);
    }
}
/*
class Animal{
    void walk(){

        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am walking");
    }
    void sing(){
        System.out.println("I am singing");
    }
}
*/