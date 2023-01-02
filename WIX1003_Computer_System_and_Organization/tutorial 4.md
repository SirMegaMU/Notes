# tutorial 4

## 1

### a)

| a\bc | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    | m0 | m1 | m3 |    |
| 1    |    |    | m3 |    |

$$
\begin{align*} A'B'C'+A'B'C+A'BC+ABC &=A'B'(C+C')+BC(A'+A)\\ &=A'B'+BC \end{align*}
$$

### b)

| A\BC | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    | m0 | m1 |    | m2 |
| 1    | m4 | m5 |    |    |

$$
\begin{align*} A'B'C'+A'B'C+A'BC'+AB'C'+AB'C &=B(A'+A)(C'+C)+A'C'(B+B')\\ &=B'+A'C' \end{align*}
$$

### c)

| x\y | 0  | 1  |
| --- | -- | -- |
| 0   | m0 | m1 |
| 1   |    | m3 |

$$
\begin{align*} x'y'+xy+x'y &=x'(y+y')+y(x'+x)\\ &=x'+y \end{align*}
$$

## 2

### a)

| X\YZ | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    |    |    | m3 |    |
| 1    | m4 |    | m7 | m6 |

$$
\begin{align*} F(X,Y,Z) &=\sum m(3,4,6,7)\\ &=YZ(X+X')+XZ'(Y+Y')\\ &=YZ+XZ' \end{align*}
$$

### b)

| X\YZ | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    | m0 |    |    | m2 |
| 1    | m4 | m5 |    | m6 |

$$
\begin{align*} F(X,Y,Z) &=\sum m(0,2,4,5,6)\\ &=Z(X+X')(Y+Y')+XY'(Z+Z')\\ &=Z+XY' \end{align*}
$$

### c)

| AB\CD | 00  | 01  | 11 | 10  |
| ----- | --- | --- | -- | --- |
| 00    | m0  | m1  |    | m2  |
| 01    | m4  | m5  |    | m6  |
| 11    | m12 | m13 |    | m14 |
| 10    | m8  | m9  |    |     |

$$
\begin{align*} F(A,B,C,D) &= \sum m(0,1,2,4,5,6,8,9,12,13,14) \\ &= C'(A+A')(B+B')(C+C')+A'D'(B+B')(C+C')+BD'(A+A')(C+C')* \\ &= C+A'D'+BD' \end{align*}
$$

## 3

### a)

| A\BC | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    |    |    |    |    |
| 1    |    | m5 | m7 | m6 |

$$
\begin{align*} AB+AB'C+ABC &=\sum m(5,6,7)\\ &=AC(B+B')+AB(C+C')\\ &=AC+AB \end{align*}
$$

### b)

| A\BC | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    |    |    | m3 |    |
| 1    | m4 | m5 | m7 | m6 |

$$
\begin{align*} A+BC &=\sum m(3,4,5,6,7)\\ &=A(B+B')(C+C')+BC(A+A')\\ &=A+BC \end{align*}
$$

### c)

| AB\CD | 00 | 01  | 11 | 10  |
| ----- | -- | --- | -- | --- |
| 00    |    |     |    |     |
| 01    |    | m5  |    | m6  |
| 11    |    | m13 |    | m14 |
| 10    |    | m9  |    | m10 |

$$
\begin{align*} AB'C'D+ACD'+BC'D+A'BCD' &=\sum m(5,6,9,10,13,14)\\ &=BC'D(A+A')+AC'D(B+B')+BCD'(A+A')+ACD'(B+B')\\ &=BCD'+AC'D+BCD'+ACD' \end{align*}
$$

### d)

| AB\CD | 00 | 01  | 11  | 10  |
| ----- | -- | --- | --- | --- |
| 00    |    |     | m3  |     |
| 01    |    | m5  | m7  |     |
| 11    |    | m13 | m15 |     |
| 10    | m8 | m9  | m11 | m10 |

$$
\begin{align*} AB'+AB'C'D+CD+BC'D+ABCD &=\sum m(3,5,7,8,9,10,11,13,15)\\ &=AB'(C+C')(D+D')+BD(A+A')(C+C')+A'CD(B+B')\\ &=AB'+BD+AC'D \end{align*}
$$

## 4

### a)

| X\YZ | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    |    |    | m3 |    |
| 1    |    | m5 | m7 | m6 |

### b)

| AB\CD | 00 | 01  | 11  | 10  |
| ----- | -- | --- | --- | --- |
| 00    | m0 |     |     | m2  |
| 01    |    |     | m7  | m6  |
| 11    |    | m13 | m15 |     |
| 10    | m8 |     |     | m10 |

## 5

### a)

| WX\YZ | 00 | 01  | 11  | 10  |
| ----- | -- | --- | --- | --- |
| 00    | m0 |     |     | m2  |
| 01    |    | m5  | m7  |     |
| 11    |    | m13 | m15 | m14 |
| 10    | m8 |     |     | m10 |

![image-20221113162217363](../Pictures/study/g1s1/image-20221113162217363.png)

### b)

| AB\CD | 00 | 01 | 11  | 10  |
| ----- | -- | -- | --- | --- |
| 00    | m0 |    | m3  | m2  |
| 01    |    | m5 | m7  |     |
| 11    |    |    | m15 | m14 |
| 10    | m8 |    | m11 | m10 |

![image-20221113162507049](../Pictures/study/g1s1/image-20221113162507049.png)

## 6

### a)

| A\BC | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    | m0 | M1 | m3 | m2 |
| 1    | M4 | M5 | m7 | M6 |

$$
\begin{align*} (A+B')(A+C')(A'+B'+C) &=\prod M(1,2,4,5,6)\\ &=\sum m(0,2,3,7)\\ &=A'C'(B+B')+BC(A+A')\\ &=A'C'+BC \end{align*}
$$

### b)

| AB\CD | 00  | 01  | 11  | 10  |
| ----- | --- | --- | --- | --- |
| 00    | M0  | M1  | m3  | m2  |
| 01    | M4  | M5  | M7  | M6  |
| 11    | m12 | M13 | m15 | m14 |
| 10    | m8  | m9  | m11 | M10 |

$$
\begin{align*} &(A'+B)(A'+B'+C)(B+C'+D)(A+B'+C+D')\\ &=\prod M(0,1,4,5,6,7,10,13)\\ &=\sum m(2,3,8,9,11,12,14,15)\\ &=A'B'C(D+D')+AB'C'(D+D')+ACD(B+B')+ABC(D+D')\\ &=A'B'C+AB'C'+ACD+ABC \end{align*}
$$

## 7

> PI: green
>
> EPI: red

### a)

| A\BC | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    | x  |    | m3 |    |
| 1    |    | m5 | x  | m6 |

$$
\begin{align*} F(A,B,C) &=\sum m(3,5,6)\\ &=AC(B+B')+AB(C+C')+BC(A+A')\\ &=AC+AB+BC \end{align*}
$$

![image-20221113162707646](../Pictures/study/g1s1/image-20221113162707646.png)

### b)

| WX\YZ | 00 | 01 | 11  | 10  |
| ----- | -- | -- | --- | --- |
| 00    | m0 |    |     | m2  |
| 01    | m4 | m5 | x   |     |
| 11    |    | x  | m15 | m14 |
| 10    | m8 |    |     | x   |

$$
\begin{align*} F(W,X,Y,Z) &=\sum m(0,2,4,8,14,15)\\ &=X'Z'(W+W')(Y+Y')+XZ(W+W')(Y+Y')+W'XY'(Z+Z')+WXY(Z+Z')\\ &=X'Z'+XZ+W'XY'+WXY \end{align*}
$$

![image-20221113162800387](../Pictures/study/g1s1/image-20221113162800387.png)
