/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.case1;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peterhendriks
 */
public class Wake {

    public Wake(int interval) {

        while (true) {

            try {
                
                int x = MouseInfo.getPointerInfo().getLocation().x + 10;
                int y = MouseInfo.getPointerInfo().getLocation().y + 10;

                new Robot().mouseMove(x,y);

                System.out.println("Wake! "
                        + new Date()
                        + " moved mouse to new location: "
                        + x 
                        +", "
                        +y);

                Thread.sleep(interval);
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
