def Sarrus(M):
    A=[]
    for i in range(0,3):
        A.append([])
        for j in range(0,3):
            a = M[i][j]
            A[i].append(a)

    # Comlumnas adicionales de la matriz ampliada
    for i in range(0,3):
        A.append([])
        for j in range(3,5):
            aa = A[i][j-3]
            A[i].append(aa)
    # calculo del determinante
    i = 0
    j = 0
    dc = 0
    t = 3
    d = 1
    sumad = 0
    k = 0
    while k < 3:
        while(j < t) and (t <= 5):
            d = d * A[i][j]
            print("D= " + str(d))
            i = i + 1
            j = j + 1
        sumad = sumad + d
        d = 1
        i = 0
        k = k + 1
        dc = dc + 1
        j = dc
        t = t + 1

    i = 0
    j = 2
    dc = 2
    t = 0
    z = 1
    sumai = 0
    k = 0
    while k<3:
        while (j>=t) and (t<3):
            z = z * A[i][j]
            i = i + 1
            j = j - 1
            print("Z= " + str(z))
        sumai = sumai + z
        z = 1
        i = 0
        k = k + 1
        dc = dc + 1
        j = dc
        t = t + 1
    print("sumad = " + str(sumad)+"-sumai = " + str(sumai))
    det = sumad - sumai
    return det
M=[]
for i in range(0, 3):
    M.append([])
    for j in range(0, 3):
        m = int(input("ingrese el valor de M["+str(i)+"]["+str(j)+"]= "))
        M[i].append(m)

det = Sarrus(M)
print("El determinante de la matriz es igual a: "+str(det))