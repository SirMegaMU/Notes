class Machine{
    private String name;
    private int age;
    
    public Machine(){
        System.out.println("1st constructor running");
    }
    public Machine(String Name){
        System.out.println("2nd constructor running");
        this.name = Name;
    }
    public Machine(String Name, int Age){
        System.out.println("3rd constructor running");
        this.name = Name;
        this.age = Age;
    }
    public String getName(){
        return this.name;
    }
}

public class App3 {
    public static void main(String[] args){
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Machine1");
        Machine machine3 = new Machine("Machine3", 3);
        System.out.println(machine1.getName()+machine2.getName()+machine3.getName());
    }
}
