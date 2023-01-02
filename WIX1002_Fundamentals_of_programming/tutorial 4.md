# tutorial 4

## 1

### a.

```java
int n=1;
while(n*n*n<2000){
    n++;
}
System.out.println(n+"is the largest integer that n*n*n <2000")
```

### b.

```java
int n=1;
while (!Integer(n*n).toString().startsWith("111111111111")){
    n++
}
System.out.println(n*n+"is a square number starts with 111111111111")
```

### c.

```java
for(int i=0; i<4;i++){
    for(int j=0;j<5;j++){
        System.out.ptint((int)Math.random() * (100 + 1)+"\t");
    }
    System.out.print("\n");
}
```

### d.

```java
int num;
System.out.print(sum(num));

public static int sum(int i) {
    if (i > 1) {
        return i + sum(i - 1);
    } else {
        return 1;
    }
}
```

### e

```java
double m=1,n=25,sum=0;
while(m<=
    sum+=(m/n);
    m++;n++;
}
System.out.printf("%.2f",sum);
```

## 2

### a.

```java
for (int x=0;x <10;x++)
```

### b.

```java
do {
    x+=2;y+=x;
    System.out.println(x + " and " + y);
} while (x < 100)
```

### c.

```java
for( int x=1,y=20;x<y;x++,y-=2)
```

### d.

```java
while(i<10) {
}
if (i==10)
   System.out.println("Program End");
```

## 3

```java
public static int Fibonacci(int num){
    if(num==1){
        return 1;
    } else {
        return Fibonacci(num-1) + Fibonacci(num-2)
    }
}
```

## 4

```java
 pubilc static String ReverseString(String str){
     nstr = "";
     for(int i=0;i<str.length();i++){
         nstr = str.charAt(i)+nstr;
     }
     return nstr;
 }
```
