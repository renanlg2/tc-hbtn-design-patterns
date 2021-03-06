public class Guerreiro extends Personagem {

    public Guerreiro(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, tipo, inteligencia, forca, vigor, resistencia, destreza);

        if (forca < inteligencia || forca < destreza) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return  (super.getInteligencia() * 0.05) +
                (super.getForca() * 0.8) +
                (super.getDestreza() * 0.10) +
                (super.getVigor() * 0.05);
    }
}
