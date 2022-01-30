def Primo(numero):
    div=0
    for i in range(1,numero+1):
        if numero % i == 0:
            div = div + 1

    if div == 2:
        print("El número " + str(numero) + " es impar y es primo.\n")
    else:
        print("El número " + str(numero) + " es impar pero no es primo.\n")
def Impar(numero):
    if numero % 2 != 0:
        return True
    else:
        return False

print("Funcion para verificar si un numero es impar y un procedimiento para verificar si es primo \n ")
num = int(input('Ingrese un número a verificar: '))
esImpar = Impar(num)
if esImpar == True:
    Primo(num)
else:
    print("El número no es impar por lo tanto no se verifica si es primo")