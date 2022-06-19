package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private final List<Car> cars = new ArrayList<>();

    public CarDAO() {
        cars.add(new Car("BMW", "X6",2020));
        cars.add(new Car("Mercedes Benz", "S-Class",2021));
        cars.add(new Car("Jaguar", "XJ",2018));
        cars.add(new Car("Porsche", "911",2010));
        cars.add(new Car("Toyota", "Land Cruiser 300",2021));
    }

    public List<Car> getCars() {
        return cars;
    }




}
