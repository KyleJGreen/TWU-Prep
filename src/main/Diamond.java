package main;

public class Diamond {
    public static void main (String[] args) {
        int n = (args.length == 1? Integer.parseInt(args[0]) : 3);

        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < i * 2 + 1; k++)
                System.out.print("*");
            System.out.print("\n");
        }
        for(int i = n - 1; i > 0; i--) {
            for(int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = i * 2 - 1; k > 0; k--)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
