package com.rotugov;

import Figure.Figure;
import Utils.ConfigReader;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String file = "./Config.cfg";
        ConfigReader configReader = new ConfigReader(file);
        ArrayList<Figure> arrayListOfFigures = configReader.getFiguresFromConfig();

        for (Figure f : arrayListOfFigures) {
            System.out.print(f.getName());
            System.out.print(" Square : " + f.square());
            System.out.print(" Color : " + f.getColor());
            System.out.println("");
        }
    }
}
