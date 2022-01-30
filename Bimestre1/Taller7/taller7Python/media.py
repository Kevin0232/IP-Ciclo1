# inicialización de variables
print("Programa para introducir una serie indeterminada de números mientras su suma no supere el valor 10000");
num = int(0)
i = float(0)
n = int(10000)
suma = float(0)
media = float(0)
while (suma <= n):
    num = int(input("Ingrese un número: "))
    suma= suma+num
    i= i+1
    if ((suma > 0) and (suma <= 10000)):
        print("-------")
    else :
        print("La suma ha excedido el valor de 10000")


media = suma / i
print("Se ha ingresado un total de ", i, " números")
print("El total de numeros acumulados es: ", suma)
print("La media aritmetica de los numeros ingresados es: ", media)