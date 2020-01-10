Proceso e5
	Para i<-1 Hasta 100
		p <- i mod 2
		Segun p Hacer
			0:
				sumapares <- sumapares + i
			1:
				sumaimpares <- sumaimpares + i
		Fin Segun
	Fin Para
	escribir "Sumatorio de los pares: ", sumapares
	escribir "Sumatorio de los impares: ", sumaimpares
FinProceso
