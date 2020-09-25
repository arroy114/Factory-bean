package wai.factorybean.controllers;

import org.springframework.stereotype.Controller;
import wai.factorybean.service.ListService;

@Controller
public class ListController {

    private final ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    public String getList(){
        return listService.showList();
    }


}
