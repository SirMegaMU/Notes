# Karnaugh Map

if $F(a,b)=\sum m(0,1,3)$ , then $F'(a,b)=\sum m(2)=\prod M(0,1,3)$

- Venn Diagram

## 2 var

| a\b  | 0      | 1     |
| ---- | ------ | ----- |
| 0    | $a'b'$ | $a'b$ |
| 1    | $ab'$  | $ab$  |

$ab'+ab=a(b+b')=a$

## 3 var

using gray code 

| a\bc | 00                | 01               | 11              | 10               |
| ---- | ----------------- | ---------------- | --------------- | ---------------- |
| 0    | $a'b'c'$, m0(000) | $a'b'c$, m1(001) | $a'bc$, m3(011) | $a'bc'$, m2(010) |
| 1    | $ab'c'$, m4(100)  | m5(101)          | m7(111)         | m6(110)          |

## 4+ var

same , vars follow the order in the function to get the minterm

(w,x,y,z)

| wx\yz | 00   | 01   | 11   | 10   |
| ----- | ---- | ---- | ---- | ---- |
| 00    | m0   | m1   | m3   | m2   |
| 01    | m4   | m5   | m7   | m6   |
| 11    | m12  | m13  | m15  | m14  |
| 10    | m8   | m9   | m11  | m10  |

you can still  separate them into two or more charts to make it simple,

for (v,w,x,y,z),you can draw a chart for v'(w,x,y,z) and another one for v(w,x,y,z)  

## Using

- squared
- adjacent

- $2^n$

- choose the max loop

- no extra cluster

### for 4 var

- 1 cell , 4 literal
- 2 cell , 3 literal
- 4 cell , 2 literal
- 8 cell , 1 literal
- 16 cell, 0 literal

![image-20221108111934379](../../../Pictures/study/g1s1/image-20221108111934379.png)

## others

- EPI non-EPI

- POS think the value '0' not '1' in the same rule, then use De Morgan law to change SOP into POS

- don't care condition

  ![image-20221108115114358](../../../Pictures/study/g1s1/image-20221108115114358.png)

  can map 1 with x, but x is unnecessarily to be mapped