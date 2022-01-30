Algoritmo promMatriz
	Definir i,j,suma Como Entero
	Definir prom Como Real
	suma <- 0; prom <- 0
	Dimension A[10]
	Escribir 'Ingresar datos del vector A'
	Para i<-1 Hasta 10 Hacer
		Escribir 'A[',+i,+'] = '
		Leer A[i]
	FinPara
	prom <- promFun(A,suma)
	Escribir 'El promedio real del vector es: ',+prom
FinAlgoritmo

Funcion prom <- promFun(B,suma)
	Definir prom Como Real
	prom <- 0
	Para i<-1 Hasta 10 Hacer
		sum <- sum+B[i]
	FinPara
	prom <- sum/10
FinFuncion
