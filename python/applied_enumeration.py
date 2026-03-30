from enum import Enum
import random

class GameConstants(Enum):
    PLAYER = 100
    COM = 100

class MainApplication:
    def mainFunction():

        playerHealth = GameConstants.PLAYER.value
        comHealth = GameConstants.COM.value

        #healing and dodge
        heal = 20
        playerDodgeToken = 0
        comDodgeToken = 0

        #damage negation
        damageNegated = None
        playerDamageRolled = None
        comDamageRolled = None
        damageDoneWithNegation = None

        print("Welcome to a short turn base game, prepare to battle against a COM")

        #start loop
        while(True):
            print(f"-------------------------------------------------------")
            print(f"Please type in 1, 2 or 3 to make your move")
            print(f"1 ATTACK")
            print(f"2 HEAL")
            print(f"3 DODGE")
            print(f"-------------------------------------------------------")

            #showing Player Health and COM Health
            print(f"Player Health: ", playerHealth)
            print(f"COM Health: ", comHealth)

            #start of the player turn
            playerTurn = int(input())

            if(playerTurn == 1):

                if(comDodgeToken >= 1):
                    
                    damageNegated = random.randrange(10, 20)
                    playerDamgeRolled = random.randrange(10, 30)

                    if(damageNegated >= playerDamgeRolled):

                        print(f"The COM took no damge because of his dodge token")
                        print(f"")
                        comDodgeToken = 0

                    else:
                        damageDoneWithNegation = abs(damageNegated - playerDamageRolled)
                        print(f"The COM rolled a", damageNegated, "damaged negation you did", damageDoneWithNegation)
                        print(f"")
                        comHealth -= damageDoneWithNegation
                        comDodgeToken = 0
                else:
                    playerDamageRolled = random.randrange(10, 30)
                    comHealth -= playerDamageRolled
                    print(f"You did", playerDamageRolled, "damage")
                    print(f"")

            elif(playerTurn == 2):

                if(playerHealth >= 100):
                    print(f"You cannot heal passed 100")
                    print(f"")

                else:

                    if(playerHealth + heal >= 100):

                        playerHealth = 100
                        print(f"You have healed to 100")
                        print(f"")
                    
                    else:

                        playerHealth += heal
                        print(f"You healed", heal, "health")
                        print(f"")
            
            elif(playerTurn == 3):

                if(playerDodgeToken >= 1):
                    print(f"You can only have one dodgetoken at a time")
                    print(f"")
                else:
                    playerDodgeToken+=1
                    print(f"You have acquired a dodge token ")
                    print(f"")
        
            #start of the COM turn
            computerTurn = random.randrange(1,3)

            if(computerTurn == 1):

                if(playerDodgeToken >= 1):

                    damageNegated = random.randrange(10,20)
                    comDamageRolled = random.randrange(10,20)

                    if(damageNegated >= comDamageRolled):

                        print(f"The player took no damage because of his dodge token")
                        print(f"")
                        playerDodgeToken = 0
                    
                    else:

                        damageDoneWithNegation = abs(damageNegated - comDamageRolled)
                        print(f"The Player rolled a", damageNegated, "damaged negation COM did", damageDoneWithNegation)
                        playerHealth -= damageDoneWithNegation
                        playerDodgeToken = 0
                else:
                    comDamageRolled = random.randrange(10,20)
                    playerHealth -= comDamageRolled
                    print(f"The COM did", comDamageRolled, "damge")
                    print(f"")

            elif(computerTurn == 2):

                if(comHealth >= 100):

                    print(f"You cannot healh passed 100")
                    print(f"")
                else:

                    if(comHealth + heal >= 100):

                        comHealth = 100
                        print(f"The COM has healed to 100")
                        print(f"")

                    else:

                        comHealth += heal
                        print(f"The COM has healed", heal, "health")
                        print(f"")

            elif(computerTurn == 3):

                if(comDodgeToken >= 1):

                    print(f"The COM can only have one dodge token at a time")
                    print(f"")

                else:

                    comDodgeToken+=1
                    print(f"The COM has acquired a dodge token")
                    print(f"")

            if(comHealth <= 0):
                print(f"You have won the game")
                break
            elif(playerHealth <= 0):
                print(f"The COM has won")
                break    



        
if __name__ == "__main__":
    MainApplication.mainFunction()
    

# https://www.geeksforgeeks.org/python/python-random-module/
# https://docs.python.org/3/library/random.html