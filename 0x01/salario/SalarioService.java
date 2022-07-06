import java.util.UUID;

public class SalarioService {
    private CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadoraService();

    public double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return calculador.calcularSalarioLiquido(salarioBruto,valorDescontos, valorVendas, percentualComissao);
    }

    public UUID getUuid(){
        return CalculadorSalarioService.getCalculadoraService().uuid;
    }
}
