/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rohan
 */
public class UberDirectory {
    //private static UberDirectory carLists;
    private ArrayList<Uber> carList;
    private ArrayList<Uber> carSearchList;
    public UberDirectory() {
        
        this.carList = new ArrayList<>();
        
        Uber car1 = new Uber("A","C", "Ferrari", 2019, 1, 2, 1,"Red One", "Boston",false ,true);
        Uber car2 = new Uber("A","X", "BMW", 2019, 1, 4, 2, "X1", "New York", true ,true);
        Uber car3 = new Uber("A","a", "Toyota", 2018, 1, 4, 3, "T1", "Boston", false ,true);
        Uber car4 = new Uber("a","o", "GM", 2018, 1, 4, 4, "G1", "New York", true ,true);
        Uber car5 = new Uber("A","o", "Toyota", 2017, 1, 4, 5, "T2", "Chicago", false ,true);
        Uber car6 = new Uber("a","o", "GM", 2017, 1, 4, 6, "G2", "Chicago", true ,true);
        Uber car7 = new Uber("A","t", "Ferrari", 2016, 1, 4, 7, "G3", "Seattle", false ,false);
        Uber car8 = new Uber("B","o", "BMW", 2016, 1, 4, 8, "X2", "Seattle", false ,false);
        Uber car9 = new Uber("C","p", "Toyota", 2019, 1, 4, 9, "T3", "Austin", true ,true);
        Uber car10 = new Uber("X","r", "GM", 2019, 1, 4, 10, "G3", "Austin", false ,true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
    }
    
    public ArrayList<Uber> getCarList() {
        //carLists = new UberDirectory();
        return carList;
    }
    /*
    public ArrayList<Uber> getCarList() {
        return carList;
    }
*/
    public void setCarList(ArrayList<Uber> carList) {
        this.carList = carList;
    }
        
    
    public Uber addCar(){
        Uber uber = new Uber();
        carList.add(uber);
        return uber;
    }
    
    public void deleteCar(Uber uber){
        carList.remove(uber);
    }
    public ArrayList<Uber> searchCertificate(ArrayList<Uber> a)
    {
        carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.isCarMaintenanceCertificate() == false)
            {
                carSearchList.add(uber);
            }
        }
        return carSearchList;
    } 
    
    public ArrayList<Uber> searchBrandName(String carBrandName, ArrayList<Uber> a){
        ArrayList<Uber> b = a;
        carSearchList = new ArrayList<Uber>();
        for(Uber uber : b){
            if(uber.getCarBrand().equalsIgnoreCase(carBrandName)){
                carSearchList.add(uber);
            }
        }
    return carSearchList;
    }
    
    
    public ArrayList<Uber> searchCarCity(String carCityName, ArrayList<Uber> a){
        carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.getCarAvailableCity().equalsIgnoreCase(carCityName)){
                carSearchList.add(uber);
            }
        }
    return carSearchList;
    }

    public ArrayList<Uber> searchCarYear(String carYearSearch,ArrayList<Uber> a) {
        //To change body of generated methods, choose Tools | Templates.
        
        carSearchList = new ArrayList<Uber>();
        ArrayList<Uber> b = a;
        for(Uber uber : b){
            if(uber.getCarManufacYear() == Integer.parseInt(carYearSearch)){
                carSearchList.add(uber);
            }
        }
    return carSearchList;
    }

    public ArrayList<Uber> searchCarSerialNum(String carSerialNum, ArrayList<Uber> a) {
         //To change body of generated methods, choose Tools | Templates.
         carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.getCarSerialNum() == Integer.parseInt(carSerialNum)){
                carSearchList.add(uber);
            }
        }
    return carSearchList;
    }

    public ArrayList<Uber> searchCarModelNum(String carModelNum,ArrayList<Uber> a) {
         //To change body of generated methods, choose Tools | Templates.
         carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.getCarModelNum().equalsIgnoreCase(carModelNum)){
                carSearchList.add(uber);
            }
        }
    return carSearchList;
    }

    public ArrayList<Uber> searchAvailability(ArrayList<Uber> a) {
         
         carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.isCarAvailability() == true)
            {
                carSearchList.add(uber);
                
            }
        }
        return carSearchList;
    }

    public ArrayList<Uber> searchNonAvailability(ArrayList<Uber> a) {
         
         carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.isCarAvailability() == false)
            {
                carSearchList.add(uber);
            }
        }
        return carSearchList;
    }

    public ArrayList<Uber> searchFirstAvailableCar(ArrayList<Uber> a) {
         
         carSearchList = new ArrayList<Uber>();
        for(Uber uber : a){
            if(uber.isCarAvailability()== true)
            {
                carSearchList.add(uber);
                break;
            }
        }
        return carSearchList;
    }
/*
    public ArrayList<String> searchManufacturerList() {
        carSearchList = new ArrayList<Uber>();
        ArrayList<String> ar = new ArrayList<String>();
        for(Uber uber : carList){
                
            String i =  uber.getCarManufacturer();
           ar.add(i);
                  
        }
        return ar;
    } 
*/    

    public ArrayList<Uber> getMinMax(int max, int min,ArrayList<Uber> a ) {
        carSearchList = new ArrayList<Uber>();
        
        for(Uber uber: a){
            if(uber.getCarMaxSeats() <= max && uber.getCarMinSeats()>= min ){
                carSearchList.add(uber);
            }
        } 
        return carSearchList;
    }
    
    }

  

