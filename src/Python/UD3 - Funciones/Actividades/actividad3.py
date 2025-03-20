def login(usuario, contraseña):
    return usuario == "usuario1" and contraseña == "1234"


if __name__ == "__main__":

    usuario = input("Usuario: ")
    contraseña = input("Contraseña: ")
    print(f"Acceso {'permitido' if login(usuario, contraseña) else 'denegado'}")

