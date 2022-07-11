public class Program {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.reproduzir(TipoMedia.MP3, "The Weeknd - Blinding Lights.mp3");

        VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();
        videoMediaPlayer.reproduzirMP4("Uncharted.mp4");

        audioPlayer.reproduzir(TipoMedia.VLC, "Moon Knight S01E01.vlc");
    }
}