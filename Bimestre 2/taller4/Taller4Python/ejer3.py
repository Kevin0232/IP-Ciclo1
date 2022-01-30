def FunDisp(Disp, g,q):
    if Disp[g][q]==0:
        return 0
    else:
        return 1

Disp=[]
k = int(input("Ingrese el valor de k: "))
n = int(input("Ingrese el valor de n: "))
for i in range(0,k):
    Disp.append([])
    for j in range(0,n):
        d = int(input("Ingrese el valor de Disp["+str(i)+"]["+str(j)+"]= "))
        Disp[i].append(d)
# Se hace el chequeo de la disponibilidad
# del anaquel q en la gondola g
q = int(input("Ingrese el valor de q: "))
g = int(input("Ingrese el valor de g: "))
rd = FunDisp(Disp,g,q)
if rd == 0:
    print("El anaquel "+str(q)+" en la gondola "+str(g)+" está disponible")
else:
    print("El anaquel "+str(q)+" en la gondola "+str(g)+" no está disponible")