dado = int(input("Resultado de lanzamiento: "))

match dado:
    case 1:
        cara = "seis"
        print(f"En la cara opuesta esta el {cara}.")
    case 2:
        cara = "cinco"
        print(f"En la cara opuesta esta el {cara}.")
    case 3:
        cara = "cuatro"
        print(f"En la cara opuesta esta el {cara}.")
    case 4:
        cara = "tres"
        print(f"En la cara opuesta esta el {cara}.")
    case 5:
        cara = "dos"
        print(f"En la cara opuesta esta el {cara}.")
    case 6:
        cara = "uno"
        print(f"En la cara opuesta esta el {cara}.")
    case _:
        print("Error")


