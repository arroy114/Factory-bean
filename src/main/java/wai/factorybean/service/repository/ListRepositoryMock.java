package wai.factorybean.service.repository;

import org.springframework.stereotype.Service;

@Service
public class ListRepositoryMock implements ListRepository {

    @Override
    public String ownerList() {
        return "Per, Kari, John";
    }

    @Override
    public String petList() {
        return "Puppy, Kitty, Nani";
    }
}
