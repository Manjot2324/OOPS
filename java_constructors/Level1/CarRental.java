import java.util.*;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * 50.0; 
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    @Override
    public String toString() {
        return "CarRental[Customer=" + customerName + ", CarModel=" + carModel + ", RentalDays=" + rentalDays + ", TotalCost=" + calculateTotalCost() + "]";
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Bob", "Toyota Camry", 5);
        System.out.println(rental);
    }
}
