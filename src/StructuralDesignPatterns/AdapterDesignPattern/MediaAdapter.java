package StructuralDesignPatterns.AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer{
    private VlcPlayer vlcPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer = new VlcPlayer();
        }
    }

    @Override
    public void playMedia(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer.playVlcMedia(filename);
        }
    }
}
