package main;

public class HorizontalLine {
    public static void main (String[] args) {
        int n = (args.length == 1? Integer.parseInt(args[0]) : 8);

        for(int i = 0; i < n; i++)
            System.out.print("*");
    }
}
