print("Caja fuerte")
correct = int(2032)
n = int(4)
i = int(1)
clave = int(0)
# proceso
clave = int(input("Ingrese la clave: "))
if correct == clave:
    print("La caja fuerte se ha abierto satisfactoriamente")
if correct != clave:
    print("Lo siento, esa no es la combinación")
while (i < n) and (correct != clave):
    clave = int(input("Ingrese la clave: "))
    if correct == clave:
        print("La caja fuerte se ha abierto satisfactoriamente")
    if correct != clave:

        print("Lo siento, esa no es la combinación")
    i=i+1
    if i >3:
        print("Demasiados intentos")
        print("La caja fuerte ha sido bloqueada")


