package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        BMI window = new BMI();
        window.setVisible(true);
    }

    private JTextField _mField = new JTextField(8);
    private JTextField _kgField = new JTextField(8);
    private JTextField _bmiField = new JTextField(8);


    BMI miBMI = new BMI();
}
