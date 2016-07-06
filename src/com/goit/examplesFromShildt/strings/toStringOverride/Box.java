package com.goit.examplesFromShildt.strings.toStringOverride;
/*
*p.475
 */
public class Box {
    private int height;
    private int weight;
    private int deep;

    Box(int height, int weight, int deep){
        this.height = height;
        this.weight = weight;
        this.deep = deep;
    }
    @Override
    public String toString (){
        return "This is toString Override Method: Box dimension: " + weight + height + deep;
    }

}
