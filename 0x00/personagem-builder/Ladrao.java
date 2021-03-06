public class Ladrao extends Personagem{

    public Ladrao(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, tipo, inteligencia, forca, vigor, resistencia, destreza);

        if (destreza < forca || destreza < inteligencia) {
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return  (super.getInteligencia() * 0.05) +
                (super.getForca() * 0.5) +
                (super.getDestreza() * 0.35) +
                (super.getVigor() * 0.10);
    }
}
