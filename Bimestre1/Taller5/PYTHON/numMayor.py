a=0
b=0
c=0
# Ingresar datos
print("--Programa para identificar el mayor de 3 números--")
a = input("Ingrese el primer número: ")
b = input("Ingrese el segundo número: ")
c = input("Ingrese el tercer número: ")

# proceso
if (float(a) > float(b)) and (float(a) > float(c)):
    print("El número mayor es: ",a, "\n")

else:
    if (b > c):
        print("El número mayor es: " + b +"\n")
    else:
        print("El número mayor es: " +c + "\n")