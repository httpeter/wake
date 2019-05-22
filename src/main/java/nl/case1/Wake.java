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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peterhendriks
 */
public class Wake {

    public Wake() {
        Robot robot;

        try {
            robot = new Robot();
            while (true) {                
                PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                robot.mouseMove(pointerInfo.getLocation().x + 1,
                        pointerInfo.getLocation().y + 1);
                Thread.sleep(20000);
            }

        } catch (AWTException ex) {
            Logger.getLogger(Wake.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Wake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
