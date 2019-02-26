package org.jangolano;

class Paper {
    private StringBuilder stringBuilder = new StringBuilder();

    void appendText(String text){
        stringBuilder.append(text);
    }

    String getText(){
        return stringBuilder.toString();
    }

    void setText(String text){
        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append(text);
    }
}
