total_pagado = 0
incremento = 5

for i in range(20):
    print(f"Mes {i + 1}")
    incremento = incremento * 2
    print(f"Tienes que pagar {incremento}€ este mes")
    total_pagado += incremento

print(f"Has pagado {total_pagado}€ en total")
