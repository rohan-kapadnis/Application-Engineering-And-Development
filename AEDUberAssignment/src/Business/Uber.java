/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rohan
 */
public class Uber {
    private String carName;
    private String carManufacturer;
    private boolean carAvailability;
    private String carBrand;
    private int carManufacYear;
    private int carMinSeats;
    private int carMaxSeats;
    private int carSerialNum;
    private String carModelNum;
    private String carAvailableCity;
    private boolean carMaintenanceCertificate;

    public Uber(String carName, String carBrand, String carManufacturer, int carManufacYear, int carMinSeats, int carMaxSeats, int carSerialNum, String carModelNum, String carAvailableCity, boolean carAvailability ,boolean carMaintenanceCertificate) {
        this.carName = carName;
        this.carManufacturer = carManufacturer;
        this.carAvailability = carAvailability;
        this.carBrand = carBrand;
        this.carManufacYear = carManufacYear;
        this.carMinSeats = carMinSeats;
        this.carMaxSeats = carMaxSeats;
        this.carSerialNum = carSerialNum;
        this.carModelNum = carModelNum;
        this.carAvailableCity = carAvailableCity;
        this.carMaintenanceCertificate = carMaintenanceCertificate;
    }

    Uber() {
       
    }
   
    
    
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public boolean isCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(boolean carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarManufacYear() {
        return carManufacYear;
    }

    public void setCarManufacYear(int carManufacYear) {
        this.carManufacYear = carManufacYear;
    }

    public int getCarMinSeats() {
        return carMinSeats;
    }

    public void setCarMinSeats(int carMinSeats) {
        this.carMinSeats = carMinSeats;
    }

    public int getCarMaxSeats() {
        return carMaxSeats;
    }

    public void setCarMaxSeats(int carMaxSeats) {
        this.carMaxSeats = carMaxSeats;
    }

    public int getCarSerialNum() {
        return carSerialNum;
    }

    public void setCarSerialNum(int carSerialNum) {
        this.carSerialNum = carSerialNum;
    }

    public String getCarModelNum() {
        return carModelNum;
    }

    public void setCarModelNum(String carModelNum) {
        this.carModelNum = carModelNum;
    }

    public String getCarAvailableCity() {
        return carAvailableCity;
    }

    public void setCarAvailableCity(String carAvailableCity) {
        this.carAvailableCity = carAvailableCity;
    }

    public boolean isCarMaintenanceCertificate() {
        return carMaintenanceCertificate;
    }

    public void setCarMaintenanceCertificate(boolean carMaintenanceCertificate) {
        this.carMaintenanceCertificate = carMaintenanceCertificate;
    }
    @Override
    public String toString(){
       return carName;
    }
    
}

