package wai.factorybean.service;

import wai.factorybean.service.repository.ListRepository;

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
