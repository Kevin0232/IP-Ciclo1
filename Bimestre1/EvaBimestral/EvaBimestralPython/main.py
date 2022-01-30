print("Programa para Verificar si un número es positivo, negativo, par o impar")
# Creación e inicializacón de variables

num = int(0)
j = int(1)
n = int(0)
div = int(0)
opc = int(0)
# Ingreso de datos
num = int(input("Ingrese el número a verificar: "))

print("\n Observe el siguiente menú.")
print("1. Verificar si es par o impar")
print("2. Verificar si es positivo o negativo")
print("3. Verificar si es multiplo de 3.")
print("4. Verificar si es primo.")
opc = int(input("\n Seleccione la opción a realizar: "))

if opc == 1:
    if num % 2 == 0:
        print("EL número ", num, " es par ")

    else:
        print("EL número ", num, " es impar ")
if opc == 2:
    if (num == 0):
        print("EL número ", num, " es un número neutro ")

    else:
        if (num > 0):
            print("EL número ", num, " es positivo ")

        else:
            print("EL número ", num, " es negativo ")

if opc == 3:
    if num % 3 == 0:
        print("EL número ", num, " es multiplo de 3. ")

    else:
        print("EL número ", num, " no es multiplo de 3. ")

if opc == 4:
    while j <= num:
        if num % j == 0:
            div = div+1

        j = j+1


    if div == 2:
        print("El número ", num, " es primo.")

    else:
        print("El número ", num, " no es primo.")


if (opc <= 0) or (opc > 4):
    print("A seleccionado un número fuera del menú.")
