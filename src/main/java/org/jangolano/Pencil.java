package org.jangolano;

import java.util.ArrayList;

public class Pencil {

    int point;
    int length;
    int eraser;
    Pencil(){
        point = 500;
        length = 20;
        eraser = 500;
    }

    public String write(String text){
        char [] textToBeWritten = text.toCharArray();
        StringBuffer textToWrite = new StringBuffer();

        for(int i=0;i<textToBeWritten.length;i++){
            if(point>0) {
                point-=1;
                textToWrite.append(textToBeWritten[i]);
            }else{
                break;
            }
        }
        return textToWrite.toString();
    }

    public int getPoint(){
        return point;
    }

    public void sharpen(){
        if(length!=0) {
            point = 500;
            length -= 1;
        }else{
            point =0;
        }
    }

    public int getLength(){
        return length;
    }

    public int getEraser(){
        return eraser;
    }

    public void erase(String text){
        char [] textToBeWritten = text.toCharArray();
        StringBuffer textToWrite = new StringBuffer();

        for(int i=0;i<textToBeWritten.length;i++){
            if(eraser>0) {
                eraser-=1;
                textToWrite.append(textToBeWritten[i]);
            }else{
                break;
            }
        }
    }
}
