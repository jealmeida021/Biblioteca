Você está desenvolvendo um sistema de gerenciamento de livros em Java para uma biblioteca. O sistema deve ser interativo, permitindo que o usuário realize diversas operações, como adição de novos livros, exibição da lista de livros, busca por título e saída do programa.

Requisitos:

Crie uma classe chamada Livro que contenha os seguintes atributos:

String titulo: o título do livro.
String autor: o autor do livro.
double pontuacao: a pontuação do livro.

Crie uma classe chamada ExercicioListaLivros que contenha os seguintes métodos:

exibirLivro(Livro livro): exibe os detalhes de um livro (título, autor, pontuação).
exibirLivros(List<Livro> livros): exibe os detalhes de todos os livros na lista.
buscarLivroPorTitulo(List<Livro> livros, String titulo): recebe o título de um livro e retorna o livro correspondente da lista, ou null se não for encontrado.

No método main, implemente um loop para exibir um menu de opções ao usuário. O menu deve incluir as seguintes opções:

1: Adicionar novo livro
2: Exibir lista de livros
3: Buscar livro por título
0: Sair do programa

Implemente a lógica para cada opção do menu.
Se o usuário escolher a opção 1, solicite os detalhes do novo livro (título, autor, pontuação) e adicione-o à lista.
Se o usuário escolher a opção 2, exiba a lista de livros.
Se o usuário escolher a opção 3, solicite o título do livro a ser buscado e exiba os detalhes se o livro for encontrado, ou uma mensagem informando que o livro não foi encontrado.
Se o usuário escolher a opção 0, encerre o programa.

Observações:

Utilize a interface List para armazenar os livros.
Os métodos de busca e remoção devem ser implementados considerando o título do livro.