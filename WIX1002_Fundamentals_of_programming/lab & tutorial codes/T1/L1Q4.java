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
