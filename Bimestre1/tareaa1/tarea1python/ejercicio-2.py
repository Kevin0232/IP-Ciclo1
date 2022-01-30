print("---Programa para calcula la nota final de un estudiante--")
nombre: print = input("Ingrese nombre del estudiante: ")

#ingresar datos de entrada
print("--------------")
print("ingresar notas sobre 10 puntos")
nT = float( input("Ingrese nota de trabajos: "))
if nT > float(10):
    print("*La nota es sobre 10 puntos**")
    print("Vuelva a ingresar la nota", "\n")
nL = float(input("Ingrese nota de lecciones: "))
if nL > float(10):
    print("*La nota es sobre 10 puntos**")
    print("Vuelva a ingresar la nota", "\n")
nP = float(input("Ingrese nota de participación: "))
if nP > float(10):
    print("*La nota es sobre 10 puntos**")
    print("Vuelva a ingresar la nota", "\n")
nE = float(input("Ingrese nota de examen final: "))
if nE > float(10):
    print("*La nota es sobre 10 puntos**")
    print("Vuelva a ingresar la nota", "\n")

#proceso

ntF = (float(nT)*float(20))/100
nlF = (float(nL)*float(30))/100
npF = (float(nP)*float(10))/100
neF = (float(nE)*float(40))/100
nF = (float(ntF) + float(nlF) + float(npF) + float(neF))
print("La nota final del estudiante ",nombre,"es: ",nF)
if nF >= 7:
    print("El estudiante aprobó", "\n")
if nT <= 6.99:
    print("El estudiante no aprobó", "\n")