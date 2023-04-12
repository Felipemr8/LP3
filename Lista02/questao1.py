class App:
    def __init__(self, valores):
        media = sum(valores) / len(valores)
        desvio_padrao = (sum([(v - media)**2 for v in valores]) / (len(valores) - 1))**0.5
        if desvio_padrao > 0.1 * media:
            print("Multímetro com problemas")
        else:
            print("O multímetro está funcionando corretamente.")
        print("Média:", media)
        print("Desvio padrão:", desvio_padrao)

# valores1 = [3.2, 5.1, 6.8, 4.5, 7.6, 5.9, 6.3, 4.8, 3.6, 5.4]
# valores2 = [1.5, 2.2, 3.8, 2.1, 3.9, 2.7, 3.3, 2.6, 1.7, 2.8]

# app1 = App(valores1)
# app2 = App(valores2)

valores_usuario = []
n = int(input("Digite o número de valores que deseja inserir: "))
for i in range(n):
    valor = float(input("Digite o valor " + str(i+1) + ": "))
    valores_usuario.append(valor)

app3 = App(valores_usuario)
