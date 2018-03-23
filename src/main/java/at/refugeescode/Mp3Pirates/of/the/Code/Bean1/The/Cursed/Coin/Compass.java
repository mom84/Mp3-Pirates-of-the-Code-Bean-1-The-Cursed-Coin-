package at.refugeescode.Mp3Pirates.of.the.Code.Bean1.The.Cursed.Coin;

import org.springframework.stereotype.Component;

@Component
public class Compass {

    private CursedCoin cursedCoin;


    public Compass(CursedCoin cursedCoin){
        this.cursedCoin=cursedCoin;
    }


    public String findCoin(){

        String coin = cursedCoin.CursedCoin();
        return coin;
    }
}
