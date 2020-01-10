Proceso e6
	j <- 0
	leer n
	Para i <- 1 hasta n
		Si (i mod 3 = 0)
			escribir i
			j <- j + 1
		FinSi
	FinPara
	escribir "Hay ", j, " múltiplos de 3."
FinProceso
