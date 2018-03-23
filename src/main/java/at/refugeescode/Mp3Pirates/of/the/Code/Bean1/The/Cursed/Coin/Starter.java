package at.refugeescode.Mp3Pirates.of.the.Code.Bean1.The.Cursed.Coin;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {

    @Bean
    ApplicationRunner applicationRunner(JackSparrow jackSparrow){
        return args -> {
            String coin = jackSparrow.findCoin();
            System.out.println(coin);
        };
    }
}
