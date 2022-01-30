print("--Programa para conocer si el resultado de una resta es multiplo de 2 numeros--")
resta = int(0)
# entrada de datos
print("El número mayor se restará con el menor")

a = int(input("Ingrese el primer número: "))

b = int(input("Ingrese el segundo número: "))
if a > b:
    resta = a-b
    print("El resultado de la resta es: " + str(resta) + " .\n")
else:
    resta= b -a
    print("El resultado de la resta es: " + str(resta) + " .\n")

if (a % resta == 0) or (b % resta == 0):
    print("La diferencia es multiplo de uno de los números.")
else:
    print("La diferencia no es multiplo de ningún número")
