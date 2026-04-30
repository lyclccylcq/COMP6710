package week5;

public class gradeMark {
    enum Grade {
        P,
        CR,
        D,
        HD,
        PX,
        N,
    }
    public static void main(String[] args) {
        int mark = Integer.parseInt(args[0]);
        Grade g;

        if (mark < 40) {
            g = Grade.N;
        } else if (mark < 50) {
            g = Grade.PX;
        } else if (mark < 60) {
            g = Grade.P;
        } else if (mark < 70) {
            g = Grade.CR;
        } else if (mark < 80) {
            g = Grade.D;
        } else {
            g = Grade.HD;
        }
        IO.println(g.toString());
    }
    void congratulate(Grade g) {
        switch (g) {
            case P  -> IO.println("Congrats! You made it!");
            case CR -> IO.println("Well done!");
            case D  -> IO.println("Even more well done!");
            case HD -> IO.println("Amazing! Do you have time to see your friends?");
            case PX -> IO.println("See you in the supp exam!");
            case N  -> IO.println("Better luck next semester!");
        }
    }
}
