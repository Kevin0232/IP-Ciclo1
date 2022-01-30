n = int(input("Ingrese el número de personas a considerar en el puesto de trabajo: "))
asp = int(input('Ingrese el número de aspirantes: '))
m = int(input('Ingrese el número de criterios a evaluar: '))
cont = m
nombre=[]
criterio = []
result = []
Ncriterio = []
aspi = []
aux1 = "ad"
# ingresar los datos
for j in range(0,m):
    s = input('Ingrese el nombre del criterio '+ str(j)+': ')
    Ncriterio.append(s)
for i in range(0,n):
    n1= input('Ingrese el nombre del empleado, codigo ['+ str(i)+']: ')
    nombre.append(n1)
print("\nLOS CRITERIOS CALIFICADOS VAN CON EL SIGUIENTE RANGO.[0-10]")
for i in range(0, n):
    criterio.append([])
    for j in range(0, m):
        pos = float(input("Ingrese la calificación del criterio " + str(Ncriterio[j]) +" de " + str(nombre[i])+": "))
        criterio[i].append(pos)
        if (criterio[i][j] < 0) or (criterio[i][j] > 10):
            print("SE HA INGRESADO UNA NOTA FUERA DE LOS PARAMETROS")
            print("***FIN DEL PROGRAMA***")
            print("VUELVA A INICIAR")
            j = m
            i = n
    print("SIGUIENTE ASPIRANTE: ")

suma=0
for i in range(0, n):
    for j in range(0, m):
        suma = suma + criterio[i][j]
    prom = (suma / cont)
    result.append(prom)
    suma = 0

# Presentar Datos

for i in range(0, n):
    print(str(nombre[i]), end="     ")
    for j in range(0, m):
        print('    '+ str(criterio[i][j]),end="" )
    print(end='=  ')
    print(' ')
# Considerar el número de aspirantes
for i in range(0, n):
    for j in range(i+1, n):
        if result[i] < result[j]:
            aux = result[i]
            result[i] = result[j]
            result[j] = aux
            aux1 = nombre[i]
            nombre[i] = nombre[j]
            nombre[j] = aux1
print('Las personas con mayor consideración para tener el empleo son: ')
for i in range(0,asp):
    print(' *'+str(nombre[i])+' con una calificación de: '+str(result[i]))