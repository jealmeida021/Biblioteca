import java.util.*;

public class ExercicioListaLivro {

    // exibirLivro(Livro livro): exibe os detalhes de um livro (título, autor, pontuação)
    //Método para exibir titulo
    public void exibirLivro(Livro variavelLivro) {
        System.out.println("Titulo : " + variavelLivro.getTitulo());
        System.out.println("Autor : " + variavelLivro.getAutor());
        System.out.println("Pontuação : " + variavelLivro.getPontuacao());
        System.out.println();
    }

    //  exibirLivros(List livros): exibe os detalhes de todos os livros na lista.

    public void exibirLivros(List<Livro> listaDelivros) {
        for (Livro unidadePercorridaLivro : listaDelivros) {
            exibirLivro(unidadePercorridaLivro);
        }

    }

    //buscarLivroPorTitulo(List livros, String titulo):
    // recebe o título de um livro e retorna o livro correspondente da lista, ou null se não for encontrado.

    // Este é um método que busca livros com sua assinatura(ASSINATURA DO METODO)

    public List<Livro> buscarPorTitulo(List<Livro> listaDeLivros, String titulo) {
        // Lista para armazenar livros encontrados com o mesmo nome.
        List<Livro> livrosEncontrados = new ArrayList<>();

        // For each - Iterar sobre a lista de livros
        for (Livro unidadeDoLivro : listaDeLivros) {
            // Verificar se o titulo do livro é igual ao tiulo fornecido pelo usuario na assinatura do método.
            if (unidadeDoLivro.getTitulo().equals(titulo)) {
                // Adiciona o livro na lista de livros encontrados
                livrosEncontrados.add(unidadeDoLivro);
            }
        }

        if (livrosEncontrados.isEmpty()){
            return null;
        }else {
            return livrosEncontrados;
        }


    }
}
