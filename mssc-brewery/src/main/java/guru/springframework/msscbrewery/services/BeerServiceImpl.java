package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto geetBeerById(UUID beerID) {

        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("KingFisher")
                .beerStyle("ALE")
                .upc(1234567L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //to Do imp for update Beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting Beer ID:- {}",beerId);
    }
}
