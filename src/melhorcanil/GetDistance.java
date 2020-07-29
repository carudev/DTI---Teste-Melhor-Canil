
package melhorcanil;


public class GetDistance implements Comparable<GetDistance> {
    
    int price;
    int distance;
    String namePetShop;

    public int getPrice() {
        return price;
    }

    public int getDistance() {
        return distance;
    }

    public String getNamePetShop() {
        return namePetShop;
    }
    
    

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setNamePetShop(String namePetShop) {
        this.namePetShop = namePetShop;
    }

    public GetDistance(int price, int distance, String namePetShop) {
        this.price = price;
        this.distance = distance;
        this.namePetShop = namePetShop;
    }

    //Compara pelo preço, caso os preços sejam diferentes retorna o menor, caso sejam iguais retorna a comparação da distancia
    @Override
    public int compareTo(GetDistance t) {
        if (this.price != t.getPrice()) {  //Compara preço
            return this.price - t.getPrice(); //Retorna o menor
        }
        return Integer.compare(this.distance, t.getDistance()); //Compara pela distância
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
};
