package Abstract_class;

abstract class Book {
    String title;
    abstract void setTitle(String s);
}

class MyBook extends Book{

    @Override
    void setTitle(String s){
        System.out.println("The title is:" +" "+ s);
    }
}
