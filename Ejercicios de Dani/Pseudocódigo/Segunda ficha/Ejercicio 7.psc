SubProceso resultado <- CifraEnRomano ( uno, cinco, diez, cifra )
	Si cifra = 9
		resultado <- Concatenar(uno,diez)
	SiNo 
		Si cifra < 5
			Si cifra = 4
				resultado <- Concatenar(uno,cinco)
			SiNo
				Mientras cifra > 0
					resultado <- Concatenar(resultado, uno)
					cifra <- cifra - 1
				FinMientras
			FinSi
		Sino
			resultado <- cinco
			cifra <- cifra - 5
			Mientras cifra > 0
				resultado <- Concatenar(resultado, uno)
				cifra <- cifra - 1
			FinMientras
		Finsi
	FinSi
Fin SubProceso

Proceso e7
	
	leer n
	
	Si n > 4000 o n < 0
		escribir "Número inapropiado."
	SiNo
		Cifras <- ConvertirATexto(n)
		l <- Longitud (Cifras)
		c <- ConvertirANumero(SubCadena(cifras,l,l))
		NRomano <- CifraEnRomano("I", "V", "X", c)
		Si l > 1
			c <- ConvertirANumero(SubCadena(cifras,l - 1,l - 1))
			NRomano <- Concatenar(CifraEnRomano("X", "L", "C", c), NRomano)
			Si l > 2
				c <- ConvertirANumero(SubCadena(cifras,l - 2,l - 2))
				NRomano <- Concatenar(CifraEnRomano("C", "D", "M", c), NRomano)
				Si l > 3
					c <- ConvertirANumero(SubCadena(cifras,l - 3,l - 3))
					NRomano <- Concatenar(CifraEnRomano("M", "", "", c), NRomano)
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir NRomano
FinProceso
