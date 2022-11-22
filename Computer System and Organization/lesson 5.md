# Half /Full Adder

1 bit

- Half adder 

  > 2 input 2 output

  | x    | y    | C    | S    |
  | ---- | ---- | ---- | ---- |
  | 0    | 0    | 0    | 0    |
  | 0    | 1    | 0    | 1    |
  | 1    | 0    | 0    | 1    |
  | 1    | 1    | 1    | 0    |

  $$
  C=xy \\
  S=x\oplus y
  $$

  

- Full adder

  have carryin

  > 3 input 2 output

| x    | y    | $C_{in}$ | C    | S    |
| ---- | ---- | -------- | ---- | ---- |
| 0    | 0    | 0        | 0    | 0    |
| 0    | 0    | 1        | 0    | 1    |
| 0    | 1    | 0        | 0    | 1    |
| 0    | 1    | 1        | 1    | 0    |
| 1    | 0    | 0        | 0    | 1    |
| 1    | 0    | 1        | 1    | 0    |
| 1    | 1    | 0        | 1    | 0    |
| 1    | 1    | 1        | 1    | 1    |

$$
\begin{align*}
C&=\sum m(3,5,6,7)\\
&=xC_{in}+xy+yC_{in}\ ;\\
&=xy+(x\oplus y)C_{in}\\
\\
S&=xy'C_{in}'+x'y'C_{in}+xyC_{in}+x'yC_{in}'\\
&=x'(y\oplus C_{in})+x(y\oplus C_{in})'\\
&=x\oplus(y\oplus C_{in})\text{ or }(x\oplus y)\oplus C_{in}\\

\end{align*}
$$



# Combination Gates

input and output

analysis arrangement

- Decoder
- Encoder

- ...

## 4 Bit Adder

using a full adder's C~out~ as next full adder's C~in~

| Subscript $i$    | 4    | 3    | 2    | 1    |        |
| ---------------- | ---- | ---- | ---- | ---- | ------ |
| Input Carry      | 0    | 1    | 1    | 0    | C~1~   |
| Augend           | 1    | 0    | 1    | 1    | A~1~   |
| Addend           | 0    | 0    | 1    | 1    | B~1~   |
| **Sum**          | 1    | 1    | 1    | 0    | S~1~   |
| **Output Carry** | 0    | 0    | 1    | 1    | C~i+1~ |

