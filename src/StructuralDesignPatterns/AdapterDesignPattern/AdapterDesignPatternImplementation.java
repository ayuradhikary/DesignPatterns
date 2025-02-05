package StructuralDesignPatterns.AdapterDesignPattern;

public class AdapterDesignPatternImplementation {
    public static void main(String[] args) {
        NewAudioPlayer newAudioPlayer = new NewAudioPlayer();
        newAudioPlayer.playMedia("vlc","The dark side of the moon-Pink Floyd");
        newAudioPlayer.playMedia("mp3","Angie-The rolling stone");
    }
}
