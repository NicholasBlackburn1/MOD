import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class class3 {
	public static void main(String[] args) {        
        try{
        	
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("3.wav"));
            Clip test = AudioSystem.getClip();  

            test.open(ais);
            test.start();

            while (!test.isRunning())
                Thread.sleep(0);
            while (test.isRunning())
                Thread.sleep(0);

            test.close(); 
            Crash.main(args);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.print("class3");
        }
    }
}



