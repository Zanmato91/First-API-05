package co.develhope.FirstAPI05.Controller;

import co.develhope.FirstAPI05.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

//a CarController that:
//is mapped on cars
//on a GET request returns a new Car as response
//on a POST request prints the Car body in console and returns an HTTP Created success message to the user
//takes care of the request body validation
@RestController
@RequestMapping("/cars")
public class CarController {
@GetMapping("")
public String getCar(){
return new CarDTO("ford_cmax", "Monovolume", 16000.00).toString();
}
@PostMapping("")
    public void postCar(@Valid @RequestBody CarDTO car, HttpServletResponse response){
    System.out.println("Posted car:" + car.toString());
    response.setStatus(201);
}
//
//    @PostMapping("")
//    public void postCar(@Valid @RequestBody CarDTO car, HttpServletResponse response){
//        System.out.println("Posted car: " + car.toString());
//        response.setStatus(201);
//    }
}
