/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekthree;

import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class Junk {

    public static void main(String[] args) {
        ArrayList<String> band = new ArrayList<String>();
        String[] band2 = {"Shak", "Baal", "Saal"};
        band.add("SHak");
        band.add("hoss");
        band.add("Don");

        band.forEach((i) -> {
            System.out.println(i);
        });
        System.out.println("****************");

        band.remove(band.indexOf("hoss"));
        band2[0].
        band.forEach((i) -> {
            System.out.println(i);
        });
    }

}
