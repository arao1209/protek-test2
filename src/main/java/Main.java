import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException {

       try{
           ProductionWorker productionWorker = new ProductionWorker("Aneri", "456-Z", "2022-11-03", 1, 1500.00);
       }
       catch (Exception e){
           System.err.println(e.getMessage());
       }

    }

}
