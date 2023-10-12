package web.DAO;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "Black", 2007));
        cars.add(new Car("Audi", "White", 2011));
        cars.add(new Car("LADA", "Pink", 1998));
        cars.add(new Car("Dodge", "Yellow", 2018));
        cars.add(new Car("FIAT", "Gray", 2009));
    }
    @Override
    public List<Car> getCars(int count) {
        if(count == 0) {
            return cars;
        }
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
