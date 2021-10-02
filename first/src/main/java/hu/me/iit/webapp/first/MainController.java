
package hu.me.iit.webapp.first;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


    @GetMapping(path="/", produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseDto Gyoker() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(123);
        responseDto.setMessage("hello");
        return responseDto;
    }
}