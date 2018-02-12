
package sample;
import org.springframework.http.MediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
//@RestController
@SpringBootApplication
public class Sample
{
    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "Go to <a href='/SimpleHttp/speedtest'>/SimpleHttp/speedtest</a>";
    }

    static public void main(String[] args) throws Exception
    {
        SpringApplication.run(Sample.class, args);
    }
}
