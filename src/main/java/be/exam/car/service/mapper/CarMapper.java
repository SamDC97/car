package be.exam.car.service.mapper;

import be.exam.car.domain.CarEntity;
import be.exam.car.service.dto.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarEntity toEntity(Car car){
        return new CarEntity(car.getId(), car.getName(), car.getEngine());
    }

    public Car toDTO(CarEntity carEntity){
        return new Car(carEntity.getId(), carEntity.getName(), carEntity.getEngine());
    }
}
