package Laboratorio1;

public class CartaMagia {

    private int ID;
    private String nome;
    private int dano;
    private boolean area;
    private int custoMana;

    public CartaMagia(int ID, String nome, int dano, int custoMana){

        this.ID = ID;
        this.nome = nome;
        this.dano = dano;
        this.custoMana = custoMana;
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

    public int getDano(){
        return this.dano;
    }
    public void setDano(int dano){
        this.dano = dano;
    }

    public boolean getArea(){
        return this.area;
    }
    public void setArea(boolean area){
        this.area = area;
    }

    public int getCustoMana(){
        return this.custoMana;
    }
    public void setCustoMana(int custoMana){
        this.custoMana = custoMana;
    }

    public String toString(){

        String out = getNome() +" ( ID : "+ getID() +" )\n";
        out = out + "dano = "+ getDano() +"\n";
        out = out + "area = "+ getArea() +"\n";
        out = out + "Custo de Mana = "+ getCustoMana() +"\n";

        return out ;
    }
}
