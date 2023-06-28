package ch08.interEx3;

public class StreamingMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("작동중1");
    }

    @Override
    public void pause() {
        System.out.println("작동중2");
    }

    @Override
    public void stop() {
        System.out.println("작동중3");
    }
}
