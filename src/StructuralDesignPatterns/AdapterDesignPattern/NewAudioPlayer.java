package StructuralDesignPatterns.AdapterDesignPattern;

public class NewAudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void playMedia(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3: "+ filename);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.playMedia(audioType,filename);
        }else {
            System.out.println("Playing media type: "+ audioType);
        }
    }
}
