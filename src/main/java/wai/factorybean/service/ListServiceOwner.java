package wai.factorybean.service;

import wai.factorybean.service.repository.ListRepository;

public class ListServiceOwner implements ListService {

    private final ListRepository listRepository;

    public ListServiceOwner(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    @Override
    public String showList() {
        return listRepository.ownerList();
    }
}
