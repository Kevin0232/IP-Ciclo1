n = int(input('Ingrese el número de notas a promediar: '))
suma=0
prom=0
Notas = []
Nombre = []
for i in range(0,n):
    nombre = input('Ingrese el nombre '+str(i)+': ')
    Nombre.append(nombre)
    notas = input('Ingrese la nota '+str(i)+': ')
    Notas.append(notas)
# Calcular la suma de las notas
for i in range(0,n):
    suma = suma + int(Notas[i])
# Promedio de notas ingresadas
promedio = suma / (n-1)
# Presentar los elementos del vector nota
print('Las notas son:')

for i in range(0,n):
    print("Notas [" +str(i) +" ]= " + str(Notas[i]))
print('\n')
print("El promedio de notas es: " + str(promedio))
# Obtener la nota mas alta
mayor= Notas[0]
for i in range(1,n):
    if Notas[i]>mayor:
        mayor = Notas[i]
    print("----"+str(mayor))
print("--Nota mayor = " + str(mayor))

#Impar
print("----Las notas de las posiciones impares son: ")
for i in range(0,n):
    if i%2 !=0:
        print("Notas [" +str(i) +"] = " + str(Notas[i]))
print("\n NOTAS Y NOMBRES DE ESTUDIANTES")
for i in range(0,n):
    print(str(Nombre[i])+ " tiene una nota de " +str(Notas[i]) )