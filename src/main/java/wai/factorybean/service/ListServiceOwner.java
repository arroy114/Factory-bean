package wai.factorybean.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wai.factorybean.service.repository.ListRepository;

@Profile({"owner", "default"})
@Primary
@Service
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
