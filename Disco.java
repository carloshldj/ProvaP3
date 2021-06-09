package prova;


public class Disco{
    public String nomeDisco;
    public int tamanhoDisco;

    public Disco(String string, int i){
       this.nomeDisco = string;
       this.tamanhoDisco = i;

    }

    public void novaPasta(String string, int i){

    }

    public void copiarArquivo(String string, Arquivo a1){

    }

    public void novaPasta(Pasta p){

    }

    public void copiarArquivos(Pasta P, Arquivo[] provas){

    }

    public void listarPastas(){

    }

    public void moverArquivo(String string, String string2){

    }

    public void listarDisco(){
        if (tamanhoDisco == 100000){
            System.out.println("Info: O " + nomeDisco + " está vazio. Espaço livre " + tamanhoDisco + "Mb");
        }
        else{
            int tamanhoAtual = (100000 - tamanhoDisco);
            System.out.println("Espaço disponível no disco - " + tamanhoAtual + "Mb");
        }
        //Espaço total ocupado - 4040Mb
        //Espaço disponível no disco - 95960Mb
    }

    public void copiarPasta(String string, String string2){

    }

    public void listarPasta(String string){

    }

    public void pegueiVirus(){

    }

    
}