import java.util.HashSet;

public class CircleDisposition {

    CircleSet<Circle> circleHashSet = new CircleSet<>();
    CircleOutput output = new CircleOutput();

    public enum CircleDispositionTypes {
        INTERSECTION,
        TANGENT,
        UNINTERSECTION
    }

   void generateCircles(int circleNumber){

       for(int i=0; i<circleNumber; i++)
           circleHashSet.getHashSet().add(Circle.generateCircle());

    }

    private double getDotDistance(int firstDotX, int firstDotY, int secondDotX, int secondDotY) {
        return Math.sqrt(Math.pow(secondDotX - firstDotX, 2) + Math.pow(secondDotY - firstDotY, 2));
    }

    public CircleDispositionTypes checkCirclesOrientation(Circle firstCircle, Circle secondCircle) {

        double centerDistance = getDotDistance(firstCircle.getxCoord(), firstCircle.getyCoord(), secondCircle.getxCoord(), secondCircle.getyCoord());
        double radiusSum = firstCircle.getRadius() + secondCircle.getRadius();

        if (centerDistance == radiusSum) return CircleDispositionTypes.TANGENT;
        else if (centerDistance < radiusSum) return CircleDispositionTypes.INTERSECTION;
        else return CircleDispositionTypes.UNINTERSECTION;

    }

    public void printAllDispositions() {
        generateCircles(10);
        System.out.println(circleHashSet);

        for (Circle firstCircle : circleHashSet.getHashSet()) {

            for (Circle secondCircle : circleHashSet.getHashSet()) {
                if (firstCircle == secondCircle) continue;
                CircleDispositionTypes result = checkCirclesOrientation(firstCircle, secondCircle);
                output.printDispositionType(firstCircle, secondCircle, output.getDispositionResult(result));
            }

        }

    }

}
