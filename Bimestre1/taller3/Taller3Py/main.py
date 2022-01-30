print("**Programa para calcular el área de un poligono***")
nombre= input("Ingrese el nombre de usuario: ")

#Ingrese datos
A= input("ingresa altura del terreno(A): ")

B= input("Ingresa la base del terreno (B): ")

C= input("Ingresa la altura del rectangulo del terreno (C): ")

#Proceso
alTriag = float(A) - float(C)
areaT = (float(B) * float(alTriag)) / 2
areaR = float(B) * float(C)
areaTotal = float(areaT) + float(areaR)

print("El área del terreno es:", areaT , "\n")
print("El área del rectangulo del terreno es: ", areaR, "\n")
print("El área Total del terreno es: ", areaTotal, "\n")