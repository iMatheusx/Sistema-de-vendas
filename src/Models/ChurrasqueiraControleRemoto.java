package Models;

public class ChurrasqueiraControleRemoto extends Produtos{

    private String cor;
    private String codigoDeBarra;

    public ChurrasqueiraControleRemoto(String nome, String tipo, String qtdEstoque, String qualidade) {
        super(nome, tipo, qtdEstoque, qualidade);
    }


    @Override
    public String ligar() {
        return "Ligando a churrasqueira";
    }

    @Override
    public String vender() {
        return null;
    }

    @Override
    public String comprar() {
        return null;
    }

    @Override
    public String trocar() {
        return null;
    }
}
