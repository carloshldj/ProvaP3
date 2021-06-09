package prova;

public class Arquivo {
    
    public String nomeArquivo;
    public int tamanhoArquivo;
    

    public Arquivo(String string, int i){
        this.nomeArquivo = string;
        this.tamanhoArquivo = i;
    }
    
    public Arquivo(){

    }
    public void setNome(String string){
        this.nomeArquivo = string;

    }
    public void setTamanho(int i){
        this.tamanhoArquivo = i;
    }
}