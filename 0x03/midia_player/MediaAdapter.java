public class MediaAdapter implements MediaPlayer{

    public MediaAdapter(TipoMedia tipoMedia, String nomeArquivo) {
        reproduzir(tipoMedia, nomeArquivo);
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();

        if (tipoMedia == TipoMedia.MP4){
            videoMediaPlayer.reproduzirMP4(nomeArquivo);
        } else if (tipoMedia == TipoMedia.VLC){
            videoMediaPlayer.reproduzirVlc(nomeArquivo);
        }
    }
}
