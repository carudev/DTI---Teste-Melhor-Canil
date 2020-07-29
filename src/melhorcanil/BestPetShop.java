
package melhorcanil;

import java.util.*;
import melhorcanil.*;
import java.util.Scanner;
//import static melhorcanil.GetDate.getDateforPrice;
//import float melhorcanil.PetShop.getLowestPrice;
//import  melhorcanil.PetShop.getLowestPrice;



public class BestPetShop {
    
    public static void main(String[] args) throws Exception {
        
        GetDate getDate = new GetDate();

        //Construindo os obejtos PetShop
        PetShop MeuCaninoFeliz = new PetShop ("Meu Canino Feliz", 48 , 24 , 40, 20, 2000);
        PetShop VaiRex = new PetShop("Vai Rex", 55, 20, 50, 15, 1700);
        PetShop ChowChawgas = new PetShop ("Chow Chawgas", 45, 30 , 45, 30, 800);
        
        
        //Entrada de Doguinhos
        Scanner read = new Scanner(System.in);
        System.out.println("*** Olá, vamos agendar sua visita ao pet! ***");
        System.out.println("* Primeiro, digite o número de cachorros de porte grande:");
        int nBigDogs = read.nextInt();
            
        System.out.println("* Agora, digite o número de cachorros de porte pequeno:");
        int nSmallDogs = read.nextInt();
        
        //Armazenando a função que pega a data e define se é dia da semana ou não.
        int date = getDate.getDateforPrice();
        
        //Recebendo os três preços possíveis
        GetDistance valueA = (MeuCaninoFeliz.getPrice(date, nBigDogs, nSmallDogs));
        GetDistance valueB = (VaiRex.getPrice(date, nBigDogs, nSmallDogs));;
        GetDistance valueC = (ChowChawgas.getPrice(date, nBigDogs, nSmallDogs));
        
        //Lista de Preços
        GetDistance[] listaPets = {valueA, valueB, valueC};
        
        Arrays.sort(listaPets);
        
        //Exibindo do menor pro maior os petshops!
        System.out.println("Eba!! :) Encontramos esses pets com menor preço na data escolhida! \n Caso o preço seja igual, eles estão ordenados pela menor distância:");
        for(int i = 0; i < listaPets.length; i++){
            System.out.println(i+1+"a posiçao:: Nome do PetShop: "+listaPets[i].namePetShop+ " |Preço para seus doguinhos: R$" + listaPets[i].price+" | Distancia: "+ listaPets[i].distance + "KM");
        }

}
        

        
}
    
    
 


            
      


