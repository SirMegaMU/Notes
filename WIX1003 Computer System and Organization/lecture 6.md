# Combinational Circuit - MSI Circuit

![image-20221213102657887](./assets/L6_1.png)

## Decoder

![image-20221213104211856](./assets/L6_2.png)

tell you the oct of the bin input

> input = 1,0; F~2~=1    $(10)_2=(2)_{10}$

- example

  ![image-20221213104638645](./assets/L6_3.png)

  input = 1,1,1; output=1,1

  > $(111)_2=(7)_{10}$ 

## Encoder

![image-20221213105103654](./assets/L6_4.png)

tell you which input is 1 (oct to bin ) , if there are one more 1 in the input, the result is don’t care

> input = 0,1,0,0; output=0,1

## Demultiplexer

![image-20221213110108815](./assets/L6_5.png)

only the choosed output will give D, others are 0



## Multiplexer

![image-20221213110455036](./assets/L6_6.png)

$Z=(A S_0' S_1')(BS_0'S_1 )(CS_0S_1')(DS_0S_1)$