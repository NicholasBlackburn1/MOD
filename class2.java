import java.io.File;
import javax.sound.sampled.*;

public class class2 {
    public static void main(String[] args) {        
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("2.wav"));
            Clip test = AudioSystem.getClip();  

            test.open(ais);
            test.start();

            while (!test.isRunning())
                Thread.sleep(0);
            while (test.isRunning())
                Thread.sleep(0);

            test.close();
            main.main(args);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.print("Class2 loaded");
        }
    }
}
