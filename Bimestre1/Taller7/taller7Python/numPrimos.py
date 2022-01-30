# creacion e inicialización de varibales
div = int(0)
i = int(1)
n = int(input("Ingrese el limite de números a verificar: "))

while i <= n :
    num = int(input("Ingrese un número: "))

    # par o impar
    if num % 2 == 0:
        print("EL número ", num, " es par ")

    else:
        print("EL número ", num, " es impar ")

    # verificar número primo
    j = int(1)
    while j <= num:
        if num % j == 0:
             div= div+1

        j = j+1


    if div == 2:
        print("El número ", num, " es primo.")

    else:
        print("El número ", num, " no es primo.")

    i = i + 1
    div = 0