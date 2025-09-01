package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping("/Calculate")
    public String getCalculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        switch(operation){
            case "add":
                int answer = num1 + num2;
                return "{\"operation\": \""+ operation + "\", \"total\": " + answer +"}";

            case "subtraction":
                answer = num1 - num2;
                return "{\"operation\": \""+ operation + "\", \"total\": " + answer +"}";

            case "multiply":
                answer = num1 * num2;
                return "{\"operation\": \""+ operation + "\", \"total\": " + answer +"}";

            case "divide":
                if(num2 == 0){
                    return "Error: Math error";
                }
                answer = num1 / num2;
                return "{\"operation\": \""+ operation + "\", \"total\": " + answer +"}";
        }
        return operation;
    }


}
