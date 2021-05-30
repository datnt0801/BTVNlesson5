import java.util.Stack;

public class lesson5bai4 {
    public static void main(String[] args) {
        boolean banco[][] = new boolean[4][4];
        boolean banco1[][] = new boolean[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==0&&j==1||i==1&&j==3 ||i==2&&j==0||i==3&&j==2) banco[i][j]=true;
                if (!banco[i][j]) System.out.print("[ ]");
                else System.out.print("[X]");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==1&&j==0||i==0&&j==2||i==2&&j==3||i==3&&j==1) banco1[i][j]=true;
                if (!banco1[i][j]) System.out.print("[ ]");
                else System.out.print("[X]");

            }
            System.out.println();
        }
    }
}
