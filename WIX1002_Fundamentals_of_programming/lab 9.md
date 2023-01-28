# 1

~~~java
package L9Q1;

import java.util.Scanner;

public class Shape {

    protected final String NAME;
    protected double perimeter, area;

    // Constructor
    public Shape(String name) {
        this.NAME = name;
    }

    // Methods
    public void setPerimeter(double p) {
        this.perimeter = p;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void showDetails() {
        System.out.printf("%s: Perimeter = %.2f, Area = %2.f", this.NAME, this.perimeter, this.area);
    }

    public class Circle extends Shape {

        protected double diameter;

        // Constructor
        public Circle() {
            super("Circle");
            this.inputDiameter();
            this.compute();
        }

        // Methods
        private void inputDiameter() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the diameter of circle: ");
            this.diameter = sc.nextDouble();
            sc.close();
        }

        private void compute() {
            this.perimeter = Math.PI * this.diameter;
            this.area = Math.PI * this.diameter * this.diameter / 4.0;
        }
    }

    public class Rectangle extends Shape {

        protected double side1, side2;

        // Constructor
        public Rectangle() {
            super("Rectangle");
            this.inputSide();
            this.compute();
        }

        // Methods
        private void inputSide() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of rectangle: ");
            this.side1 = sc.nextDouble();
            System.out.print("Enter the width of rectangle:");
            this.side2 = sc.nextDouble();
            sc.close();
        }

        private void compute() {
            this.area = this.side1 * this.side2;
            this.perimeter = 2 * (this.side1 + this.side2);
        }
    }

    public class Square extends Shape {

        protected double side;

        // Constructor
        public Square() {
            super("Square");
            this.inputSide();
            this.compute();
        }

        // Methods
        private void inputSide() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter side length of square: ");
            this.side = sc.nextDouble();
            sc.close();
        }

        private void compute() {
            this.perimeter = this.side * 4;
            this.area = this.side * this.side;
        }
    }
}
~~~

# 2

~~~java
package L9Q2_3;

public class PersonProfile {

    protected final String NAME, DOB;
    protected final char GENDER;

    // Constructor
    public PersonProfile(String name, char gender, String dob) {
        this.NAME = name;
        this.GENDER = gender;
        this.DOB = dob;
    }

    // Method
    public void displayProfile() {
        System.out.printf("Name: %s\nGender: %s\nBirth: %s\n", this.NAME, this.GENDER, this.DOB);
    }
    
}
~~~

~~~java
package L9Q2_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedHashMap;

public class Lecturer extends PersonProfile {

    protected String courseCode;
    protected LinkedHashMap<String, String> courseName = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> session = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> semester = new LinkedHashMap<>();
    protected LinkedHashMap<String, Double> creditHours = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> studentCount = new LinkedHashMap<>();

    // Constructor
    public Lecturer(String name, char gender, String dob, String fileName) {

        super(name, gender, dob);
        try {
            BufferedReader file = new BufferedReader(new FileReader("./L9Q2_3/src/" + fileName));
            while ((this.courseCode = file.readLine()) != null) {
                this.courseName.put(this.courseCode, file.readLine());
                this.session.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.semester.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.creditHours.put(this.courseCode, Double.parseDouble(file.readLine()));
                this.studentCount.put(this.courseCode, Integer.parseInt(file.readLine()));
            }
            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }

    // Methods
    private void updateCreditHours() {
        for (String code: this.creditHours.keySet()) {
            double credits = this.creditHours.get(code);
            int count = this.studentCount.get(code);
            this.creditHours.put(code, credits * (count >= 150 ? 3 : count >= 100 ? 2 : count >= 50 ? 1.5 : 1));
        }
    }

    public void displayDetails() {
        this.displayProfile();
        this.updateCreditHours();
        System.out.println("\nCourse Profile:\n===");
        for (String code: this.courseName.keySet()) {
            System.out.printf("%s %s (Semester %d Session %d): %.2f Credit Hours for %d students.\n",
                    code, this.courseName.get(code), this.semester.get(code), this.session.get(code), this.creditHours.get(code), this.studentCount.get(code)
            );
        }
        System.out.println();
    }
}
~~~

~~~java
package L9Q2_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedHashMap;

public class Student extends PersonProfile {

    // Declaration
    protected String courseCode;
    protected LinkedHashMap<String, String> courseName = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> semester = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> session = new LinkedHashMap<>();
    protected LinkedHashMap<String, Double> mark = new LinkedHashMap<>();
    
    // Constructor
    public Student(String name, char gender, String dob, String fileName) {
        
        super(name, gender, dob);
        try {
            BufferedReader file = new BufferedReader(new FileReader("./L9Q2_3/src/" + fileName));
            while ((this.courseCode = file.readLine()) != null) {
                this.courseName.put(this.courseCode, file.readLine());
                this.semester.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.session.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.mark.put(this.courseCode, Double.parseDouble(file.readLine()));
            }
            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }

    // Methods
    private String getGrade(double mark) {
        if (mark >= 85) { return "A"; }
        if (mark >= 75) { return "A-"; }
        if (mark >= 70) { return "B+"; }
        if (mark >= 65) { return "B"; }
        if (mark >= 60) { return "B-"; }
        if (mark >= 55) { return "C+"; }
        if (mark >= 45) { return "D"; }
        if (mark >= 35) { return "E"; }
        else { return "F"; }
    }

    public void displayDetails() {
        this.displayProfile();
        System.out.println("\nCourse Details:\n===");
        for (String code: this.courseName.keySet()) {
            System.out.printf("%s %s (Semester %d Session %d): Grade %s.\n", 
                code, this.courseName.get(code), this.semester.get(code), this.session.get(code), getGrade(this.mark.get(code))
            );
        }
        System.out.println();
    }
}
~~~

# 3

~~~java
public class Dice {

    protected String playerName;

    // Constructor
    public Dice(String name) {
        this.playerName = name;
    }

    // Methods
    public int rollDice() {
        return (int) Math.round(Math.random() * 5) + 1;
    }
}
~~~

~~~java
public class Game1 extends Dice {

    protected final String NAME;
    protected final Dice d1, d2;
    protected int playerScore;

    // Constructor
    public Game1(String name) {
        super(name);
        this.NAME = name;
        this.d1 = new Dice(this.NAME);
        this.d2 = new Dice(this.NAME);
    }

    // Methods
    public void roll() {
        int d1Score = 0, d2Score = 0;
        do {
            d1Score = this.d1.rollDice();
            d2Score = this.d2.rollDice();
            System.out.printf("%s rolled %d and %d!\n", this.NAME, d1Score, d2Score);
            this.playerScore += d1Score + d2Score;
        }
        while (d1Score == d2Score);
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public void showPlayerScore() {
        System.out.printf("Score for %s: %d\n", this.NAME, this.playerScore);
    }
}
~~~

~~~java
public class Game2 extends Dice {

    protected final String NAME;
    protected Dice dice;
    protected int playerScore;

    // Constructor
    public Game2(String name) {
        super(name);
        this.NAME = name;
        this.dice = new Dice(this.NAME);
    }

    // Methods
    public void roll() {
        int score = this.dice.rollDice();
        System.out.printf("%s rolled %d!\n", this.NAME, score);
        if (score == 6) {
            score = this.dice.rollDice();
            System.out.printf("%s rolled %d!\n", this.NAME, score);
            if (score == 6) { score = 0; }
        }
        if (this.playerScore + score <= 100) { this.playerScore += score; };
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public void showPlayerScore() {
        System.out.printf("Score for %s: %d\n", this.NAME, this.playerScore);
    }
}
~~~