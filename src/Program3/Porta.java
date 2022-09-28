package Program3;

class Porta {
    boolean aberta = false;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    boolean abre() {
        if ( this.aberta == false ) {
            return this.aberta = true;
        }
        else {

            return true;
        }
    }

    boolean fecha() {
        if ( this.aberta == true ) {
            return this.aberta = false;
        }
        else {

            return false;
        }
    }

    void sitPorta() {
        if ( this.aberta == true ) {
            System.out.println ( "aberta" );
        }
        else {
            System.out.println ( "fechada");
        }
    }

    void pinta(String c) {
        this.cor = c;
        System.out.println ( "A porta foi pintada de " + this.cor );
    }

    void tamanho( double x, double y, double z ) {
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }

    void mostra() {
        System.out.print( "A porta " + this.cor + " de tamanho: " + this.dimensaoX + "x" + this.dimensaoY + "x" + this.dimensaoZ + " Está " ); sitPorta();
    }
}