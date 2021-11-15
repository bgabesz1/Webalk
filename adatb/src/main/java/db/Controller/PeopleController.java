package db.Controller;

import db.repository.PeopleModle;
import db.service.PeopleService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/People")
public class PeopleController {
    private final PeopleService peopleService;
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;

    }


    @GetMapping(path="")
    public Iterable<PeopleDto> getAllPeople(){
        List<PeopleDto> peopleDtoList = new ArrayList<>();
        for(PeopleModle people : peopleService.getAllPeople()){
            peopleDtoList.add(new PeopleDto(people));
        }
        return peopleDtoList;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        peopleService.delete(id);
    }

    @GetMapping("/{id}")
    public PeopleDto getById(@PathVariable("id") Long id){
        return new PeopleDto(peopleService.getById(id));

    }
    @PutMapping
    void save(@RequestBody @Valid PeopleDto peopleDto){
        peopleService.save(PeopleDto.toPeople());
    }
    @GetMapping
    void findAdultPeople(@RequestParam("age") int age){
        List<PeopleDto> peopleDtoList = new ArrayList<>();
        for(PeopleModle people : peopleService.findByAgeGreaterThan(age);{
            peopleDtoList.add(new PeopleDto(people));
        }
        return peopleDtoList;
    }
}
