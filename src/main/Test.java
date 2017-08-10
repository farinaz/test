package main;

import org.primefaces.event.*;


import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nanaz on 7/27/2015.
 */
@ManagedBean(name ="test")
@ViewScoped
@SessionScoped
public class Test implements Serializable {
    private List<Car> cars1;
    private List<Car> cars2;
    private List<Car> cars3;
    private List<Car> cars4;
    private List<Car> cars5;
    private List<Car> cars6;
    private Car selectedCar;
    private List<Car> selectedCars;

    @ManagedProperty("#{careService}")
    private CarService service;

    @PostConstruct
    public void init() {
        cars1 = service.createCars(30);
        cars2 = service.createCars(10);
        cars3 = service.createCars(10);
        cars4 = service.createCars(10);
        cars5 = service.createCars(10);
        cars6 = service.createCars(10);
    }

    public List<Car> getCars1() {
        return cars1;
    }

    public List<Car> getCars2() {
        return cars2;
    }

    public List<Car> getCars3() {
        return cars3;
    }

    public List<Car> getCars4() {
        return cars4;
    }

    public List<Car> getCars5() {
        return cars5;
    }

    public List<Car> getCars6() {
        return cars6;
    }

    public void setService(CarService service) {
        this.service = service;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public List<Car> getSelectedCars() {
        return selectedCars;
    }

    public void setSelectedCars(List<Car> selectedCars) {
        this.selectedCars = selectedCars;
    }

    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getRandomId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Car Unselected", ((Car) event.getObject()).getRandomId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


}