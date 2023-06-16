package Inheritance_University;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("orhan özyurt","534534535","oz@mail.com");
        emp1.diningHall();
        System.out.println(emp1.getFullName());

        System.out.println();

        Academician academician1 = new Academician("mehmet adıl","5423525","mehmet@gam.com","computer1","DR.");
        academician1.setEmail("game1.@email.com");
        System.out.println(academician1.getEmail());
        academician1.enter();
        academician1.exit();
        System.out.println("------");
        academician1.diningHall();
    }
}
