package com.dkoncewicz;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = { new TextBox(), new CheckBox()};

        // procedural code
        for (var control : controls) {
            control.render();

            // if ( control is TextBox)
            //      renderTextBox()
            // else if ( control is CheckBox )
            //      renderCheckBox()
            // else.....


        }
    }

}