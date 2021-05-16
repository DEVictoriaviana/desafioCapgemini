import java.time.LocalDate;

/**
 * Classe anuncio com variaveis para o cadastro.
 *
 * @author Victoria Viana <victhoriaviana@gmail.com>
 */
public class Anuncio {
    String nomeDoAnuncio;
    String nomeCliente;
    LocalDate dataInicio;
    LocalDate dataTermino;
    int investimentoPorDia;


    public String getNomeDoAnuncio() {
        return nomeDoAnuncio;
    }

    public void setNomeDoAnuncio(String nomeDoAnuncio) {
        this.nomeDoAnuncio = nomeDoAnuncio;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getInvestimentoPorDia() {
        return investimentoPorDia;
    }

    public void setInvestimentoPorDia(int investimentoPorDia) {
        this.investimentoPorDia = investimentoPorDia;
    }
}
