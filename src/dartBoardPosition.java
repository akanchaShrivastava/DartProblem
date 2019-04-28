public class dartBoardPosition {

    String position;


    dartBoardPosition(String position) {
        this.position = position;

    }

    public int getPointsEarned(String position) {

        int pointsEarned;

        switch (position) {
            // case statements
            // values must be of same type of expression
            case InnerCircleOfTheTarget:
                pointsEarned = 10;
                break; // break is optional

            case OuterCircleOfTarget:
                pointsEarned = 1;
                break; // break is optional

            case MiddleCircleOfTarget:
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



