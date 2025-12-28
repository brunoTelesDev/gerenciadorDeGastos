public class Gastos {
    private String descricao;
    private double valor;
    private String data;
    private String categoria;
 //constructor

    public Gastos (String descricao, double valor, String data, String categoria) {
        this.descricao = descricao;
        this.valor= valor;
        this.data = data;
        this.categoria = categoria;

        
    }
    //getters and setters
    public String getDescricao() {
        return descricao;
    }
    public Double getValor() {
        return valor;
    }
    public String getData() {
        return data;
    }
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "gastos [descricao=" + descricao + ", valor=" + valor + ", data=" + data +", categoria=" + categoria + "]";
        
    }
    
}
