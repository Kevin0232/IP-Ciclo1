# inicialización de varibales
i = int(1)
n = int(0)
num = int(0)
mayor = int(0)
menor = int(0)

# Ingrese los datos
print("**Encontrar el número mayor de N números que ingrese el usuario**\n")
n = int(input("Ingrese el limite de los números: "))

while i <= n:

    num = int(input("Ingrese un número: "))

    if (num > mayor):
        mayor = num
    i = i + 1
print("El número mayor de los valores ingresados es: ", mayor), "\n"

print("**Encontrar el número menor de N números que ingrese el usuario**\n")
i = int(1)
while i <= n:
    num = int(input("Ingrese un número: "))

    if i == 1 :
        menor = num

    if num < menor:
        menor = num
    i = i + 1
print("El número menor es: ", menor)