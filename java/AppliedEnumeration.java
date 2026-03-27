import java.util.Random;
import java.util.Scanner;

class AppliedEnumeration {
    public static enum GameConstants {

        PLAYER("Player", 100),
        COM("Computer", 10)
        ;

        private String name;
        private int health;

        GameConstants(String n, int h){
            this.name = n;
            this.health = h;
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Random numbers
        Random comTurn = new Random();
        Random damageChance = new Random();
        Random dodgeChacne = new Random();
        
        //healing and dodge
        int heal = 20;
        int playerDodgeToken = 0;
        int comDodgeToken = 0;

        //damage negation
        int damageNegated;
        int playerDamageRolled;
        int comDamageRolled;
        int damgeDoneWithNegation;

        System.out.println("Welcome to a short turn base and prepare battle against a COM");

        //start of the game loop
        while(true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Please type in 1, 2 or 3 to make your move: ");
            System.out.println("1 ATTACK");
            System.out.println("2 HEAL");
            System.out.println("3 DODGE");
            System.out.println("-------------------------------------------------------");

            //showing Player Health and COM Health
            System.out.println();
            System.out.println("Player Health: " + GameConstants.PLAYER.health);
            System.out.println("COM Health: " + GameConstants.COM.health);

            //start of the player turn
            int playerTurn = s.nextInt();

            if(playerTurn == 1){

                if(comDodgeToken >= 1) {

                    damageNegated = dodgeChacne.nextInt(10, 20);
                    playerDamageRolled = damageChance.nextInt(10,31);

                    if(damageNegated >= playerDamageRolled){

                        System.out.println("The COM took no damage because of his dodge token");
                        comDodgeToken = 0;
                    } else {

                        damgeDoneWithNegation = Math.abs(damageNegated - playerDamageRolled);
                        System.out.println("The COM rolled a " + damageNegated + " damaged negation " + "you did " + damgeDoneWithNegation);
                        GameConstants.COM.health -= damgeDoneWithNegation;
                        comDodgeToken = 0;
                    }
                } else {

                    playerDamageRolled = damageChance.nextInt(10, 31);
                    GameConstants.COM.health -= playerDamageRolled;
                    System.out.println("You did " + playerDamageRolled + " damage");
                    System.out.println();
                }
            } else if(playerTurn == 2){

                if(GameConstants.PLAYER.health >= 100){
                    System.out.println("You cannot heal passed 100");
                    System.out.println();
                } else {

                    if(GameConstants.PLAYER.health + heal >= 100){

                        GameConstants.PLAYER.health = 100;
                        System.out.println("You have healed to 100");
                        System.out.println();

                    } else {

                        GameConstants.PLAYER.health += heal;
                        System.out.println("You healed " + heal + " health");
                        System.out.println();
                    }
                }
            
            } else if(playerTurn == 3) {

                if(playerDodgeToken >= 1){
                    System.out.println("You can only have one dodge token at a time");
                    System.out.println();
                } else {
                    playerDodgeToken++;
                    System.out.println("You have acquired a dodge token");
                    System.out.println();
                }
            }


            //start of the COM Turn
            int computerTurn = comTurn.nextInt(1,4);

            if(computerTurn == 1){

                if(playerDodgeToken >= 1){
                    damageNegated = dodgeChacne.nextInt(10, 20);
                    comDamageRolled = damageChance.nextInt(10, 31);

                    if(damageNegated >= comDamageRolled){

                        System.out.println("The Player took no damage because of his dodge token");
                        playerDodgeToken = 0;
                    } else {

                        damgeDoneWithNegation = Math.abs(damageNegated - comDamageRolled);
                        System.out.println("The Player rolled a " + damageNegated + " damaged negation " + "COM did " + damgeDoneWithNegation);
                        GameConstants.PLAYER.health -= damgeDoneWithNegation;
                        playerDodgeToken = 0;
                    }
                } else {

                    comDamageRolled = damageChance.nextInt(10, 31);
                    GameConstants.PLAYER.health -= comDamageRolled;
                    System.out.println("The COM did " + comDamageRolled + " damage \n");
                    System.out.println();
                }

            } else if(computerTurn == 2){

                if(GameConstants.COM.health >= 100){
                    System.out.println("You cannot heal passed 100 \n");
                    System.out.println();
                } else {

                    if(GameConstants.COM.health + heal >= 100){

                        GameConstants.COM.health = 100;
                        System.out.println("The com has healed to 100");
                        System.out.println();
                    } else {

                        GameConstants.COM.health += heal;
                        System.out.println("The com has healed " + heal + " health");
                        System.out.println();
                    }
                }
            } else if(computerTurn == 3){

                if(comDodgeToken >= 1){
                    System.out.println("The com only have one dodge token at a time");
                    System.out.println();
                } else {
                    comDodgeToken++;
                    System.out.println("The com has acquired a dodge token");
                    System.out.println();
                }
            }

            //checking to see if health reaches 0
            if(GameConstants.COM.health <= 0){
                System.out.println("You have won the game");
                break;
            } else if(GameConstants.PLAYER.health <= 0){
                System.out.println("The COM has won");
                break;
            }
        }
    }

    /*
    Quick turn base game?
    Have the user enter in input 
    Enum1 for player could be attack, heal, or dodge(possibly)
        if the user picks the case 1 2 or 3 
    Enum2 for the npc random number generator for attack, heal or dodge
    */
}