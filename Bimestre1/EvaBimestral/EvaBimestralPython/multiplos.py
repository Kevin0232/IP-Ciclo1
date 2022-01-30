# Leer dos números enteros y mostrar todos los múltiplos de 3 comprendidos entre
# el menor y el mayor de los número ingresados.
print("Programa para mostrar los múltiplos comprendidos entre dos número ingresados.")
num = int(0)
num1 = int(0)
mult = int(0)
num = int(input("Ingrese el primer número: "))

num1 = int(input("Ingrese el segundo número: "))


while num1 <= num:
    if num1 % 3 == 0:
        print(num1)

    num1 = num1 + 1
