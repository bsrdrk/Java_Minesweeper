import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int row,column;
        System.out.println("Welcome to Minesweeper !");
        System.out.println("Please enter the dimensions you want to play !");
        System.out.print("Row : ");
        row = scan.nextInt();
        System.out.print("Column :");
        column = scan.nextInt();

        Minesweeper mine = new Minesweeper(row,column);
        mine.run();
    }

}
