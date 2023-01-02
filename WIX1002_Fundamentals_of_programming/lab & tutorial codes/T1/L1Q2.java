package T1;

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
