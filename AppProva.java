package prova;

public class AppProva {
    public static void main(String[] args) {
        Disco d = new Disco("Disco Virtual", 100000); // nome do disco e espaço máximo
        d.listarDisco();
        d.novaPasta("Filmes", 2); // nome e quantidade de arquivos máximo
        Arquivo a1 = new Arquivo("Mulher maravilha 2.mp4", 2000); // nome e tamanho
        Arquivo a2 = new Arquivo();
        a2.setNome("Os 7 de Chicago");
        a2.setTamanho(2000);
        Arquivo a3 = new Arquivo("Bacurau.mp4", 1100);
        d.copiarArquivo("Filmes", a1); // pasta e arquivo
        d.copiarArquivo("Filmes", a2);
        d.copiarArquivo("Filmes", a2);
        d.copiarArquivo("Filmes", a3);

        Pasta p = new Pasta("Provas", 4);
        Arquivo[] provas = new Arquivo[3];
        provas[0] = new Arquivo("Prova POO.docx", 5);
        provas[1] = new Arquivo("Prova Auditoria.docx", 15);
        provas[2] = new Arquivo("Prova Engenharia Software.docx", 20);
        p.copiarArquivos(provas);
        p.listarPasta();
        d.novaPasta(p);
        d.listarPastas();
        p.listarArquivos();
        p.apagarArquivo("Segunda prova POO.docx");
        d.moverArquivo("Mulher Maravilha 2.mp4", "Provas"); // arquivo e pasta
        d.listarDisco();

        d.copiarPasta("Filmes", "Filmes Antigos");
        d.listarPasta("Filmes Velhos");
        d.listarPasta("Filmes Antigos");

        d.pegueiVirus();
        d.listarDisco();
    }
}
/*
Info: O disco Disco Virtual está vazio. Espaço livre 100000Mb
Erro: o arquivo Os 7 de Chicago já está na pasta Musicas
Erro: a pasta Musicas só pode armazenar dois arquivos
A pasta Provas contém 3 arquivos de um total de 4 possíveis
Pastas do Disco
  Filmes (2 arquivos)
  Provas (3 arquivos)
Pasta: Provas
  Prova POO.docx - 5Mb
  Prova Auditoria.docx - 15Mb
  Prova Engenharia Software.docx - 20Mb
  Total de arquivos: 3
  Espaço ocupado? 40Mb
Erro: O arquivo Segunda prova POO.docx não se encontra na pasta
Disco: Disco Virtual
Pasta: Filmes 
  Os 7 de Chicago.mp4 - 2000Mb
  Total de arquivos: 1
  Espaço ocupado? 2000Mb
Pasta: Provas
  Prova POO.docx - 5Mb
  Prova Auditoria.docx - 15Mb
  Prova Engenharia Software.docx - 20Mb
  Mulher Maravilha 2.mp4 - 2000
  Total de arquivos: 4
  Espaço ocupado? 2040Mb

Total de arquivos no disco - 5
Espaço total ocupado - 4040Mb
Espaço disponível no disco - 95960Mb
Erro: A pasta Filmes Velhos não existe
Pasta: Filmes Antigos
  Os 7 de Chicago.mp4 - 2000Mb
  Total de arquivos: 1
  Espaço ocupado? 2000Mb
Info: Apagando arquivos em 3, 2, 1 ...
Info: O disco está vazio porque pegou vírus. Você tirou backup?
*/