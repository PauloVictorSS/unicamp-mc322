/**
 * Classe CartaLacaio que tem um conjunto de atributos e os metodos get e set para
 * alterar e ler o valor deles
 */

package Lab2RA248438;

public class CartaLacaio{

    private int ID;
    private String nome;
    private int ataque;
    private int vidaAtual;
    private int vidaMaxima;
    private int custoMana;

    public CartaLacaio(int ID, String nome, int ataque, int vida, int custoMana){

        this.ID = ID;
        this.nome = nome;
        this.ataque = ataque;
        this.vidaAtual = vida;
        this.vidaMaxima = vida;
        this.custoMana = custoMana;
    }

    public CartaLacaio(int ID, String nome, int custoMana){

        this.ID = ID;
        this.nome = nome;
        this.custoMana = custoMana;
    }

    public CartaLacaio(CartaLacaio origem){

        this.ID = origem.ID;
        this.nome = origem.nome;
        this.ataque = origem.ataque;
        this.vidaAtual = origem.vidaAtual;
        this.vidaMaxima = origem.vidaMaxima;
        this.custoMana = origem.custoMana;
    }

    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    public String getNome(){
        return this.nome;
    }
    public void setINome(String nome){
        this.nome = nome;
    }

    public int getAtaque(){
        return this.ataque;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getVidaAtual(){
        return this.vidaAtual;
    }
    public void setVidaAtual(int vidaAtual){
        this.vidaAtual = vidaAtual;
    }

    public int getVidaMaxima(){
        return this.vidaMaxima;
    }
    public void setVidaMaxima(int vidaMaxima){
        this.vidaMaxima = vidaMaxima;
    }

    public int getCustoMana(){
        return this.custoMana;
    }
    public void setCustoMana(int custoMana){
        this.custoMana = custoMana;
    }

    public String toString(){

        String out = getNome() +" ( ID : "+ getID() +" )\n";
        out = out + "Ataque = "+ getAtaque() +"\n";
        out = out + "Vida Atual = "+ getVidaAtual() +"\n";
        out = out + "Vida Maxima = "+ getVidaMaxima() +"\n";
        out = out + "Custo de Mana = "+ getCustoMana() +"\n";

        return out ;
    }

    public void alteraNomeFortalecido(){
        this.nome += "Buffed";
    }

    public void buffar(int a){

        if(a > 0){
            this.ataque += a;
            this.vidaMaxima += a;

            this.alteraNomeFortalecido();
        }
    }

    public void buffar(int a, int v){

        if(a > 0 && v > 0){
            this.ataque += a;
            this.vidaMaxima += v;

            this.alteraNomeFortalecido();
        }
    }
}