import java.util.Scanner;

public class Main<xCordinate, yCordinate> {
    public static void main(String[] args) {


        CalculatePointsEarned pointsEarned = new CalculatePointsEarned();
        String Position=(pointsEarned.calculatePoints(1,1));
        System.out.println(Position);
        int points=pointsEarned.getPointsEarned(Position);
        System.out.println(points);









    }
}
