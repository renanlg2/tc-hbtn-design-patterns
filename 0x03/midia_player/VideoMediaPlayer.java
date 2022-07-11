public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String nomeArquivo) {
        System.out.println("Reproduzindo VLC: " + nomeArquivo);
    }

    @Override
    public void reproduzirMP4(String nomeArquivo) {
        System.out.println("Reproduzindo MP4: " + nomeArquivo);
    }
}
