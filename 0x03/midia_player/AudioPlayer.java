public class AudioPlayer implements MediaPlayer{

    public AudioPlayer() {
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia == TipoMedia.MP3){
            System.out.print("Reproduzindo MP3: " + nomeArquivo);
        } else {
            MediaAdapter mediaAdapter = new MediaAdapter(tipoMedia, nomeArquivo);
        }
    }
}
