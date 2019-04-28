public class CalculateCordinatesInADartGame {
    int xcordinate;
    int ycordinate;
    int playerPoints = 0;
    double dartPosition;


    CalculateCordinatesInADartGame(int xcordinate, int ycordinate){
        this.xcordinate=xcordinate;
        this.ycordinate=ycordinate;


    }
public int calculatePoints(int xCordinate,int yCordinate){



    dartPosition = Math.sqrt(Math.pow(xCordinate,2)+Math.pow(yCordinate,2));

    System.out.println(dartPosition);

    if (dartPosition >0 && dartPosition <= 1)
    {
        playerPoints = 10;
    }

    if (dartPosition > 1 && dartPosition <= 5)
    {
        playerPoints = playerPoints+5;
    }
    if (dartPosition > 5 && dartPosition <= 10)
    {
        playerPoints = playerPoints+1;
    }
    if (dartPosition > 10)
    {
        System.out.println("Please enter the cordinates correctly");
        playerPoints = playerPoints + 0;
    }

    System.out.println("Player points are:"+ playerPoints);

}





}
