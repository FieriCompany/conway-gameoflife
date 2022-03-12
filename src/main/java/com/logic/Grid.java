package com.logic;

import java.util.ArrayList;

public class Grid {
    private ArrayList< ArrayList<Box> > boxes = new ArrayList<>();
    private int width;
    private int height;

    public Grid(int _width, int _height) {
        width = _width;
        height = _height;

        // init grid (empty)
        for (int i=0; i < height; i++){
            boxes.add( new ArrayList<Box>() );
            for (int j=0; j < width; j++){ boxes.get(i).add( new Box(j, i) ); }
        }
    }

    public Grid( ArrayList< ArrayList<Box> > _boxes ){
        height = _boxes.size();
        width  = _boxes.get(0).size();

        boxes = _boxes;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public ArrayList<Box> getGridIndex( int _index ) { return boxes.get(_index); }
    public Box getBoxIndex(int _index1, int _index2) { return boxes.get(_index1).get(_index2); }
}
