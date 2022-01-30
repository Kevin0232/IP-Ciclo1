Algoritmo Matrices
	Definir mnr,suma,i,j, promedio Como Real
	Dimension A[5,5];
	Dimension B[5,5];
	Escribir "Ingresar datos del vector A: "
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			Escribir "A [",+i,+"] [",+j,+"] = "
			Leer A[i,j]
		Fin Para
	Fin Para
	
	Escribir "Ingresar datos del vector B: "
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			Escribir "B [",+i,+"] [",+j,+"] = "
			Leer B[i,j]
		Fin Para
	Fin Para
	
	Escribir "presentear el vetor A: "
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			Escribir Sin Saltar A[i,j],+ "   "
			
		Fin Para
		Escribir "  "
	Fin Para
	
	Escribir "presentear el vetor B: "
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			Escribir Sin Saltar B[i,j],+ "   "
			
		Fin Para
		Escribir "  "
	Fin Para
	
	Escribir "-------------------------------------------------------------------"
	Escribir "Menores en Matriz A"
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		mnr<- A[i,1];
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			Si mnr > A[i,j] Entonces
				mnr<- A[i,j];
			Fin Si
		Fin Para
		suma<- suma + mnr;
	Fin Para
	Escribir "Suma de menores: ",+suma
	promedio <- suma/5;
	Escribir "Promedio: ",+promedio
	
	Si promedio == B[1,1] Entonces
		Escribir "El promedio de las filas de la matriz A es igual a la esquina en la poscición B[1][1]"
	FinSi
	Si promedio == B[1,5] Entonces
		Escribir "El promedio de las filas de la matriz A es igual a la esquina en la poscición B[1][5]"
	FinSi
	Si promedio == B[5,1] Entonces
		Escribir "El promedio de las filas de la matriz A es igual a la esquina en la poscición B[5][1]"
	FinSi
	Si promedio == B[5,5] Entonces
		Escribir "El promedio de las filas de la matriz A es igual a la esquina en la poscición B[5][5]"
	FinSi
	Escribir "---------------------------------------------------------"
	suma<- 0;
	Escribir "Menores en Matriz B"
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		mnr<- B[i,1];
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			Si mnr > B[i,j] Entonces
				mnr<- B[i,j];
			Fin Si
		Fin Para
		suma<- suma + mnr;
	Fin Para
	Escribir "Suma de menores: ",+suma
	promedio <- suma/5;
	Escribir "Promedio: ",+promedio
	
	Si promedio == A[1,1] Entonces
		Escribir "El promedio de las filas de la matriz B es igual a la esquina en la poscición A[1][1]"
	FinSi
	Si promedio == A[1,5] Entonces
		Escribir "El promedio de las filas de la matriz B es igual a la esquina en la poscición A[1][5]"
	FinSi
	Si promedio == A[5,1] Entonces
		Escribir "El promedio de las filas de la matriz B es igual a la esquina en la poscición A[5][1]"
	FinSi
	Si promedio == A[5,5] Entonces
		Escribir "El promedio de las filas de la matriz B es igual a la esquina en la poscición A[5][5]"
	FinSi
	
FinAlgoritmo