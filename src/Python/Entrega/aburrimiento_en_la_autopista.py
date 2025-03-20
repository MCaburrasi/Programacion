if __name__ == "__main__":
    iteraciones = int(input(""))
    for iteracion in range(iteraciones):
        matriculas = input("").split(" ")
        flag = True
        nuevos = 0
        viejos = 0
        for matricula in matriculas[:-1]:
            if flag:
                tu_matricula = matricula
                flag = False
            elif matricula[-3:] == tu_matricula[-3:]:
                if matricula[:-3] < tu_matricula[:-3]:
                    viejos += 1
                else:
                    nuevos += 1
            else:
                if matricula[:-3] < tu_matricula[:-3]:
                    viejos += 1
                else:
                    nuevos += 1
        print(viejos, nuevos)