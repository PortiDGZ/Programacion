Proceso e3
	leer n1
	leer n2
	
	Si (n2 < n1)
		aux <- n2
		n2 <- n1
		n1 <- aux
	FinSi
	
	Para n1 <- n1 hasta n2
		escribir n1
		Si (n1 mod 2 = 0)
			pares <- pares + 1
			sumapares <- sumapares + n1
		FinSi
	FinPara
	
	escribir "Hay ", pares, " números pares."
	escribir "La suma de los pares es: ", sumapares
FinProceso
