package melhorcanil;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GetDate {
 
   @SuppressWarnings({ "resource" })
   
    public int getDateforPrice() throws Exception {

    Scanner input = new Scanner (System.in);
    
    //Recebendo o dia
    System.out.println("Agora, informe a data que deseja agendar! (Insira separadamente dia, mês e ano.)");
    System.out.println("Qual DIA deseja agendar sua ida ao petShop? (Somente dia)");
    int day1 = input.nextInt( );
    
    //Tratando erro de entrada (Dia não pode ser maior que 31)
     if (day1 > 31 ) {
         System.out.println("Eita, essa data é inválida!");
         throw new Exception("Data invalida");
    }

    //Recebe o mês
    System.out.println("Qual MÊS deseja agendar sua ida ao petShop?");
    int month = input.nextInt( );
    //Tratando erro de entrada
     if (month <= 06) {        
        System.out.println("Eita, esse mês já passou, agora só ano que vem! Vamos tentar de novo?!");
        throw new Exception("Data invalida");
    }

    //Recebe o ano
    System.out.println("E agora, por favor, o ano do seu agendamento!");
    int year = input.nextInt( );
    //Prevvine erros de entrada de data
    if (year > 2020 ) {
        System.out.println("Eita, ainda não é possível agendar datas para o próximo ano!");
        throw new Exception("Data invalida");
    } else if (year <= 2019 ){
        System.out.println("Eita, ainda não é possivel viajar no tempo! =D");
        throw new Exception("Data invalida");
    }
    
    Calendar c = new GregorianCalendar(day1, month, year);
    
    //Armazenando qual o dia da semana foi recebido na let day
    int day = c.get(Calendar.DAY_OF_WEEK);
    
    System.out.println("A data escolhida é:  " + String.format("%d/%d/%d",day1,month,year));
       
    //Sunday = 1
    //Saturday = 7

    int weekDay;
    
    //Verifica se a data inserida é fim de semana ou não
    if (day == Calendar.SUNDAY || day == Calendar.SATURDAY) {
        return weekDay = 1;
    } else {
        return weekDay = 2;
    }
    
    };   
};
