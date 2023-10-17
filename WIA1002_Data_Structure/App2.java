class Frog{
    String name;
    int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public void setAge(int Age){
        this.age = Age;
    }
}

public class App2 {
    public static void main(String[] args){
        Frog frog1 = new Frog();
        
        frog1.setAge(10);
        frog1.setName("10");

        System.out.println(frog1.getName());
    }
}
