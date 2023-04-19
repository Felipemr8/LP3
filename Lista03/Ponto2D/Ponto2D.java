public class Ponto2D{
    //As atribuições
    private float x, y;

    //Para a construção
    public Ponto2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    //Os metodos get
    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    //Para retornar true se o ponto está no eixo x
    public boolean isEixoX(){
        float x = getX(), y = getY();

        if(((x > 0) || (x < 0)) && (y == 0)){
            return true;
        }
        return false;
    }

    //Para retornar true se o ponto está no eixo y
    public boolean isEixoY(){
        float x = getX(), y = getY();

        if(((y > 0) || (y < 0)) && (x == 0)){
            return true;
        }
        return false;
    }

    //Para retornar true se o ponto está na origem
    public boolean isEixos(){
        if((getX() == 0) && (getY() == 0)){
            return true;
        }
        return false;
    }

    //Para retornar o quadrante em que o ponto está
    public int quadrante(){
        float x = getX(), y = getY();

        if(x == 0 && y == 0){
            return 0;
        }else if((x >= 0) && (y >= 0)){
            return 1;
        }else if((x <= 0) && (y >= 0)){
            return 2;
        }else if((x <= 0) && (y <= 0)){
            return 3;
        }else if((x >= 0) && (y <= 0)){
            return 4;
        }
        return -1;
    }

    public double distancia(Ponto2D p){
        double x = (double)p.getX(), y = (double)p.getY();

        return Math.sqrt(((x - 0) * (x- 0)) + ((y - 0) * (y - 0)));
    }
}
