public class ImpressaoFactory {

    private static double valorColoridasFrenteVerso;
    private static double valorPretoBrancoFrenteVerso;
    private static double valorColoridasFrenteApenas;
    private static double valorPretoBrancoFrenteApenas;

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao,
                                            int totalPaginas,
                                            int qtdPaginasColoridas,
                                            boolean ehFrenteVerso){

        if (tamanhoImpressao == TamanhoImpressao.A2){
            if (ehFrenteVerso){
                valorPretoBrancoFrenteVerso = 0.18;
                valorColoridasFrenteVerso = 0.28;
            } else {
                valorPretoBrancoFrenteApenas = 0.22;
                valorColoridasFrenteApenas = 0.32;
            }

        } else if (tamanhoImpressao == TamanhoImpressao.A3){
            if (ehFrenteVerso){
                valorPretoBrancoFrenteVerso = 0.15;
                valorColoridasFrenteVerso = 0.25;
            } else {
                valorPretoBrancoFrenteApenas = 0.20;
                valorColoridasFrenteApenas = 0.30;
            }

        } else if (tamanhoImpressao == TamanhoImpressao.A4) {
            if (ehFrenteVerso){
                valorPretoBrancoFrenteVerso = 0.10;
                valorColoridasFrenteVerso = 0.20;
            } else {
                valorPretoBrancoFrenteApenas = 0.15;
                valorColoridasFrenteApenas = 0.25;
            }

        }


        return new Impressao(
                totalPaginas,
                qtdPaginasColoridas,
                ehFrenteVerso,
                valorColoridasFrenteVerso,
                valorPretoBrancoFrenteVerso,
                valorColoridasFrenteApenas,
                valorPretoBrancoFrenteApenas);
    }
}
