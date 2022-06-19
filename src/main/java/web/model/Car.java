package web.model;

public class Car {
    private String carMark;
    private String carModel;
    private int prodYear;

    public String getCarMark() {
        return carMark;
    }

    public Car(String carMark, String carModel, int prodYear) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.prodYear = prodYear;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }
}
