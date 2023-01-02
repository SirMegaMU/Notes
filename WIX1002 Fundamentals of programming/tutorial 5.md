# tutorial 5

## 1

### a.

```java
float[] ary_float = new float[12];
```

### b.

```java
char[] AtE= {'A','B','C','D','E'};
```

### c.

```java
String[] Names = new String[100];
```

### d.

```java
int[][] tabled = new int[6][2];
```

### e.

```java
int[][] tablee = {{6,9},{2,5},{4,6}}
```

### f.

```java
tablee[1][1]=4;
tablee[2] = {3,7};
```

## 2

### a.

```java
String[] code = {"AAA","AAB","AAC","AAD"};
```

### b.

```java
int[] num = new int[10];
for(int k=0; k<=num.length(); k++)
	sum+=num;
```

### c.

```java
int[][] t = new int[3][3];
t[1][2] = 5;
```

### d.

```java
int i=4;
int[] score = new int[6];
score [1] = 78;
score[++i] = 100;
```

## 3

```java
marks = {
    961, 31, 1, 31,31  
};
```

## 4

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T54 {
    public static void main(String[] args) throws IOException {
        String[] str;
        int n=0;
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        str = bi.readLine().split(" ");
        for (String s : str) {
            if (s == "the") {
                n++;
            }
        }
        System.out.println(n);
    }
}
```

## 5

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T55 {
    public static void main(String[] args) throws IOException {
        String[] str;
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        str = bi.readLine().split(" ");
        String[] reversed = new String[str.length];
        for (int n = 0; n < str.length; n++) {
            String s = str[n];
            String r = "";
            char c;
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                r=c+r;
            }
            reversed[n]=r;
        }
        for (int i = reversed.length; i >0 ; i--) {
            System.out.println(reversed[i]+"\n");
        }
    }
}
```
