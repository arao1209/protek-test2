import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductionWorker extends Employee {

    private int shift;
    private double payRate;


    public ProductionWorker(int shift, double payRate) {
        this.shift = shift;
        this.payRate = payRate;
    }

    public ProductionWorker(String name, String number, String hireDate, int shift, double payRate) throws ParseException {
        super(name, number, hireDate);
        this.shift = shift;
        this.payRate = payRate;


    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {

        if(Boolean.TRUE.equals(verifyWorkday(shift))){
            this.shift = shift;
        }

    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    private Boolean verifyWorkday(int shift){

        if (shift == 1){
            System.out.println("Employee works at Day Shift");
            return Boolean.TRUE;
        }
        else if(shift == 2){
            System.out.println("Employee works at Night Shift");
            return Boolean.TRUE;
        }
        else{
            System.out.println("No such shift exists, it should be 1 or 2...");
            return Boolean.FALSE;
        }
    }
}
