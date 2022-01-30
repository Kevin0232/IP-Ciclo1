print("Programa para aceptar una nota")
# Proceso
num = int(input("Ingrese una calificación: "))
if (num > 0) and (num < 100):
    print("Nota aceptada")
else:
    print("Nota no aceptada")
    print("**FIN DEL PROGARAMA***")
while (num > 0) and (num < 100):
    num = int(input("Ingrese una calificación: "))
    if (num > 0) and (num < 100):
        print("Nota aceptada")
    else:
        print("Nota no aceptada")
        print("**FIN DEL PROGARAMA***")
