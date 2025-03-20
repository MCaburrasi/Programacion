def estadisticas(notas):
    media = sum(notas)/len(notas)
    maximo = max(notas)
    minimo = min(notas)
    return media, maximo, minimo

if __name__ == "__main__":
    notas = [5, 7, 4, 10, 8]
    media, maximo, minimo = estadisticas(notas)
    print(f"Media: {media}, Maximo: {maximo}, Minimo: {minimo}")