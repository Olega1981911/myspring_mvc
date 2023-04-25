package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MyController {
    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int number, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Kia", "Sportage SUV 4gen", 2020));
        cars.add(new Car("Mercedes-Benz", "GLC Coupe C253 4MATIC", 2021));
        cars.add(new Car("Toyota", "Tundra TRD Pro CrewMax", 2021));
        cars.add(new Car("Hyundai", "i20 2gen", 2019));
        cars.add(new Car("BMW", "2 Gran Coupe F44 FWD", 2022));
        cars = CarService.carCount(cars,number);
        model.addAttribute("cars",cars);
        return "cars";
    }
}
