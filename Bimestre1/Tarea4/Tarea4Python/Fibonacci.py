print("Programa para presentar la sere fibonacci")
# inicialización de variables
num1 = int(1)
num2 = int(0)
i = int(1)
n = int(input("Ingrese un limite para la serie: "))
while i <= n:

    print(num1)
    num1 = num2 + num1
    num2 = num1 - num2
    i = i + 1
