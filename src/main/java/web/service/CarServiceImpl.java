package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;
import java.util.List;

@Component
public class CarService {
    private final CarDAO carDAO;
    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCountedCars(int count) {
        List<Car> cars = carDAO.getCars();
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
