# creación e inicialiación de variables
print("--conversor de escalas aprobatorias de calificaciones--\n")
n = float(0)

# Entrada de datos
n = float(input("Ingrese la calificación sobre 5 puntos: "))

# proceso
if n >= 3.0:
    if (n >= 4.6) and (n <= 5):
        print("Estudiante excelente")

    else:
        if(n >= 4.1) and (n <= 4.5):
            print("El alumno es muy bueno")

        else:
            if(n >= 3.6) and (n <= 4.0):
                print("El estudiante es bueno")

            else:
                if(n >= 3.3) and (n <= 3.5):
                    print("El alumno registró un desempeño aceptable")
                else:
                    if(n >= 3.0) and (n <= 3.2):
                        print("Alumno Aprobado")

else:
    print("El alumno registra una calificación no aprobatoria")
