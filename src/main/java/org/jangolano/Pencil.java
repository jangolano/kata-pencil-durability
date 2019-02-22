package org.jangolano;
class Pencil {

    private  Integer point=500;
    private  Integer length=20;
    private  Integer eraser=500;

    enum DurabilityType{POINT, ERASER}

    Pencil(){
    }

    String write(String text){
        return textToBeChanged(text, DurabilityType.POINT);
    }


    private String textToBeChanged(String text, DurabilityType value){
        char [] textToBeWritten = text.toCharArray();
        StringBuilder textToWrite = new StringBuilder();

        int objectDurability=0;

        objectDurability = getObjectDurability(value, objectDurability);

        for (char c : textToBeWritten) {
            if (objectDurability > 0) {
                objectDurability -= 1;
                textToWrite.append(c);
            } else {
                break;
            }
        }
        setObjectDurabilityValue(value, objectDurability);
        return textToWrite.toString();
    }

    private void setObjectDurabilityValue(DurabilityType value, int objectDurability) {
        if(value== DurabilityType.ERASER){
            eraser = objectDurability;
        }
        else if(value == DurabilityType.POINT){
            point = objectDurability;
        }
    }

    private int getObjectDurability(DurabilityType value, int objectDurability) {
        if(value== DurabilityType.ERASER){
            objectDurability=eraser;
        }else if(value == DurabilityType.POINT){
            objectDurability=point;
        }
        return objectDurability;
    }

    int getPoint(){
        return point;
    }

    void sharpen(){
        if(length!=0) {
            point = 500;
            length -= 1;
        }else{
            point =0;
        }
    }

    int getLength(){
        return length;
    }

    int getEraser(){
        return eraser;
    }

    void erase(String text){
        textToBeChanged(text, DurabilityType.ERASER);
    }

}
