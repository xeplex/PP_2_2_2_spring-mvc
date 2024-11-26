package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Subaru", "Forester", 2014));
        carList.add(new Car("Toyota", "Noah", 2012));
        carList.add(new Car("Subaru", "Forester", 2003));
        carList.add(new Car("Toyota", "Corolla Fielder", 2002));
        carList.add(new Car("Mitsubishi", "Diamante", 1997));

        carList.add(new Car("Proverochnoe auto", "#1", 123456789));
        carList.add(new Car("Proverochnoe auto", "#2", 123456789));
        carList.add(new Car("Proverochnoe auto", "#3", 123456789));
        carList.add(new Car("Proverochnoe auto", "#4", 123456789));
        carList.add(new Car("Proverochnoe auto", "#5", 123456789));
        carList.add(new Car("Proverochnoe auto", "#6", 123456789));

    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
