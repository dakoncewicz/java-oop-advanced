package com.dkoncewicz;

public class TextBox extends UIControl {
    private String text;

    /* public TextBox() {
        super(true);  //must be first line
        System.out.println("TextBox is created");
    }*/

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return "TextBox{" +
                "text='" + text + '\'' +
                '}';
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
