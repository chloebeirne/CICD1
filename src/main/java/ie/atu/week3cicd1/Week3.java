package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Week3 {
  @GetMapping("/hello")
    public String getHello()
    {
        return "hello";
    }
    @GetMapping("/greet/{name}")
  public String getGreetByName(@PathVariable String name)
    {
      return "Hello" +name;
    }
    @GetMapping("/{details}")
  public String getDetails(@RequestParam String name, String details)
    {
      return "Name and Age" +name +details;
    }
}