/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;


/**
 *
 * @author user
 */
public class Audio {

    private static Clip clip;

    public void music() {
        try {
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("Game.wav"));
            clip = AudioSystem.getClip();
            clip.open(in);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            FloatControl gainControlA = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControlA.setValue(-80f + 65);
        }catch (Exception ex){
            System.out.println("Error with playing sound.");
        }
    }
    public void musicstop() throws InterruptedException{
        clip.stop();
    }
}
