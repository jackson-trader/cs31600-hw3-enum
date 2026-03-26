from enum import Enum
from random import random 

class GameConstants:
    PLAYER = 100
    COM = 100

class MainApplication:
    def mainFunction():

        #healing and dodge
        heal = 20
        playerDodgeToken = 0
        comDodgeToken = 0

        print("Welcome to a short turn base game, prepare to battle against a COM\n")

        while(True):
            print(f"-------------------------------------------------------\n")
            print(f"Please type in 1, 2 or 3 to make your move\n")
            print(f"1 ATTACK\n")
            print(f"2 HEAL\n")
            print(f"3 DODGE\n")
            print(f"-------------------------------------------------------\n")

            print(f"Player Health: ", GameConstants.PLAYER)
            print(f"COM Health: " + GameConstants.COM)

            playerTurn = input()

            if(playerTurn == 1):
                playerDamgeRolled = random.randrange(10, 31)
                GameConstants.COM -= playerDamgeRolled
                print(f"You did ", playerDamgeRolled, " damge\n")
                print(f'\n')

            elif(playerTurn == 2):

                if(GameConstants.PLAYER >= 100):
                    print(f"You cannot heal passed 100\n")
                    print(f"\n")
                else:

                    if(GameConstants.PLAYER + heal):




if __name__ == "__main__":
    MainApplication.mainFunction()
    

# https://www.geeksforgeeks.org/python/python-random-module/
# https://docs.python.org/3/library/random.html