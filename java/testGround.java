public class testGround {

    // public static enum Grade {
    //     A, B, C, D, F
    // }

    public static enum Grade {
        A(90),
        B(80),
        C(70),
        D(60),
        F(50)
        ;

        private int gradePercent;

        private Grade(int g){
            this.gradePercent = g;
        }

        public void whatIsYourGrade(){
            System.out.println(this.gradePercent);
        }
    }
    public static void main(String[] args) {
        Grade g = Grade.A;
        g.whatIsYourGrade();
    }
}
