package co.develhope.FirstAPI05.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    @NotBlank(message = "It can't be blank!")
    private String id;
    @NotBlank(message = "It can't be blank!")
    private String modelName;
    private double price;
    public void getCar(String id, String modelName, double price){
        this.id=id;
        this.modelName=modelName;
        this.price=price;
    }
    public void getCar(){
    }
}
