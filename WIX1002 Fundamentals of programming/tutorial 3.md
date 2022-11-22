# 1

## a.

~~~JAVA
if(3*8==27){
    System.out.println("3 * 8 = 27");
} else {
    System.out.println("3 * 8 != 27");
}
~~~

## b.

~~~java
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
if(num % 2 == 1){
    System.out.println("num is odd");
} else {
    System.out.println("num is even");
}
~~~

# c.

~~~java
char val= 'K';
if(Character.isUpperCase(val)){
    System.out.println("Character is Upper");
} else {
    System.out.println("Character is Lower");
}
~~~

# d.

~~~java
List<String> characters = new ArrayList<String>(2);
characters.add("aB");characters.add("Ba");

Collections.sort(character,new Comparator<String>(){
    @override
    public int compare(String c1,String c2){
        return c1.compareToIgnoreCase(c2);
    }
};

~~~

# e.

~~~java
Scanner key = new Scanner(System.in);
int day = key.nextInt();
switch(day){
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
}
~~~

# 2

## a.

~~~java
if(num1 == num2)
~~~

## b.

~~~java
if(x>y && y>z)
~~~

## c.

~~~java
if (s1.equals(s2))
~~~

## d.

~~~java
if(x>0 ||y>0)
~~~

# 3

## a.

~~~
#####
$$$$$
~~~

## b.

~~~
$$$$$
~~~

## c.

~~~
$$$$$
~~~

# d.

~~~
~~~

# 4

~~~java
int num1,num2,num3;
if(num1>=num2 && num1>=num3){
    System.out.println("num1 is the biggest");
} else if(num2>=num3 && num2>=num1){
    System.out.println("num2 is the biggest");
} else {
    System.out.println("num3 is the biggest");
}
~~~

# 5

~~~java
int year;
if (year%4==0 && year%400!=0){
    System.out.println("Leap year")
}
~~~

