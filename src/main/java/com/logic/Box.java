package com.logic;

public class Box {
    private static int IDc = 0; // change later with file data
    private int ID;
    private int X;
    private int Y;

    public Box(int _X, int _Y){
        X = _X;
        Y = _Y;
        ID = IDc;
        IDc++;
    }

    // GET&SET
    public int getX() { return X; }
    public int getY() { return Y; }
    public int getID(){ return ID; }
}
