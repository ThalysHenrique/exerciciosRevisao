package Program3;

class TestaCasa{
    public static void main( String[] args ){
        Casa c1 = new Casa();
        c1.porta1 = new Porta();
        c1.porta2 = new Porta();
        c1.porta3 = new Porta();

        c1.porta1.fecha();
        c1.porta1.pinta( "verde" );
        c1.porta1.dimensaoX = 1.80;
        c1.porta1.dimensaoY = 0.80;
        c1.porta1.dimensaoZ = 0.04;
        c1.porta1.mostra();

        c1.porta2.abre();
        c1.porta2.pinta( "azul" );
        c1.porta2.dimensaoX = 2.10;
        c1.porta2.dimensaoY = 0.90;
        c1.porta2.dimensaoZ = 0.05;
        c1.porta2.mostra();

        c1.porta3.abre();
        c1.porta3.pinta( "amarela" );
        c1.porta3.dimensaoX = 2.00;
        c1.porta3.dimensaoY = 0.85;
        c1.porta3.dimensaoZ = 0.03;
        c1.porta3.mostra();

        c1.pinta( "Branca" );

        c1.mostrar();


    }
}