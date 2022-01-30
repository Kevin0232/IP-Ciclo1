Algoritmo multiplo5Vector
	Definir n,i Como Entero
	Escribir "Ingrese el tamaño del vector: ";
	Leer n;
	
	Dimension A[n];
	
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "A [",+ i ,+ "] = "
		Leer A[i];
	FinPara
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si(A(i) Mod 5 == 0)Entonces
			Escribir "El número ",A[i]," es múltiplo de 5 y está en la posición A[",+i,+"]."
			
		FinSi
		
	FinPara
	
	
	
FinAlgoritmo
