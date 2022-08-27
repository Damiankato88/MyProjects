package task6a.task6b;

import task6a.Point;

public class PointController {


    public void pointMove(Point point, int direction) {
        switch (direction) {
            case 0:
                point.setX(point.getX() + 1);
                break;
            case 1:
                point.setY(point.getY() + 1);
                break;
            case 2:
                point.setX(point.getX() - 1);
                break;
            case 3:
                point.setY(point.getY() - 1);
                break;
        }
    }

}



