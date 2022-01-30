#declaración e inicialización de variables
h24 = 0;
m24 = 0;
h12 = 0;
m12 = 0;
periodo = "a.m";

#ingreso de los datos
print("Conversión de hora de 24 a 12")
h24 = input("Ingrese la hora en formato 24: ")

m24 = input("Ingrese los minutos en formato de 24: ")


#proceso

if ((int(h24) <= 24) and (int(h24) >= 0)) and ((int(m24) >= 0) and (int(m24) <= 60)):
    if (int(m24) == 60):
        h24 = int(h24)+1
        m24 =0;
    else:
        m12=int(m24)

    if (int(h24) > 12):
        h12 = int(h24)-12
        periodo = "p.m"
        print("El tiempo de ",h24 , " horas y " , m24, " minutos \n" , "equivale a "
            ,h12 ," horas y " , m12, " minutos " , periodo)

    else:
        h12= int(h24)
        print("El tiempo de " ,h24 , " horas y " , m24, " minutos \n" , "equivale a "
            ,h12 ," horas y " , m12, " minutos " , periodo)


else:
    print("Error: la hora o minutos ingresados no son validos.\n")