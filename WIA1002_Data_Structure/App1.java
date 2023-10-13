class Person {
    String name;
    int age;

    void teaching() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + ", age " + age);
        }
        System.out.println("Hello");
    }

    void calculateYearToGraduate() {
        double yearsLeft = age + 3.5;
        System.out.println(yearsLeft);
    }

    int getAge() {
        return age;
    }
}

public class App1 {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Zaquan";
        person1.age = 30;
        Person person2 = new Person();
        person2.name = "Fatimah";
        person2.age = 12;

        System.out.println(person2.name + "  " + person1.age);
        person2.teaching();
        // person1.calculateYearToGraduate();

        int newage = person1.getAge();
        System.out.println(newage);
    }
}