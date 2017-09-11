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
    public boolean Requals(Rectangle r1, Rectangle r2)
    {
        if(r1.lowerRight.xPos == r2.lowerRight.xPos && r1.lowerRight.yPos == r2.lowerRight.yPos
                && r1.upperLeft.xPos == r2.upperLeft.yPos && r1.upperLeft.yPos == r2.upperLeft.yPos)
        {
            System.out.println("두 사각형은 같습니다.");
            return true;
        }
        else
        {
            System.out.println("두 사각형은 다릅니다.");
            return false;
        }

        // 캡슐화에 근거하면 각 클래스에 equals 메소드를 오버라이딩하는 것이 좋은 방법이다.
    }
}
