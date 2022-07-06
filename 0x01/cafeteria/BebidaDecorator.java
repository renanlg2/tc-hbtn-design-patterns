import java.util.ArrayList;
import java.util.List;

public class BebidaDecorator extends Bebida{
    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = new ArrayList<String>();
        ingredientes.addAll(bebidaDecorada.obterIngredientes());
        ingredientes.add("leite");
        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return bebidaDecorada.obterPreco();
    }
}
