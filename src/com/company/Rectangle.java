package com.company;

import java.util.Scanner;

class Rectangle {
    Point upperLeft, lowerRight;


    public Rectangle(int x1, int y1, int x2, int y2)
    {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }
    public void showPosition()
    {
        System.out.println("직사각형 위치정보...");
        System.out.print("좌 상단 : ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("우 하단 : ");
        lowerRight.showPosition();
        System.out.println("\n");
    }
    public boolean equals(Object obj)
    {
        Rectangle r1 = (Rectangle)obj;
        if(this.upperLeft.equals(r1.upperLeft) && this.lowerRight.equals(r1.lowerRight))
        {
            System.out.println("두 사각형은 같습니다.");
            return true;
        }
        else
        {
            System.out.println("두 사각형은 다릅니다.");
            return false;
        }
    }
}
