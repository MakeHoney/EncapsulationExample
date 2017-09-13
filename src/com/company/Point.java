package com.company;

class Point {
    int xPos, yPos;

    public Point (int x, int y)
    {
        xPos = x;
        yPos = y;
    }

    public boolean equals(Object obj)
    {
        Point p1 = (Point)obj;
        if(xPos == p1.xPos && yPos == p1.yPos)
        {
            System.out.println("두 점은 같습니다.");
            return true;
        }
        else
        {
            System.out.println("두 점은 다릅니다.");
            return false;
        }
    }
    public void showPosition()
    {
        System.out.printf("[%d, %d]", xPos, yPos);
    }
}
