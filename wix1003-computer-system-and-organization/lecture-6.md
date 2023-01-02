# Combinational Circuit - MSI Circuit

![image-20221213102657887](<../WIX1003 Computer System and Organization/assets/L6\_1.png>)

## Decoder

![image-20221213104211856](<../WIX1003 Computer System and Organization/assets/L6\_2.png>)

tell you the oct of the bin input

> input = 1,0; F~~2~~=1 $(10)_2=(2)_{10}$

*   example

    ![image-20221213104638645](<../WIX1003 Computer System and Organization/assets/L6\_3.png>)

    input = 1,1,1; output=1,1

    > $(111)_2=(7)_{10}$

## Encoder

![image-20221213105103654](<../WIX1003 Computer System and Organization/assets/L6\_4.png>)

tell you which input is 1 (oct to bin ) , if there are one more 1 in the input, the result is don’t care

> input = 0,1,0,0; output=0,1

## Demultiplexer

![image-20221213110108815](<../WIX1003 Computer System and Organization/assets/L6\_5.png>)

only the choosed output will give D, others are 0

## Multiplexer

![image-20221213110455036](<../WIX1003 Computer System and Organization/assets/L6\_6.png>)

$Z=(A S\_0' S\_1')(BS\_0'S\_1 )(CS\_0S\_1')(DS\_0S\_1)$