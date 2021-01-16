package be.exam.car.web;

import be.exam.car.service.CarService;
import be.exam.car.service.dto.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarResource {

    @Autowired
    private CarService carService;

    @PostMapping("/add-car")
    private void addCar(@RequestBody Car car){
        carService.addCar(car);
    }

    @GetMapping("/cars")
    private ResponseEntity<List<Car>> getAll(){
        List<Car> carList = carService.getAll();
        return new ResponseEntity<>(carList, HttpStatus.OK);
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getById(@PathVariable Long id){
        Car car = carService.getById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }
}
