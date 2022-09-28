package Program2;
// Criar uma porta, abra-a e feche-a, pinte de várias cores e altere suas dimensões, no fim mostre se a porta está aberta
// Atributos: aberta, cor, dimensões X, Y e Z
// Métodos void: abre, fecha e pinta(String s)
// Método: boolean estaAberta (verifica se a porta está aberta ou fechada)
// Grupo: Thalys Henrique e Levi Oliveira
// Matéria: Programação Orientada a Objetos

public class Porta {
    private boolean aberta = false;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        System.out.print(", dimensão X: " + dimensaoX);
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        System.out.print(", dimensão Y: " + dimensaoY);
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        System.out.print(", dimensão Z: " + dimensaoZ);
    }

    public void abre() {
        this.aberta = true;
        System.out.printf(" Abrir porta! %n ");
    }

    public void fecha() {
        this.aberta = false;
        System.out.printf(" Fechar porta! %n ");
    }

    public void pinta(String s) {
        this.cor = s;
        System.out.printf("A porta foi pintada da cor: " + s);
    }

    public boolean estaAberta(){
        if(this.aberta){
            System.out.printf(", a porta está aberta! %n");
            return true;
        }
        System.out.printf(", a porta está fechada! %n");
        return false;
    }
}

