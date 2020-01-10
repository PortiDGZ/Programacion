Proceso E8
	leer min
	max <- min
	
	Para i <- 1 hasta 4
		leer n
		Si (n < min)
			min <- n
		FinSi
		Si (n > max)
			max <- n
		FinSi
	FinPara
	
	escribir "El menor es ", min, "."
	escribir "El mayor es ", max, "."
FinProceso
