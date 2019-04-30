public class CalculatePointsEarned {
    int xcordinate;
    int ycordinate;
    int PointsEarned = 0;
    double dartPosition;


    public String calculatePoints(int xCordinate, int yCordinate) {


        String Position = "OutSide the Dart";

        dartPosition = Math.sqrt(Math.pow(xCordinate, 2) + Math.pow(yCordinate, 2));

        System.out.println(dartPosition);

        if (dartPosition > 0 && dartPosition <= 1) {
            Position = "InnerCircleOfTheTarget";

        }

        if (dartPosition > 1 && dartPosition <= 5) {
            Position = "MiddleCircleOfTheTarget";

        }
        if (dartPosition > 5 && dartPosition <= 10) {
            Position = "OuterCircleOfTheTarget";

        }
        if (dartPosition > 10) {
            System.out.println("Please enter the cordinates correctly");

        }


        return Position;

    }

    public int getPointsEarned(String position) {

        int pointsEarned;

        switch (position) {
            // case statements
            // values must be of same type of expression
            case "InnerCircleOfTheTarget":

                pointsEarned = 10;
                break; // break is optional

            case "OuterCircleOfTarget":
                pointsEarned = 1;
                break; // break is optional

            case "MiddleCircleOfTheTarget":
                pointsEarned = 5;
                break; // break is optional

            // We can have any number of case statements
            // below is default statement, used when none of the cases is true.
            // No break is needed in the default case.
            default:
                pointsEarned = 0;
                // Statements
        }
        return pointsEarned;


    }
}
