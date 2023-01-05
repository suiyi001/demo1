package com.ty.demo1;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(new Demo1().mySqrt(Integer.MAX_VALUE));
        System.out.println(new Demo1().mySqrt(99));
        System.out.println(new Demo1().mySqrt(8));
        System.out.println(new Demo1().mySqrt(7));
        System.out.println(new Demo1().mySqrt(6));
        System.out.println(new Demo1().mySqrt(5));
        System.out.println(new Demo1().mySqrt(4));
        System.out.println(new Demo1().mySqrt(3));
        System.out.println(new Demo1().mySqrt(2));
        System.out.println(new Demo1().mySqrt(1));
        System.out.println(new Demo1().mySqrt(0));
    }

    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int i = 0, end = x / 2;
        while (i <= end) {
            if (i * i > x) {
                return i - 1;
            }
            i++;
        }
        return end;
    }


}
