package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto geetBeerById(UUID beerID) {

        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("KingFisher")
                .beerStyle("Fruit Beer")
                .upc("Non Alcoholic")
                .build();
    }
}
