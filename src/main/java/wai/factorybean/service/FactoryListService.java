package wai.factorybean.service;

import wai.factorybean.service.repository.ListRepository;

public class FactoryListService {

    private final ListRepository listRepository;

    public FactoryListService(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    public ListService createListService(String type){

        switch (type){
            case "pet":
                return new ListServicePet(listRepository);
            case "owner":
            default:
                return  new ListServiceOwner(listRepository);
        }

    }
}
