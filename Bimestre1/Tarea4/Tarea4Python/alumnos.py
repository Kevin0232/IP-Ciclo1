print("Para leer las calificaciones de N alumnos y determine el número de aprobados y reprobados.")
# inicialización de variables
alum = int(1)
aprob = int(0)
reprob = int(0)
nota = float(0)
# Entrada de datos.
n = int(input("Ingrese la cantidad de alumnos a evaluar: "))
nota = int(input("Ingrese la nota del alumno: "))
if nota < 7:
        reprob = reprob + 1
else:
        aprob = aprob + 1
while alum < n:
    nota = int(input("Ingrese la nota del alumno: "))
    if nota < 7:
        reprob = reprob + 1
    else:
        aprob = aprob + 1
    alum = alum + 1
print("La cantidad de alumnos que probaron fueron: ",aprob)
print("La cantidad de alumnos que reprobaron fueron: ",reprob)
