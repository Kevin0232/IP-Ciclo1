# Declaración e inicialización de variables
i = int(1); mult = int(0)
# Entrada de datos
num = int(input("Ingrese el número del que desea la tabla: "))

n = int(input("Ingrese el limite de la tabla: "))

# Proceso
while i <= n:
    mult = num*i
    print(num, " x ", i, " = ", mult )
    i = i + 1
