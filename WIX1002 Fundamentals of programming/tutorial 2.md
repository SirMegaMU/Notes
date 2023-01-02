# tutorial 2

### 1

* ```java
  System.out.print("Faculty ");
  System.out.print("of ");
  System.out.print("Computer ");
  System.out.print("Science ");
  System.out.print("and ");
  System.out.print("Infomation ");
  System.out.print("Technology");
  ```
* ```java
  System.out.println("Faculty\nof\nComputer\nScience\nand\nInfomation\nTechnology"
  ```

### 2

```java
System.out.println("SDN");
```

### 3

a. `System.out.println("Java Programming");`

b. `System.out.println("Introduction to Java!");`

c.`System.out.println("\t is the horizontal tab character");`

d.`System.out.println("Java is case sensitive!");`

### 4

a. `String matric;`

b.`double PI;`

c.`boolean M = false;`

d.`int P = 8800000000;`

e.`char letter = 'U';`

f.`final String PRO = "Java";`

### 5

a.

```java
double AMOUNT = 32.5;
Amount+=10；
System.out.println("The amount is "+AMOUNT);
```

b.

```java
String chapter = "Summary";
System.out.println(chapter);
```

c.

```
int num;
++num;
num++;
num1=num;
```

d.

```java
int num = 3000;
System.out.println("%4.2f\n",num);
```

e.

```java
String contact;
Scanner keyboard = new Scanner(System.in);
contact = keyboard.nextLine();
```

### 6

```java
import java.util.Scanner;
public class T26 {
    public static void main(String[] args) {
        double diameter;
        System.out.print("Enter the diameter:");
        Scanner keyboard = new Scanner(System.in);
        diameter = keyboard.nextDouble();
        System.out.printf("The circumference of the circle is: %.3f",diameter*2*Math.PI);
    }
}
```

### 7

```java
import java.util.Scanner;

public class T27 {
    public static void main(String[] args) {
        double inch;
        System.out.print("Enter value in inch:");
        Scanner keyboard = new Scanner(System.in);
        inch = keyboard.nextDouble();
        System.out.printf("%.2f inches = %.2f meters",inch,inch*2.54/100);
    }
}
```
