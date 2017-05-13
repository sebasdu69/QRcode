package main;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class QRSound {
	public QRSound(){}
	
	private void delayfor(int n){
		try {
		    Thread.sleep(n * 500);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	
    /*
	 * Method is passed a sound flag it will play that sound there is only one
	 * currently supported. To use this sound - call new playit(SOUND);
	 */
	public void playWelcome() {
		File soundW;
		try {
			soundW = new File("/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/Welcome.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundW);
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.delayfor(9);
	}
	
	public void playit(String soundRequired) {
		String fn = null;
		File sound;

		this.playWelcome();
 
		switch (soundRequired) {
			case "Engineering Bulding":
				fn = "/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/Engineering Building.wav";
				break;
			case "Block F":
				fn = "/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/Block F.wav";
				break;
			case "Science Bulding":
				fn = "/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/Science Building.wav";
				break;
			case "Business Bulding":
				fn = "/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/Buisiness Building.wav";
				break;
			case "Main Block":
				fn = "/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/Main Block.wav";
				break;
			default:
				fn = "/Users/faguets/Google Drive/Perso/Cours ESME/Semestre 2/Software Engineering/Projets/Seb/QR1/src/resources/ERROR-BLA.wav";
				break;
		}
		// Go for it!
		try {
			// Open an audio input stream.
			sound = new File(fn);
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
			// plays
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.delayfor(20);
	}
}