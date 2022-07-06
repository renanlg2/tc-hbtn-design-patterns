public class LadraoBuilder implements Builder {
    private String nome;
    private TipoPersonagem tipoPersonagem;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;


    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(TipoPersonagem tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Ladrao build() {
        return new Ladrao(nome, tipoPersonagem, inteligencia, forca, vigor, resistencia, destreza);
    }
}
