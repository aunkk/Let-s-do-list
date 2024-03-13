package javaant;

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class ControlMusic{
    String music, musicPath;
    Player player;
    long musicProgress, musicDuration;
    FileInputStream fin;
    BufferedInputStream bin;
    
    public void PlayMusic(String musicPath){
        try {
            fin = new FileInputStream(musicPath);
            bin = new BufferedInputStream(fin);
            player = new Player(bin);
            musicDuration = fin.available();
            //fix later
            this.musicPath = musicPath;
            //----
            
            
            //old ver.
            /*File musicPath = new File(mPath);
        
            //if(musicPath.exists()) {
                
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip player = AudioSystem.getClip();
                player.open(audioInput);
                player.start();
                
                JOptionPane.showMessageDialog(null,"Ok to close");
            }else {
                System.out.println("file not found");
            }*/
        }catch(IOException | JavaLayerException e){
            e.printStackTrace();
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                    if (StudyWithMeGUI.isLoop && player.isComplete()) {
                        PlayMusic(musicPath);
                    }
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }.start();
    }
    
    public void PauseMusic(){
        if(player!=null) {
        try{
            musicProgress = fin.available();
            player.close();
        }catch(IOException ex) {
            ex.printStackTrace();
                }
        }
    }
    
    //copy from play, might merge'em later
    public void ResumeMusic(){
        try {
            fin = new FileInputStream(musicPath);
            bin = new BufferedInputStream(fin);
            player = new Player(bin);
            try {
                fin.skip(musicDuration - musicProgress);
            }catch(IOException ex){
            ex.printStackTrace();
            }

        }catch(IOException | JavaLayerException e){
            e.printStackTrace();
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                }catch(JavaLayerException ex) {
                    ex.printStackTrace();
                }
            }
        }.start();
    }
    //lazy laew kub
    public void NextMusic(){}
    public void PreviousMusic(){}
    
}
    
