package main;

public class VerticalLine {
    public static void main (String[] args) {
        int n = (args.length == 1? Integer.parseInt(args[0]) : 3);

        for(int i = 0; i < 3; i++)
            System.out.println("*");
    }
}
