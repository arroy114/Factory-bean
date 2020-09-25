package wai.factorybean.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wai.factorybean.service.repository.ListRepository;

@Profile("pet")
@Service
public class ListServicePet implements ListService {

    private final ListRepository listRepository;

    public ListServicePet(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    @Override
    public String showList() {
        return listRepository.petList();
    }
}
