# Declaración e inicialización de variables
num = float(1); den = float(2); i = int(1); n = int(0); term = float(0); suma = float(0)
# Entrada de datos
n = int(input("Ingrese el limite de la sucesión: "))

while(i<=n):
    term = (num/den)
    print("El término ", i, " es: ", num, " / ", den )
    suma = suma + (num/den)
    num = num + 2
    den = den + 3
    i=i+1
print("El total de la suma es: ", suma)