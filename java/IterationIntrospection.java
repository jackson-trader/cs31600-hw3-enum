import java.util.Random;
import java.util.Scanner;

class IterationIntrospection {

    public static enum GameConstants {

        PLAYER("Player", 100),
        COM("Computer", 100)
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
        Random dodgeNumber = new Random();
        Random comTurn = new Random();
        Random playerDamageChange = new Random();
        
        //healing and dodge
        int heal = 20;
        int dodgeToken = 0;

        int dodgeNum = dodgeNumber.nextInt(0, 2);

        System.out.println("Welcome to a short turn base and prepare battle against a COM");

        //start of the game loop
        while(true){
            System.out.println("Please type in 1, 2 or 3 to make your move: ");
            System.out.println("1 ATTACK");
            System.out.println("2 HEAL");
            System.out.println("3 DODGE");

            //showing Player Health and COM Health
            System.out.println();
            System.out.println("Player Health: " + GameConstants.PLAYER.health);
            System.out.println("COM Health: " + GameConstants.COM.health);

            //start of the player turn
            int playerTurn = s.nextInt();

            if(playerTurn == 1){
                int damageRolled = playerDamageChange.nextInt(10, 31);
                GameConstants.COM.health -= damageRolled;
                System.out.println();
                System.out.println("You did " + damageRolled + " damage \n");

            } else if(playerTurn == 2){

                if(GameConstants.PLAYER.health >= 100){
                    System.out.println();
                    System.out.println("You cannot heal passed 100 \n");
                } else {

                    if(GameConstants.PLAYER.health + heal >= 100){

                        GameConstants.PLAYER.health = 100;
                        System.out.println();
                        System.out.println("You have healed to 100");
                    } else {

                        GameConstants.PLAYER.health += heal;
                        System.out.println();
                        System.out.println("You healed " + heal + " health");
                    }
                }
            
            } else if(playerTurn == 3) {

                if(dodgeToken >= 1){
                    System.out.println();
                    System.out.println("You can only have one dodge token at a time");
                } else {
                    dodgeToken++;
                    System.out.println();
                    System.out.println("You have acquired a dodge token");
                }
            }


            //start of the COM Turn
            int computerTurn = comTurn.nextInt(1,4);

            if(computerTurn == 1){
                damageRolled = playerDamageChange.nextInt(10, 31);
            }


        }
    }
    /*
    I believe for this one I saw an enum can have it's own constructor to create objects
    We would just use an enum and define a value such as SLOW(10) as constant
    create that that object and define it as ... = SLOW
    System.out.println(SLOW);
    */
}