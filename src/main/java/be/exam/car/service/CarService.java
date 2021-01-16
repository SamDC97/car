package be.exam.car.service;

import be.exam.car.domain.CarEntity;
import be.exam.car.domain.repository.CarRepository;
import be.exam.car.service.dto.Car;
import be.exam.car.service.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;

    public void addCar(Car car){
        carRepository.save(carMapper.toEntity(car));
    }

    public List<Car> getAll(){
        return StreamSupport.stream(carRepository.findAll().spliterator(), false)
                .map( c -> carMapper.toDTO(c))
                .collect(Collectors.toList());
    }

    public Car getById(Long id){
        Optional<CarEntity> optionalCarEntity = carRepository.findById(id);
        if (optionalCarEntity.isPresent()){
            return carMapper.toDTO(optionalCarEntity.get());
        }
        return null;
    }
}
