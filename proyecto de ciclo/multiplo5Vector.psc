Algoritmo multiplo5Vector
	Definir n,i Como Entero
	Escribir "Ingrese el tama�o del vector: ";
	Leer n;
	
	Dimension A[n];
	
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "A [",+ i ,+ "] = "
		Leer A[i];
	FinPara
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si(A(i) Mod 5 == 0)Entonces
			Escribir "El n�mero ",A[i]," es m�ltiplo de 5 y est� en la posici�n A[",+i,+"]."
			
		FinSi
		
	FinPara
	
	
	
FinAlgoritmo
