Proceso A
	leer h
	leer m
	leer s
	Repetir 
		Borrar pantalla
		escribir h, ":", m, ":", s
		Esperar 1 Segundos
		s <- s + 1
		Si s > 59
			s <- 0
			m <- m + 1
		FinSi
		Si m > 59
			m <- 0
			h <- h + 1
		FinSi
		Si h > 23
			h <- 0
		FinSi
	Hasta Que h > 60
FinProceso
