Algoritmo sumaDiagonPrin
	Definir i,j,suma,n Como Entero
	suma<-0; n<-0;
	Escribir "Programa para calcular la suma de los elementos de la diagonal principal"
	Escribir "Ingrese el tamaño de la matriz cuadrada"
	Leer n
	Dimension A[n,n]
	Escribir "Ingresar datos de la matriz A"
	Para i<-1 Hasta n Con Paso 1 Hacer
		Para j<-1 Hasta n Con Paso 1 Hacer
			Escribir "A[",+i,+"][",+j,+"] = "
			Leer A[i,j]
		FinPara
	FinPara
	Escribir "matriz A"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir Sin Saltar A[i,j] ,+ "  "
		FinPara
		Escribir " "
	FinPara
	Para i<-1 Hasta n Con Paso 1 Hacer
		Para j<-1 Hasta n Con Paso 1 Hacer
				Si (i==j)  Entonces
					suma = suma + A[i,j]
				FinSi
		FinPara
	FinPara
	Escribir "La suma total de los elementos de la diagonal principal es: ",+suma
FinAlgoritmo
