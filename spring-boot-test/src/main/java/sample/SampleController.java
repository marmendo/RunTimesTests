package sample;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
    @RequestMapping("/SimpleHttp/speedtest")
    public String sample() {
        return "SpringBoot: Time on the server is " + java.time.LocalDateTime.now();
    }
}
