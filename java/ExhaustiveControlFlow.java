import java.util.ArrayList;

class ExhaustiveControlFlow {

    public static enum color {
        RED, GREEN, BLUE
    }
    public static void main(String[] args) {


        //create a switch statement 
        //ask the user to pick a number between 1 and 3
        //if the user picks that number

        ArrayList<color> colorList = new ArrayList<>();

        colorList.add(color.RED);
        colorList.add(color.BLUE);
        colorList.add(color.GREEN);

        for(int i = 0; i < colorList.size(); i++){
            
            switch (colorList.get(i)) {
                case RED:
                    System.out.println("RED");
                    break;
                case BLUE:
                    System.out.println("BLUE");
                    break;
                case GREEN:
                    System.out.println("GREEN");
                default:

                    break;
            }
        }

        //colorList.add(color.YELLOW);

        /*
        https://stackoverflow.com/questions/9850525/whats-the-use-of-enum-in-java
        https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
        https://www.geeksforgeeks.org/java/enum-in-java/
        */
    }
}