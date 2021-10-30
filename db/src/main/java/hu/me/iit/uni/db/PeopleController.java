package hu.me.iit.uni.db;

import antlr.collections.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
