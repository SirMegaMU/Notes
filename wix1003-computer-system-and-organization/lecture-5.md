# lecture 5

## Half /Full Adder

1 bit

*   Half adder

    > 2 input 2 output

    | x | y | C | S |
    | - | - | - | - |
    | 0 | 0 | 0 | 0 |
    | 0 | 1 | 0 | 1 |
    | 1 | 0 | 0 | 1 |
    | 1 | 1 | 1 | 0 |

    $$
    C=xy \\ S=x\oplus y
    $$
*   Full adder

    have carryin

    > 3 input 2 output

| x | y | $C\_{in}$ | C | S |
| - | - | --------- | - | - |
| 0 | 0 | 0         | 0 | 0 |
| 0 | 0 | 1         | 0 | 1 |
| 0 | 1 | 0         | 0 | 1 |
| 0 | 1 | 1         | 1 | 0 |
| 1 | 0 | 0         | 0 | 1 |
| 1 | 0 | 1         | 1 | 0 |
| 1 | 1 | 0         | 1 | 0 |
| 1 | 1 | 1         | 1 | 1 |

$$
\begin{align*} C&=\sum m(3,5,6,7)\\ &=xC_{in}+xy+yC_{in}\ ;\\ &=xy+(x\oplus y)C_{in}\\ \\ S&=xy'C_{in}'+x'y'C_{in}+xyC_{in}+x'yC_{in}'\\ &=x'(y\oplus C_{in})+x(y\oplus C_{in})'\\ &=x\oplus(y\oplus C_{in})\text{ or }(x\oplus y)\oplus C_{in}\\ \end{align*}
$$

## Combination Gates

input and output

analysis arrangement

* Decoder
* Encoder
* ...

### 4 Bit Adder

using a full adder's C~~out~~ as next full adder's C~~in~~

| Subscript $i$    | 4 | 3 | 2 | 1 |          |
| ---------------- | - | - | - | - | -------- |
| Input Carry      | 0 | 1 | 1 | 0 | C~~1~~   |
| Augend           | 1 | 0 | 1 | 1 | A~~1~~   |
| Addend           | 0 | 0 | 1 | 1 | B~~1~~   |
| **Sum**          | 1 | 1 | 1 | 0 | S~~1~~   |
| **Output Carry** | 0 | 0 | 1 | 1 | C~~i+1~~ |

* Full Substractor

## Code Converter BCD to Excess-3

have don't care

calculate W,X,Y,Z from A,B,C,D separately (4 K-maps)

|    | A | B | C | D | W | X | Y | Z |
| -- | - | - | - | - | - | - | - | - |
| 0  | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 1 |
| 1  | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 0 |
| 2  | 0 | 0 | 1 | 0 | 0 | 1 | 0 | 1 |
| 3  | 0 | 0 | 1 | 1 | 0 | 1 | 1 | 0 |
| 4  | 0 | 1 | 0 | 0 | 0 | 1 | 1 | 1 |
| 5  | 0 | 1 | 0 | 1 | 1 | 0 | 0 | 0 |
| 6  | 0 | 1 | 1 | 0 | 1 | 0 | 0 | 1 |
| 7  | 0 | 1 | 1 | 1 | 1 | 0 | 1 | 0 |
| 8  | 1 | 0 | 0 | 0 | 1 | 0 | 1 | 1 |
| 9  | 1 | 0 | 0 | 1 | 1 | 1 | 0 | 0 |
| 10 | 1 | 0 | 1 | 0 | x | x | x | x |
| 11 | 1 | 0 | 1 | 1 | x | x | x | x |
| 12 | 1 | 1 | 0 | 0 | x | x | x | x |
| 13 | 1 | 1 | 0 | 1 | x | x | x | x |
| 14 | 1 | 1 | 1 | 0 | x | x | x | x |
| 15 | 1 | 1 | 1 | 1 | x | x | x | x |

Binary Sum $\neq$ BCD Sum

BCD sum = binary Sum +0110

![image-20221213102154594](<../WIX1003 Computer System and Organization/assets/L5\_1.png>)
