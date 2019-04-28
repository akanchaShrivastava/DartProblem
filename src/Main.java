import java.util.Scanner;

public class Main {
    CalculateCordinatesInADartGame pointsEarned=new CalculateCordinatesInADartGame();

    dartBoardPosition position=new dartBoardPosition(InnerCircleOfTheTarget);

    Scanner dartCordinates = new Scanner(System.in);




        System.out.println("Please enter the Dart x Cordinates");

    int xCordinate = dartCordinates.nextInt();

        System.out.println("Please enter the Dart y Cordinates");

    int yCordinate = dartCordinates.nextInt();

        System.out.println("X cordinate ="+xCordinate+"Y cordinate"+yCordinate);



}
