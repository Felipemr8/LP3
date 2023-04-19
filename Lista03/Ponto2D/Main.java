public  class  Principal {
    public  static  void  principal ( String [] args ){
        Ponto2D  p = novo  Ponto2D ( 0 , 1 );

        Sistema . fora . println ( p . isEixoX ());
        Sistema . fora . println ( p . isEixoY ());
        Sistema . fora . println ( p . isEixos ());
        Sistema . fora . println ( p . quadrante ());
        Sistema . fora . println ( p . distancia ( p ));
    }
}
