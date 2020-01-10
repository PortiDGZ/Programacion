Proceso e2
	leer n1
	leer n2
	
	Si (n2 < n1)
		aux <- n2
		n2 <- n1
		n1 <- aux
	FinSi
	
	escribir n2 / n1
FinProceso
