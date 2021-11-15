package db.service;

public class NoSuchEntityExceotion extends RuntimeException {
    private Long id;

    public Long getId() {
        return id;
    }

    public NoSuchEntityExceotion(Long id) {
        super(String.format("No such entity", id));
    this.id=id;
    }


}
