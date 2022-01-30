# creación e inicialización de variables

mes = int(0)
# ingresar datos
print("Escoja una opción del siguiente menú")
print("1.")
print("2.")
print("3.")
print("4.")
print("5.")
print("6.")
print("7.")
print("8.")
print("9.")
print("10.")
print("11.")
print("12.")

mes = input("Seleccione un número para saber el mes: ")
if(int(mes) == 1):
    print("Enero")
if(int(mes)==2):
    print("Febrero")
if(int(mes)==3):
    print("Marzo")
if (int(mes) == 4):
    print("Abril")
if(int(mes) == 5):
    print("Mayo")
if (int(mes) == 6):
    print("Junio")
if(int(mes) == 7):
    print("Julio")
if(int(mes) == 8):
    print("Agosto")
if (int(mes) == 9):
    print("Septiembre")
if(int(mes)==10):
    print("Octubre")

if(int(mes)==11):
    print("Noviembre")

if(int(mes)==12):
    print("Diciembre")

if((int(mes)<=0)or (int(mes)>12)):
    print("El número ingresado no es valido.")