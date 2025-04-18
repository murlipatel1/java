// Target interface
interface MediaPlayer {
    void play(String fileName);
}

// Adaptee class
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String fileName) {
        advancedMusicPlayer.playAdvancedMusic(fileName);
    }
}

// Advanced Media Player interface
interface AdvancedMediaPlayer {
    void playAdvancedMusic(String fileName);
}

// Concrete implementation of AdvancedMediaPlayer
class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playAdvancedMusic(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}

class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAdvancedMusic(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

// Client code using Adapter pattern
public class AdapterPatternExample {
    public static void main(String[] args) {
        MediaPlayer player1 = new MediaAdapter(new MP4Player());
        player1.play("song.mp4");

        MediaPlayer player2 = new MediaAdapter(new VLCPlayer());
        player2.play("movie.vlc");
    }
}
