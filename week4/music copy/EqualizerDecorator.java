package music;

public class EqualizerDecorator implements MusicPlayer {
    private MusicPlayer musicPlayer;

    public EqualizerDecorator(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.play();
        System.out.println("Applying equalizer settings.");
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void stop() {
        musicPlayer.stop();
    }
}
