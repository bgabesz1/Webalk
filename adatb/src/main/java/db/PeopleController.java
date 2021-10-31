package db;

import antlr.collections.List;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/People")
public class PeopleController {
    private final PeopleService peopleService;
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;

    }

    @GetMapping(path="")
     List<PeopleDto> getAllpeople(){
        return new ArrayList<>();
    }
}
