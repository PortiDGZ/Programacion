Proceso e6
	leer n
	
	Si n = 2
		dos <- Verdadero
	FinSi
	
	primo <- Verdadero
	
	Si n > 1
		Para i <- n - 1 Hasta 2
			Si n mod i = 0
				primo <- Falso
			FinSi
		Fin Para
		Si primo o dos
			escribir "El n�mero es primo."
		SiNo
			escribir "El n�mero no es primo."
		FinSi
	SiNo
		Si n = 1
			escribir "El 1 es un n�mero especial que no se clasifica como primo ni como compuesto."
		Sino
			escribir "El n�mero debe ser mayor o igual a 1."
		FinSi
	FinSi
FinProceso
