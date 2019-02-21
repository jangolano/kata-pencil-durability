package org.jangolano;

public class Pencil {

    int point;

    Pencil(){
        point = 500;
    }

    public String write(String text){
        point-=text.length();
        return text;
    }

    public int getPoint(){
        return point;
    }

    public void sharpen(){

    }
}
