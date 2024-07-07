public class Employee extends Person { // inherit from person class

    //variables
    private int id;
    private double hourlyPay;

    // constructor
    public Employee() {
        super("Williams", "Chukwuma", 6.0);
        id = 100237;
        hourlyPay = 35.00;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    //method to get raise
    public double getRaise() {
        this.hourlyPay *= 1.15;
        return this.hourlyPay;
    }

    //method to calculate overtime
    public double payDay(double hoursWorked){

        double totalPay;
        if (hoursWorked > 40){
            double overtimeHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
        }else {
            totalPay = hourlyPay * hoursWorked;
        }
        return totalPay;
    }

    @Override
    public String toString(){
        return
                super.toString() +
                        "Hourly Pay Rate $" + hourlyPay + "\n" +
                        "Employee ID " + id + "\n";

    }

}