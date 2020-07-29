package melhorcanil;

public class PetShop {
    
    public String name;
    public int priceWekeendBigDogs;
    public int priceWeekendSmallDogs;
    
    public int priceWeekBigDogs;
    public int priceWeekSmallDogs;
    
    public int distance;

    public String getName() {
        return name;
    }

    public int getPriceWekeendBigDogs() {
        return priceWekeendBigDogs;
    }

    public int getPriceWeekendSmallDogs() {
        return priceWeekendSmallDogs;
    }

    public int getPriceWeekBigDogs() {
        return priceWeekBigDogs;
    }

    public int getPriceWeekSmallDogs() {
        return priceWeekSmallDogs;
    }

    public int getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceWekeendBigDogs(int priceWekeendBigDogs) {
        this.priceWekeendBigDogs = priceWekeendBigDogs;
    }

    public void setPriceWeekendSmallDogs(int priceWeekendSmallDogs) {
        this.priceWeekendSmallDogs = priceWeekendSmallDogs;
    }

    public void setPriceWeekBigDogs(int priceWeekBigDogs) {
        this.priceWeekBigDogs = priceWeekBigDogs;
    }

    public void setPriceWeekSmallDogs(int priceWeekSmallDogs) {
        this.priceWeekSmallDogs = priceWeekSmallDogs;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    

    public PetShop(String nome, int priceWekeendBigDogs, int priceWeekendSmallDogs, int priceWeekBigDogs, int priceWeekSmallDogs, int distance) {
        this.name = nome;
        this.priceWekeendBigDogs = priceWekeendBigDogs;
        this.priceWeekendSmallDogs = priceWeekendSmallDogs;
        this.priceWeekBigDogs = priceWeekBigDogs;
        this.priceWeekSmallDogs = priceWeekSmallDogs;
        this.distance = distance;
    }
    
    
    //Soma Total de Preço de cada petshop
    public GetDistance getPrice(int weekDay, int nBigDogs, int nSmallDogs ){

        int price = 0;
            //weekDay = 1 = fds
            //weekDay = 2 = dia de semana

            if (weekDay == 1) {
                price = (nSmallDogs * this.priceWeekendSmallDogs  + nBigDogs * this.priceWekeendBigDogs); 
                //System.out.println("Para " + nSmallDogs + " cachorros de porte pequeno e " + nBigDogs + " cachorros de porte grande, no fim de semana o valor total é:" + price);
                
            }else if (weekDay == 2) {
                price = (nSmallDogs * this.priceWeekSmallDogs + nBigDogs * this.priceWeekBigDogs);
                //System.out.println("Para " + nSmallDogs + " cachorros de porte pequeno e " + nBigDogs + " cachorros de porte grande, em dia de semana o valor total é:" + price);
            }
            
          return new GetDistance(price, this.distance, this.name);
    }
};
    

            
            
