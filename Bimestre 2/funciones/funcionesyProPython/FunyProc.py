
def ParImpar(numero):
    if numero % 2 == 0:
        print("El número " + str(numero) + " es par ")
    else:
        print("El número " + str(numero) + " es Impar ")
def NegPos(numero):
    if numero > 0:
        print("El número " + str(numero) + " es positivo")
    else:
        print("El número " + str(numero) + " es negativo ")
print("Funcion para verificar si un numero es par o impar ")
num = int(input('Ingrese un número a verificar: '))
print('')
ParImpar(num)
print("*** Fin del procedimiento 1 ***\n")
NegPos(num)
print("*** Fin del procedimiento 2 ***")


