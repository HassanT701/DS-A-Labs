package lineLab;

import java.util.Scanner;

public class mainFile {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	
        MyPoint[] pointData = makePoint();
        Line lineOne = new Line(pointData[0], pointData[1]);
        Line lineTwo = new Line(pointData[2], pointData[3]);

        while (true) {
        	System.out.println("--- Line Lab ---");
            System.out.println("1. View Line One");
            System.out.println("2. View Line Two");
            System.out.println("3. Change Line One");
            System.out.println("4. Change Line Two");
            System.out.println("5. View Intersection\n");
            
            int menuInput = sc.nextInt();

            switch (menuInput) {
                case 1 -> {
                	System.out.println(lineOne);
                	System.out.println("");
                }
                case 2 -> {
                	System.out.println(lineTwo);
                	System.out.println("");
                }
                case 3 -> {
                	System.out.println("1. Change Point One");
                    System.out.println("2. Change Point Two");
                    System.out.println("3. Change Both");
                    System.out.println("4. Cancel\n");

                    int selection = sc.nextInt();

                    if (selection == 4) {
                        return;
                    }

                    System.out.println("Enter a X value");
                    double newX = sc.nextDouble();
                    System.out.println("Enter a Y value");
                    double newY = sc.nextDouble();

                    switch (selection) {
                        case 1 -> {
                            lineOne.setPointOne(new MyPoint(newX, newY));
                        }
                        case 2 -> {
                            lineOne.setPointTwo(new MyPoint(newX, newY));
                        }
                        case 3 -> {
                            lineOne.setPointOne(new MyPoint(newX, newY));
                            lineOne.setPointTwo(new MyPoint(newX, newY));
                        }
                    }
                }
                case 4 -> {
                	System.out.println("1. Change Point One");
                    System.out.println("2. Change Point Two");
                    System.out.println("3. Change Both");
                    System.out.println("4. Cancel\n");

                    int selection = sc.nextInt();

                    if (selection == 4) {
                        return;
                    }

                    System.out.println("Enter a X value");
                    double newX = sc.nextDouble();
                    System.out.println("Enter a Y value");
                    double newY = sc.nextDouble();

                    switch (selection) {
                        case 1 -> {
                            lineTwo.setPointOne(new MyPoint(newX, newY));
                        }
                        case 2 -> {
                            lineTwo.setPointTwo(new MyPoint(newX, newY));
                        }
                        case 3 -> {
                            lineTwo.setPointOne(new MyPoint(newX, newY));
                            lineTwo.setPointTwo(new MyPoint(newX, newY));
                        }
                    }
                }
                case 5 -> {
                    MyPoint intersection = Line.findIntersection(lineOne, lineTwo);

                    if (Double.isNaN(intersection.getX()) || Double.isNaN(intersection.getY())) {
                        System.out.println("No valid intersection found.");
                    } else {
                        System.out.println(intersection);
                        System.out.println("");
                        }
                }
                default -> {
                	System.out.println("--- Line Lab ---");
                    System.out.println("1. View Line One");
                    System.out.println("2. View Line Two");
                    System.out.println("3. Change Line One");
                    System.out.println("4. Change Line Two");
                    System.out.println("5. View Intersection\n");
                }
            }
        }

    }

    public static MyPoint[] makePoint() {
        MyPoint[] pointData = new MyPoint[4];

        double tempX;
        double tempY;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter X Value");
            tempX = sc.nextDouble();
            System.out.println("Enter Y Value.");
            tempY = sc.nextDouble();
            System.out.println("Point Created.\n\n");
            pointData[i] = new MyPoint(tempX, tempY);
        }

        return pointData;
    }

}
