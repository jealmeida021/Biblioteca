import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExercicioListaLivro exercicioListaLivro = new ExercicioListaLivro();
        List<Livro> listaDeLivros = new ArrayList<>();


        int opcao;
        do {
            System.out.println("Menu de opções : ");
            System.out.println("1 : Adicionar um novo livro");
            System.out.println("2 : Exibir lista de livros");
            System.out.println("3 : Buscar livro por título");
            System.out.println("0 : Encerrar programa");
            System.out.println("Digite uma das opções acima");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro ");
                    String novoTitulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro ");
                    String novoAutor = scanner.nextLine();
                    System.out.println("Digite a pontuacao do livro ");
                    double novaPontuacao = scanner.nextDouble();
                    Livro novoLivro = new Livro(novoTitulo, novoAutor, novaPontuacao);
                    listaDeLivros.add(novoLivro);
                    System.out.println("Livro adicionado com sucesso.\n");
                    break;
                case 2:
                    if (listaDeLivros.isEmpty()) {
                        System.out.println("Lista vazia\n");
                    } else {
                        exercicioListaLivro.exibirLivros(listaDeLivros);

                    }
                    break;

                case 3:
                    System.out.println("Digite o titulo que você deseja buscar :");
                    String tituloDabusca = scanner.nextLine();
                    List<Livro> livrosEncontrados = exercicioListaLivro.buscarPorTitulo(listaDeLivros, tituloDabusca);
                    if (livrosEncontrados == null) {
                        System.out.println("Livro não encontrado");
                    } else {
                        exercicioListaLivro.exibirLivros(livrosEncontrados);
                    }
                    break;

                case 0:
                    System.out.println("Programa esta sendo encerrado \n");
                    break;
                default:
                    System.err.println("Opção invalida \n");
            }
        } while (opcao != 0);
    }

}