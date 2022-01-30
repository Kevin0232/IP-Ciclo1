#creación e inicialización de variables.
a = 0
#Ingresar datos
print("Programa para identificar si un número es positivo o negativo ")
a = input("Ingrese un número: ")
# proceso
if (float(a) == 0):

    print("El 0 es numero neutro")

else :
    if (float(a) > 0):
        print("El número ", a, " es positivo.\n" )

    else:
        print("El número ", a, " es negativo.\n" )
