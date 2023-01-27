# Traffic Light

## Code

~~~asm
		ORG 	00H
		AJMP 	TOP

; DEFINES

; RESET DLAULT STATUS

DEFAULT:MOV	A, #0F0H
		MOV 	B, #0FH
		MOV 	P0, A
		MOV	P1, B
		MOV	P2, B
		MOV 	A, #03H
		MOV 	R4, A
		MOV 	A, #05H
		MOV 	R3, A
		MOV 	A, #02H
		MOV 	R5, A
		MOV	DPTR, #SEG

; DELAY

DELAYC:		MOV 	R2, #0AH


DELAYC1:DJNZ	R2, DELAYC1
		RET

; DELAY RED

DELAYR:	MOV 	A, R4
		ANL	A, #0FH
		MOVC	A, @A+DPTR
		MOV 	P3, A
		MOV	R1, #03H
		ACALL	DELAYC


DELAYR1:MOV	R2, #0AH
		DEC 	R4
		MOV	A, R4
		ANL	A, #0FH
		MOVC	A, @A+DPTR
		MOV	P3, A


DELAYR2:DJNZ	R2, DELAYR2
		DJNZ	R1, DELAYR1
		RET

; DELAY  YELLOW

DELAYY:	MOV 	A, R5
		ANL	A, #0FH
		MOVC	A, @A+DPTR
		MOV 	P3, A
		MOV 	R1, #02H
		ACALL	DELAYC


DELAYY1:MOV	R2, #0AH
		DEC	R5
		MOV	A, R5
		ANL	A, #0FH
		MOVC	A, @A+DPTR
		MOV 	P3, A


DELAYY2:DJNZ	R2, DELAYY2
		DJNZ	R1, DELAYY1
		MOV	P3, #01000000B
		RET


; DELAY GREEN

DELAYG:	MOV 	A, R3
		MOVC	A, @A+DPTR
		MOV	P3, A
		MOV	R1, #05H
		ACALL	DELAYC


DELAYG1:MOV	R2, #0AH
		DEC	R3
		MOV	A, R3
		ANL	A, #0FH
		MOVC	A, @A+DPTR
		MOV	P3, A


DELAYG2:DJNZ	R2, DELAYG2
		DJNZ	R1, DELAYG1
		RET

; END DELAY

; TRAFFIC LIGHT TOGGLE

TOP: 	ACALL 	DEFAULT
		ACALL 	DELAYR
		SETB 	P0.0
		MOV 	A, #0EH
		MOV 	P2, A
		ACALL 	DELAYG
		MOV	P2, #0FH
		MOV 	P1, #0EH
		ACALL 	DELAYY
		MOV	P1, B
		MOV 	A, #0F0H
		MOV 	P0, A

RIGHT:	ACALL	DEFAULT
		ACALL	DELAYR
		SETB 	P0.1
		MOV	A, #0DH
		MOV 	P2, A
		ACALL	DELAYG
		MOV	P2, #0FH
		MOV 	P1, #0DH
		ACALL	DELAYY
		MOV 	P1, B
		MOV 	A, #0F0H
		MOV 	P0, A

BOTTOM:	ACALL	DEFAULT
		ACALL	DELAYR
		SETB 	P0.2
		MOV 	A, #0BH
		MOV	P2, A
		ACALL 	DELAYG
		MOV	P2, #0FH
		MOV 	P1, #0BH
		ACALL 	DELAYY
		MOV	P1, B
		MOV 	A, #0F0H
		MOV 	P0, A

LEFT:	ACALL	DEFAULT
		ACALL	DELAYR
		SETB	P0.3
		MOV	A, #07H
		MOV	P2, A
		ACALL	DELAYG
		MOV	P2, #0FH
		MOV	P1, #07H
		ACALL	DELAYY
		MOV	P1, B
		MOV	A, #0F0H
		MOV	P0, A
		AJMP 	TOP

SEG:	DB 	3FH,06H,5BH,4FH,66H,6DH,7DH,07H,7FH,7FH,77H,7CH,39H,5EH,79H,71H
		END

; END DEFINES

~~~

# Lights

### Red Light

|      | LEFT | BOTTOM | RIGHT | TOP  |
| ---- | ---- | ------ | ----- | ---- |
| PORT | 0    | 0      | 0     | 0    |
| BIT  | 3    | 2      | 1     | 0    |

### Yellow Light

|      | LEFT | BOTTOM | RIGHT | TOP  |
| ---- | ---- | ------ | ----- | ---- |
| PORT | 1    | 1      | 1     | 1    |
| BIT  | 3    | 2      | 1     | 0    |

### Green Light

|      | LEFT | BOTTOM | RIGHT | TOP  |
| ---- | ---- | ------ | ----- | ---- |
| PORT | 2    | 2      | 2     | 2    |
| BIT  | 3    | 2      | 1     | 0    |

### LED 

|      | A    | B    | C    | D    | E    | F    | G    | .    |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| PORT | 3    | 3    | 3    | 3    | 3    | 3    | 3    | 3    |
| BIT  | 0    | 1    | 2    | 3    | 4    | 5    | 6    | 7    |

