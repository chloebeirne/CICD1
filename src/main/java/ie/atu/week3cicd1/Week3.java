package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week3 {
  @GetMapping("/message")
    public String getMessage()
    {
        return "Some message";
    }
    @GetMapping("/details")
  public String getDetails()
    {
      return "Some other message";
    }
}
