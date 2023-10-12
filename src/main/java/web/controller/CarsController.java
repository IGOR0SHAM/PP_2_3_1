package web.controller;

import web.DAO.CarDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CarsController {
    private final CarDAOImpl carDAOImpl;

    public CarsController(CarDAOImpl carDAOImpl) {
        this.carDAOImpl = carDAOImpl;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carDAOImpl.getCars(count));
        return "cars";
    }
}
