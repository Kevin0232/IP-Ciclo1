def funNegPos(numero):
    if numero > 0:
        return True
    else:
        return False
print("Funcion para verificar si un numero es positivo o negativo")

num = int(input('Ingrese un número a verificar: '))
band = funNegPos(num) # asigna el valor que devuelve la función
if band == True:
    print("El número " + str(num) + " es positivo.\n")
else:
    print("El número " + str(num) + " es negativo.\n")
print("*** Fin de la función 1 ***")
# comprobar directamente con el llamado de la función
if funNegPos(num) == True:
    print("El número " + str(num) + " es positivo.\n")
else:
    print("El número " + str(num) + " es negativo.\n")
print("*** Fin de la función 2 ***")


