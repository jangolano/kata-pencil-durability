package org.jangolano;

public class Pencil {

    int point;
    int length;

    Pencil(){
        point = 500;
        length = 20;
    }

    public String write(String text){
        point-=text.length();
        return text;
    }

    public int getPoint(){
        return point;
    }

    public void sharpen(){
        point = 500;
        length-=1;
    }

    public int getLength(){
        return length;
    }
}
