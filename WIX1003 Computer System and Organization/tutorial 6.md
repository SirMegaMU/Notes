# tutorial 6

## 1

$$
\begin{align*} T_1&=(XY)'\\ T_2&=(T_1 X)'=XY+X'\\ T_3&=(T_1 Y)'=XY+Y'\\ T_4&=(T_2 T_3 Z)'= T_1X+T_2X+Z'\\ T_5&=(T_3 Z)'=T_1Y+Z'\\ \\ F&=(T_4 T_5)'\\ &=T_1T_2Z+T_3Z\\ &=(XY)'(XY+X')Z+(XY+Y')Z\\ &=Z(XY+Y'+(X'+Y')(XY+X'))\\ &=ZXY+ZY'+ZX'+ZY'X'\\ &=XY'+Z\\ &=((XY')'Z')'\\ \end{align*}
$$

![image-20221126150825362](assets/T6\_1.png)

| X\YZ | 00 | 01 | 11 | 10 |
| ---- | -- | -- | -- | -- |
| 0    |    | 1  | 1  |    |
| 1    | 1  | 1  | 1  |    |

| X | Y | Z | F |
| - | - | - | - |
| 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 1 |
| 0 | 1 | 0 | 0 |
| 0 | 1 | 1 | 1 |
| 1 | 0 | 0 | 1 |
| 1 | 0 | 1 | 1 |
| 1 | 1 | 0 | 0 |
| 1 | 1 | 1 | 1 |

## 2

$$
\begin{align*} F&=((X+(X+Y)')'+(Y+(X+Y)')')'\\ &=((X+X'Y')'+(Y+X'Y')')'\\ &=((X(X+Y))'+(Y(X+Y))')'\\ &=(X(X+Y))(Y(X+Y))\\ &=(X+Y)XY\\ &=(X\oplus Y)' \end{align*}
$$

## 3

form 3 truth table

## 4

$$
\begin{align*} M&=SB+AS'\\ \\ T_1&=ZY'+YZ'\\ \\ F&=YX'+XT_1\\ &=YX'+X(ZY'+YZ')\\ &=YX'+XY'Z+XYZ'\\ &=XY'Z+X'Y+YZ'\\ \\ G&=T_1'X'+X'Z\\ &=(ZY'+YZ')X+X'Z\\ &=XY'Z+XYZ'+X'Z\\ &=X'Y+X'Z+XYZ' \end{align*}
$$
