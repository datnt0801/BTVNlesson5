public class lesson5bai2 {
    public static void main(String[] args) {
        System.out.println(thor(12));
        System.out.println(Fibo(6));
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static int thor(int n) {
        int de = 0;
        int hold = 0;
        int tholon = 0;
        int thocon = 1;
        for (int i = 0; i < n - 1; i++) {
            int decu = de;
            int holdcu = hold;
            int tholoncu = tholon;
            int thoconcu = thocon;

            hold = tholoncu + decu;
            tholon = thoconcu;
            de = holdcu;
            thocon = decu;
            System.out.println(de);
            System.out.println(hold);
            System.out.println(tholon);
            System.out.println(thocon);
            System.out.println("vong thu " + i);
        }
        return de + tholon + thocon + hold;
    }

    public static int Fibo(int n) {
        if (n == 1 || n == 2) return 1;
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
