import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que cadastra anuncios.
 *
 * @author Victoria Viana. <victhoriaviana@gmail.com>
 */
public class CadastroAnuncio {
    public static void main (String []args){
        ArrayList<Anuncio> listaAnuncios = new ArrayList<Anuncio>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 3;
        do {
            System.out.println("Digite 1 para cadastrar anúncio.");
            System.out.println("Digite 2 para visualizar relatório.");
            System.out.println("Digite 0 para sair do programa.");
            opcao = scanner.nextInt();
            if (opcao == 1){
                Anuncio anuncio = new Anuncio();
                System.out.println("Digite um nome para o anúncio: ");
                anuncio.nomeDoAnuncio = scanner.next();
                System.out.println("Digite um nome para o cliente");
                anuncio.nomeCliente = scanner.next();
                System.out.println("Digite uma data de início:(YYYY-MM-DD)");
                anuncio.dataInicio = LocalDate.parse(scanner.next());
                System.out.println("Digite uma data para o término (YYYY-MM-DD):");
                anuncio.dataTermino = LocalDate.parse(scanner.next());
                System.out.println("Digite um valor para investir por dia: ");
                anuncio.investimentoPorDia = scanner.nextInt();

                listaAnuncios.add(anuncio);
            }else if(opcao == 2){
                System.out.println("|Nome anúncio |Valor total investido| Max. visualizações| Max. cliques| Max. compartilhamentos");
            }
        } while (opcao !=0);
    }
}




