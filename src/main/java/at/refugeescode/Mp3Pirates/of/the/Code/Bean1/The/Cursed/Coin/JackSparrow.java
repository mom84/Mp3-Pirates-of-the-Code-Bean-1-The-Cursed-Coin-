package at.refugeescode.Mp3Pirates.of.the.Code.Bean1.The.Cursed.Coin;


import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    private Compass compass;

    public JackSparrow(Compass compass){
        this.compass = compass;
    }

    public String findCoin(){
        return compass.findCoin();
    }

}
