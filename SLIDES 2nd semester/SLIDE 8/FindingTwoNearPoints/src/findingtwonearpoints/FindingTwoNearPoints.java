package findingtwonearpoints;

public class FindingTwoNearPoints {

    public static void main(String[] args) {

        double[][] points
                = {
                    {-1, 3},
                    {-1, -1},
                    {1, 1},
                    {2, 0.5},
                    {2, -1},
                    {3, 3},
                    {4, 2},
                    {4, -0.5}
                };

        double minDistance = 100;
        double distance = 0;
        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                distance = Math.sqrt(Math.pow((points[i][1] - points[j][1]), 2) + Math.pow((points[i][0] - points[j][0]), 2));
//                System.out.println("point " + (i + 1) + " distance " + distance + " form point " + (j + 1));
                if (distance < minDistance) {
                    minDistance = distance;
                    point1 = i + 1;
                    point2 = j + 1;
                }
            }
        }

        System.out.println("the closest points are (" + points[point1 - 1][0] + "," + points[point1 - 1][1] + ") and (" + points[point2 - 1][0] + "," + points[point2 - 1][1] + ")");
        
    }

}
