package com.atlas.application;

import com.atlas.geo.Punkt;

public class Application
{
    public static void main(String[] args) {
        Punkt p1 = new Punkt();

        for (int i = 0; i < 11; i++) {
            p1.rechts();
            System.out.println(p1.toString());
        }
    }
}
