import java.util.ArrayList;

class ExhaustiveControlFlow {

    public static enum color {
        RED,
        GREEN,
        BLUE,
        YELLOW, // YELLOW is the new variant
    }
    public static void main(String[] args) {

        ArrayList<color> colorList = new ArrayList<>();

        colorList.add(color.RED);
        colorList.add(color.BLUE);
        colorList.add(color.GREEN);
        colorList.add(color.YELLOW);

        // YELLOW is intentionally left out of switch statement
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
                    break;
                default:
                    break;
            }
        }

        // Continues to run silently, ignoring YELLOW because it's not in the switch statement, reaches default.
        // No errors and no warnings.

        /*
        https://stackoverflow.com/questions/9850525/whats-the-use-of-enum-in-java
        https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
        https://www.geeksforgeeks.org/java/enum-in-java/
        */
    }
}