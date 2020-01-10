Proceso e9
	leer n1
	leer n2
	
	Si (n2 < n1)
		aux <- n2
		n2 <- n1
		n1 <- aux
	FinSi
	
	d <- n2 - n1 + 1
		
	Para n1 <- n1 hasta n2
		escribir n1
		Si (n1 mod 2 = 0)
			pares <- pares + 1
		Sino
			sumaimpares <- sumaimpares + n1
		FinSi
	FinPara
	
	escribir "Hay ", d, " números."
	escribir "Hay ", pares, " números pares."
	escribir "La suma de los impares es: ", sumaimpares
FinProceso
