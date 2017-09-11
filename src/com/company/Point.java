package com.company;

class Point {
    int xPos, yPos;

    public Point (int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    public void showPosition()
    {
        System.out.printf("[%d, %d]", xPos, yPos);
    }
}
