# 1

~~~java
import java.io.*;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class L7Q1 {

    public static void main(String[] args) {

        LinkedHashMap<String, String> data = new LinkedHashMap<>(4);
        Scanner sc = new Scanner(System.in);

        // Structure table data into hashmap
        data.put("WXES1116", "Programming I");
        data.put("WXES1115", "Data Structure");
        data.put("WXES1110", "Operating System");
        data.put("WXES1112", "Computing Mathematics I");

        // Write into courses.dat
        try {
            
            String filename = sc.nextLine();
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(filename));

            for (String code: data.keySet()) {
                file.writeUTF(code);
                file.writeChar(':');
                file.writeUTF(data.get(code));
                file.writeChar(',');
            }

            file.close();
        }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e.getMessage()); }

        // Read from courses.dat
        try {

            ObjectInputStream file = new ObjectInputStream(new FileInputStream("./io_files/courses.dat"));
            String code = "", temp = "";

            System.out.print("Enter the course code: ");
            code = sc.next();

            while (!code.equalsIgnoreCase(temp)) {
                temp = file.readUTF();
                file.readChar();
            }

            System.out.printf("Course Name for %s is %s.", code, file.readUTF());

            file.close();
        }
        catch (EOFException e) {}
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e.getMessage()); }

        sc.close();
    }
}
~~~

# 2

~~~java
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

import java.util.Scanner;

public class L7Q2 {

    public static void main(String[] args) {

        try {

            // Get website contents
            URL url = new URL("https://fsktm.um.edu.my");
            URLConnection connection = url.openConnection();
            InputStream stream = connection.getInputStream();
            Scanner content = new Scanner(stream);

            // Write into index.htm
            
            Scanner sc = new Scanner(System.in);
            String filename = sc.nextLine();
            FileWriter file = new FileWriter(filename);
            String finalFile = "";

            while (content.hasNext()) {
                finalFile += content.nextLine() + "\n";
            }

            file.write(finalFile);

            content.close();
            file.close();
        }
        catch (IOException e) { System.out.printf("IO Error: %s", e.getMessage()); }
    }
}
~~~

# 3

~~~java
import java.io.*;
import java.util.Scanner;

public class L7Q3 {

    public static void main(String[] args) {

        String line = "";

        try {
            Scanner sc = new Scanner(System.in);
            String buffered = sc.nextLine();
            String print = sc.nextLine();
            BufferedReader fileInitial = new BufferedReader(new FileReader(buffered));
            PrintWriter fileFinal = new PrintWriter(new FileOutputStream(print));

            line = fileInitial.readLine();

            while (line != null) {

                for (int i = line.length() - 1; i >= 0; i--) {
                    fileFinal.print(line.charAt(i));
                }

                fileFinal.println();

                line = fileInitial.readLine();
            }

            fileInitial.close();
            fileFinal.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.printf("IO Exception: %s\n", e);
        }
    }
}
~~~

# 4

~~~java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class L7Q4 {

    public static void main(String[] args) {

        int lineCount = 0, wordCount = 0, charCount = 0;
        String line = "";

        try {
            Scanner sc = new Scanner(System.in);
            String filename = sc.nextLine();
            BufferedReader file = new BufferedReader(new FileReader(filename));

            line = file.readLine();

            while (line != null) {

                lineCount += 1;
                wordCount += line.split(" ").length;
                charCount += line.length();

                line = file.readLine();
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.printf("IO Exception: %s\n", e);
        }

        System.out.printf("There are %d lines, %d words and %d characters in this file.\n", lineCount, wordCount, charCount);
    }
}
~~~

# 5

~~~java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class L7Q5 {

    public static void main(String[] args) {

        int recordCount = 0;

        try {
            Scanner sc = new Scanner(System.in);
            String filename = sc.nextLine();
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(filename));
            LinkedHashMap<String, Integer> data_1 = new LinkedHashMap<>();
            LinkedHashMap<String, Character> data_2 = new LinkedHashMap<>();

            recordCount = file.readInt();

            String[] names = new String[recordCount];

            for (int i = 0; i < recordCount; i++) {

                names[i] = file.readUTF();

                data_1.put(names[i], file.readInt());
                data_2.put(names[i], file.readChar());
            }

            Arrays.sort(names);

            for (String name : names) {
                System.out.printf("Name: %-12s, Age: %-2d, Gender: %1s\n", name, data_1.get(name), data_2.get(name));
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.printf("IO Exception: %s\n", e);
        }
    }
}
~~~

# 6

~~~java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class L7Q6 {

    public static void main(String[] args) {

        String line = "";
        String[] lineContent = new String[3];

        try {
            Scanner sc = new Scanner(System.in);
            String productFname = sc.nextLine();
            String orderFname = sc.nextLine();
            BufferedReader productFile = new BufferedReader(new FileReader(productFname));
            BufferedReader orderFile = new BufferedReader(new FileReader(orderFname));

            LinkedHashMap<String, String> dataName = new LinkedHashMap<>();
            LinkedHashMap<String, Integer> dataQuantity = new LinkedHashMap<>();
            LinkedHashMap<String, Double> dataUnitPrice = new LinkedHashMap<>();
            LinkedHashMap<String, String> orderProduct = new LinkedHashMap<>();

            line = productFile.readLine();

            while (line != null) {

                lineContent = line.split(",");

                dataName.put(lineContent[0], lineContent[1]);
                dataUnitPrice.put(lineContent[0], Double.parseDouble(lineContent[2]));

                line = productFile.readLine();
            }

            line = orderFile.readLine();

            while (line != null) {

                lineContent = line.split(",");

                orderProduct.put(lineContent[0], lineContent[1]);
                dataQuantity.put(lineContent[1], Integer.parseInt(lineContent[2]));

                line = orderFile.readLine();
            }

            System.out.println("ProductID        ProductName        Quantity        PricePerUnit        Total");

            for (String order : orderProduct.keySet()) {
                System.out.printf("%-10s%-28s%2d%22.2f%15.2f\n",
                        orderProduct.get(order),
                        dataName.get(orderProduct.get(order)),
                        dataQuantity.get(orderProduct.get(order)),
                        dataUnitPrice.get(orderProduct.get(order)),
                        dataQuantity.get(orderProduct.get(order)) * dataUnitPrice.get(orderProduct.get(order))
                );
            }

            productFile.close();
            orderFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.printf("IO Exception: %s", e);
        }
    }
}
~~~

