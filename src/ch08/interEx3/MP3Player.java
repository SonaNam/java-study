package ch08.interEx3;

public class MP3Player implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Music Play");

    }

    @Override
    public void pause() {
        System.out.println("Music Pause");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }


}
