~~~java
public class L1Q2 {
    public static void main(String[] args) {
        profile("Wang Tianren","s2187783","Kolej Kediaman Kinabalu","sirmegamu@outlook.com","+60 173621486");
    }

    public static void profile(String name,String matric_number,String address,String email,String content) {
        System.out.println("Name:\t\t"+name+"\t\t\t\tMatric:\t"+matric_number);
        System.out.println("Address:\t"+address+"\t\tPhone:\t"+content);
        System.out.println("Email:\t\t"+email);
    }
}

~~~



~~~java
public class L1Q3 {
    public static void main(String[] args) {
        System.out.println("*********\t   ***   \t  *  \t    *    ");
        System.out.println("*       *\t *     * \t *** \t   * *   ");
        System.out.println("*       *\t*       *\t*****\t  *   *  ");
        System.out.println("*       *\t*       *\t  *  \t *     * ");
        System.out.println("*       *\t*       *\t  *  \t*       *");
        System.out.println("*       *\t*       *\t  *  \t *     * ");
        System.out.println("*       *\t*       *\t  *  \t  *   *  ");
        System.out.println("*       *\t *     * \t  *  \t   * *   ");
        System.out.println("*********\t   ***   \t  *  \t    *    ");
    }
}

~~~



~~~java
public class L1Q4 {
    public static void main(String[] args) {
    System.out.println("Month\t\t\tAmount\t\tBar chart");
    barchart("January  2016",25);
    barchart("February 2016",16);
    barchart("March    2016",20);
    barchart("April    2016",27);
    barchart("May      2016",32);
    barchart("Jun      2016",8);
    }
    public static void barchart(String month,int amount){
        System.out.print(month+"\t| "+amount*100+" \t| ");
        for (int i = 0; i < amount; i++) {
            System.out.print('■');
        }
        System.out.print('\n');
    }
}

~~~

