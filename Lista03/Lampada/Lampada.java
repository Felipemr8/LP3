public class Lampada{
    private double potencyWatts;
    private String color;
    private String manufacturer;
    private double voltage;
    private double value;
    private int quantityInStock;
    private int quantityPurchase;

    public Lampada(double potencyWatts, String color, String manufacturer, double voltage, double value, int quantityInStock, int quantityPurchase){
        setPotencyWatts(potencyWatts);
        setColor(color);
        setManufacturer(manufacturer);
        setVoltage(voltage);
        setValue(value);
        setQuantityInStock(quantityInStock);
        setQuantityPurchase(quantityPurchase);
        this.potencyWatts = potencyWatts;
        this.color = color;
        this.manufacturer = manufacturer;
        this.voltage = voltage;
        this.value = value;
        this.quantityInStock = quantityInStock;
        this.quantityPurchase = quantityPurchase;
    }

    public Lampada(){
        this.potencyWatts = 0;
        this.color = null;
        this.manufacturer = null;
        this.voltage = 0;
        this.value = 0;
        this.quantityInStock = 0;
        this.quantityPurchase = 0;
    }

    //Para retornar a potencia
    public double getPotencyWatts(){
        return this.potencyWatts;
    }

    //Para retornar a cor
    public String getColor(){
        return this.color;
    }

    //Para retornar o fabricante
    public String getManufacturer(){
        return this.manufacturer;
    }

    //Para retornar a voltagem
    public double getVoltage(){
        return this.voltage;
    }

    //Para retornar o valor
    public double getValue(){
        return this.value;
    }

    //Para retornar a quantidade em estoque
    public int getQuantityInStock(){
        return this.quantityInStock;
    }

    //Para retornar a quantidade da compra
    public int getQuantityPurchase(){
        return this.quantityPurchase;
    }

    //Para definir a potencia
    public void setPotencyWatts(double potencyWatts){
        if(potencyWatts < 0){
            System.out.printf("Error in setPotencyWatts, invalid potency!!\n");
            System.exit(-1);
        }
        this.potencyWatts = potencyWatts;
    }

    //Para definir a cor
    public void setColor(String color){
        this.color = color;
    }

    //Para definir o fabricante
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    //Para definir a voltagem
    public void setVoltage(double voltage){
        if(voltage < 0){
            System.out.printf("Error in setVoltage, invalid voltage!!\n");
            System.exit(-1);
        }
        this.voltage = voltage;
    }

    //Para definir o valor
    public void setValue(double value){
        if(value < 0){
            System.out.printf("Error in setValue, invalid value!!\n");
            System.exit(-1);
        }
        this.value = value;
    }

    //Para definir a quantidade do estoque
    public void setQuantityInStock(int quantityInStock){
        if(quantityInStock < 0){
            System.out.printf("Error in setQuantityInStock, invalid quantity!!\n");
            System.exit(-1);
        }
        this.quantityInStock = quantityInStock;
    }

    //Para definir a quantidade da compra
    public void setQuantityPurchase(int quantityPurchase){
        if(quantityPurchase < 1){
            System.out.printf("Error in setQuantityPurchase, invalid quantity!!\n\n");
            System.exit(-1);
        }
        this.quantityPurchase = quantityPurchase;
    }

    //Para fazer a venda
    public void makeSale(int buyQuantity){
        setQuantityPurchase(buyQuantity);
        this.quantityInStock = this.quantityInStock - this.quantityPurchase;
    }

    //Imprime as informações da venda
    public void printPurchase(){
        System.out.printf("PURCHASE:\n");
        System.out.printf("MANUFACTURER: %s\n", getManufacturer());
        System.out.printf("COLOR: %s\n", getColor());
        System.out.printf("POTENCY: %f\n", getPotencyWatts());
        System.out.printf("VOLTAGE: %f\n", getVoltage());
        System.out.printf("QUANTITY: %d\n", getQuantityPurchase());
        System.out.printf("UNIT VALUE: %f\n", getValue());
        System.out.printf("VALUE: R$ %f\n", getValue() * this.quantityPurchase);
        System.out.printf("SUCCESSFUL PURCHASE!!!!\n");
    }
}
