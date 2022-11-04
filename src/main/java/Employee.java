import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Employee {

    private String name;
    private String number;
    private Date hireDate;

    private static final char a = 'A';
    private static final int ASCII_VALUE_OF_A = (int)a;
    private static final char m = 'M';
    private static final int ASCII_VALUE_OF_M = (int)m;
    private static final String DATE_PATTERN = "YYYY-MM-DD";


    public Employee() {
    }

    private Date convertStringToDate(String date) throws ParseException {

        return new SimpleDateFormat(DATE_PATTERN).parse(date);

    }

    public Employee(String name, String number, String hireDate) throws ParseException {
        this.name = name;

        setNumber(number);

        this.hireDate = convertStringToDate(hireDate);
    }

    private Boolean verifyEmployeeNumber(String number){

        Boolean flag = Boolean.FALSE;

        if(number.contains("-")){

            String[] splitNumber = number.split("-");

            System.out.println(Arrays.toString(splitNumber));

            if(splitNumber[0].length() == 3 && splitNumber[1].length()==1){

                try {

                    Integer.parseInt(splitNumber[0]);

                    int lastValue = splitNumber[1].charAt(0);
                    System.out.println(lastValue);

                    if (lastValue >= ASCII_VALUE_OF_A && lastValue <= ASCII_VALUE_OF_M) {

                        flag = Boolean.TRUE;

                        System.out.println("Valid number format...");

                    }
                }catch (Exception e){
                    System.out.println(e.getMessage()+Integer.parseInt(splitNumber[0]));
                }

            }
            else{
                System.out.println("Not a valid number format...");
            }
        }

        return flag;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws UnsupportedNumberFormatException{


        if (Boolean.TRUE.equals(verifyEmployeeNumber(number))){
            this.number = number;
        }
        else{
            throw new UnsupportedNumberFormatException("Not A Valid Employee Number Format...It should be in 'XXX-L' format, XXX should be in (0-9) and L should be [A-M]: "+number);
        }

    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

}

