import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testGround {
    
    public static enum Grade {
        A(90, "Calculus"),
        B(80, "Chemistry"),
        C(70, "Programming Languages"),
        D(60, "Physics"),
        F(50, "Java II")
        ;

        private int gradePercent;
        private String subject;

        private Grade(int g, String subject){
            this.gradePercent = g;
            this.subject = subject;
        }

        public void whatIsYourGrade(){
            System.out.println("The current grade that you have in " + 
                                this.subject +
                                " is a " + this.gradePercent);
        }
    }

    public static void main(String[] args) throws Exception{

        Enum g1 = null;
    }

    // ArrayList<Grade> grades = new ArrayList<>();

    //     for(Grade g: Grade.values()){ //allows us to get the values of the enum
    //         grades.add(g);
    //     }

    //     for(int i = 0; i < grades.size(); i++){

    //         switch (grades.get(i)) {
    //             case A:
    //                 System.out.println("A");
    //                 break;
    //             case B:
    //                 System.out.println("B");
    //                 break;
    //             case C:
    //                 System.out.println("C");
    //                 break;
    //             case D:
    //                 System.out.println("D");
    //             default:
    //                 break;
    //         }
    //     }

    // try{
    //         Class<?> c = (args.length == 0 ? Grade.class : Class.forName(args[0]));
    //         out.format("Enum name: %s%nEnum constants: %s%n", 
    //                             c.getName(), Arrays.asList(c.getEnumConstants()));
    //     } catch(ClassNotFoundException e){
    //         e.printStackTrace();
    //     }


    // if(g1 == g2){
    //         System.out.println(true);
    //     } else {
    //         System.out.println(false);
    //     }

    //     if(g1.equals(g2)){
    //         System.out.println(true);
    //     } else {
    //         System.out.println(false);
    //     }

    //     System.out.println(g1.ordinal());


    
        // Grade g1 = Grade.A;
        // Grade g2 = Grade.B;

        // //serialized enum
        // ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("grade.json"));
        // out.writeObject(g1);
        // out.close();

        // //deserialize the enum
        // ObjectInputStream in = new ObjectInputStream(new FileInputStream("grade.json"));
        // Grade deserializedGrade = (Grade) in.readObject();
        // in.close();

        // System.out.println("The Original color: " + g1);
        // System.out.println("Deserialized color: " + deserializedGrade);

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


    // public static enum Grade {
    //     A, B, C, D, F
    // }
    
    // public static enum TierList{
    //     A, B, C, D, F
    // }


    // Grade g1 = Grade.A;
    //     TierList t1 = TierList.A;

    //     System.out.println(g1);
    //     System.out.println(t1);
}
