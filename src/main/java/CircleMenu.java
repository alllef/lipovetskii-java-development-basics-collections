import java.util.Scanner;

public class CircleMenu {

    public void startMenu(){

        Scanner scanner = new Scanner(System.in);
        CircleDisposition circleDisposition = new CircleDisposition();

        System.out.println("Enter number of circles, that you want to generate");
        circleDisposition.generateCircles(scanner.nextInt());
        System.out.println(circleDisposition.circleHashSet);
        circleDisposition.printAllDispositions();

    }

}
