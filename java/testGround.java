import java.util.ArrayList;

public class testGround {

    public static enum Grade {
        A, B, C, D, F
    }

    public static void main(String[] args) {
        // Grade g = Grade.A;
        // g.whatIsYourGrade();

        ArrayList<Grade> grades = new ArrayList<>();

        for(Grade g: Grade.values()){ //allows us to get the values of the enum
            grades.add(g);
        }

        for(int i = 0; i < grades.size(); i++){

            switch (grades.get(i)) {
                case A:
                    System.out.println("A");
                    break;
                case B:
                    System.out.println("B");
                    break;
                case C:
                    System.out.println("C");
                    break;
                case D:
                    System.out.println("D");
                default:
                    break;
            }
        }
    }

    // public static enum Grade {
    //     A(90, "Calculus"),
    //     B(80, "Chemistry"),
    //     C(70, "Programming Languages"),
    //     D(60, "Physics"),
    //     F(50, "Java II")
    //     ;

    //     private int gradePercent;
    //     private String subject;

    //     private Grade(int g, String subject){
    //         this.gradePercent = g;
    //         this.subject = subject;
    //     }

    //     public void whatIsYourGrade(){
    //         System.out.println("The current grade that you have in " + 
    //                             this.subject +
    //                             " is a " + this.gradePercent);
    //     }
    // }
}
