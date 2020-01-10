Proceso e7
	psum <- 0
	impsum <- 0
	
	Para i <- 1 hasta 100
		escribir i
		Si (i mod 2) == 0
			psum <- psum + i
		sino 
			impsum <- impsum + i
		FinSi
	FinPara
	escribir "Sumatorio de los pares: ", psum
	escribir "Sumatorio de los impares: ", impsum
FinProceso
