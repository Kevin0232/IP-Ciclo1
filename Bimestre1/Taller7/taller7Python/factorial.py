print("Programa para obtener el factorial de un número")
# inicialización de variables

i = int(1)
fact = int(1)
num = int(input("Ingrese un número: "))
while num >= i:
    print(num)
    fact = fact * num

    num = num-1
print("El factorial del número ingresado es: ", fact)