package ch08.interEx3;

public class Main {
    public static void main(String[] args) {
        MusicPlayer MP3Player = new MP3Player();
        MusicPlayer StreamingMusicPlayer = new StreamingMusicPlayer();

        MP3Player.play();
        MP3Player.pause();
        MP3Player.stop();

        StreamingMusicPlayer.play();
        StreamingMusicPlayer.pause();
        StreamingMusicPlayer.stop();
        }
    }


