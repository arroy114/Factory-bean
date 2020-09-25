package wai.factorybean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import wai.factorybean.service.FactoryListService;
import wai.factorybean.service.ListService;
import wai.factorybean.service.repository.ListRepository;

@Configuration
public class ListServiceConfig {

    @Bean
    FactoryListService factoryListService(ListRepository listRepository){
        return new FactoryListService(listRepository);
    }

    @Bean
    @Primary
    @Profile({"owner", "default"})
    ListService listServiceOwner(FactoryListService factoryListService){
        return factoryListService.createListService("owner");
    }

    @Bean
    @Profile("pet")
    ListService listServicePet(FactoryListService factoryListService){
        return factoryListService.createListService("pet");
    }

}
