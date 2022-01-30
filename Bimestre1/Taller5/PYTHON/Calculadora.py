# declarar e inicializar variables
opc=0
num1 = 0
num2 = 0
resp = 0
#ingreso de datos
print("Calculadora básica\n");

num1 = input("Ingrese el valor del primer número: ");
num2= input("Ingrese el valor del segundo número: ");
print("\n");
print("Escoja la operación del siguiente menú");
print("1.Suma");
print("2.Resta");
print("3.multiplicación");
print("4.División.");

opc= input("Ingrese una opción: ")
if(int(opc)==1):
    resp = float(num1) + float(num2)
    print("La suma es: " , resp)
if(int(opc)==2):
    resp = float(num1) - float(num2)
    print("La resta es: " , resp)
if(int(opc)==3):
    resp = float(num1) * float(num2)
    print("La multiplicación es: " , resp)

if(int(opc)==4):
    resp = float(num1) / float(num2)
    print("La divisi;on es: " , resp)

if(int(opc)<=0)and(int(opc)>4):
    print("No existe la opción que usted ingresó.")