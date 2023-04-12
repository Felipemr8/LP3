from abc import ABC, abstractmethod
import random

class BatalhaNaval(ABC):
    def __init__(self, jogador1, jogador2):
        self.jogador1 = jogador1
        self.jogador2 = jogador2
        self.j1vida = 5
        self.j2vida = 5
        self.jogador1tabuleiro = [['-' for i in range(5)] for j in range(5)]
        self.jogador2tabuleiro = [['-' for i in range(5)] for j in range(5)]
        self.tiroJogador1tabuleiro = [['-' for i in range(5)] for j in range(5)]
        self.tiroJogador2tabuleiro = [['-' for i in range(5)] for j in range(5)]

    @abstractmethod
    def posicionar_navios(self):
        pass

    def imprimir_tabuleiro(self, jogador):
        print(f"Tabuleiro do {jogador}")
        print("  0 1 2 3 4")
        tabuleiro = self.jogador1tabuleiro if jogador == "Jogador 1" else self.jogador2tabuleiro
        for i in range(5):
            print(f"{i} {' '.join(tabuleiro[i])}")

    def jogar(self):
        jogadores = [self.jogador1, self.jogador2]
        random.shuffle(jogadores)

        for jogador in jogadores:
            while self.j1vida > 0 and self.j2vida > 0:
                self.imprimir_tabuleiro(jogador)
                print(f"Vidas do Jogador 1: {self.j1vida} | Vidas do Jogador 2: {self.j2vida}")
                print(f"É a vez do {jogador} atirar.")
                x = int(input("Digite a posição x do tiro: "))
                y = int(input("Digite a posição y do tiro: "))

                while x > 4 or x < 0 or y > 4 or y < 0:
                    print("Posições erradas, tente novamente...")
                    x = int(input("Digite a posição x do tiro: "))
                    y = int(input("Digite a posição y do tiro: "))

                tabuleiro = self.jogador2tabuleiro if jogador == "Jogador 1" else self.jogador1tabuleiro
                tiro_tabuleiro = self.tiroJogador2tabuleiro if jogador == "Jogador 1" else self.tiroJogador1tabuleiro

                if tabuleiro[x][y] == '@':
                    print("Você acertou um navio!")
                    if jogador == "Jogador 1":
                        self.j2vida -= 1
                    else:
                        self.j1vida -= 1
                    tabuleiro[x][y] = 'X'
                    tiro_tabuleiro[x][y] = 'X'
                else:
                    print("Você errou o tiro!")
                    tiro_tabuleiro[x][y] = 'O'

    def jogar_batalha_naval(self):
        self.posicionar_navios()
        self.jogar()


class BatalhaNavalSimples(BatalhaNaval):
    def posicionar_navios(self):
        for jogador in [self.jogador1, self.jogador2]:
            print(f"{jogador}, posicione seu navio:")
            x = int(input("Digite a posição x: "))
            y = int(input("Digite a posição y: "))
            while x > 4 or x < 0 or y > 4 or y < 0:
                print("Posições erradas, tente novamente...")
                x = int(input("Digite a posição x: "))
                y = int(input("Digite a posição y: "))
            tabuleiro = self.jogador1tabuleiro if jogador == self.jogador1 else self.jogador2tabuleiro
            tabuleiro[x][y] = '@'


jogador1 = input("Digite o nome do Jogador 1: ")
jogador2 = input("Digite o nome do Jogador 2: ")
jogo = BatalhaNavalSimples(jogador1, jogador2)
jogo.jogar_batalha_naval()