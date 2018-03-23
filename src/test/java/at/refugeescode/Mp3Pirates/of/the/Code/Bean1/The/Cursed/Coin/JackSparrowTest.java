package at.refugeescode.Mp3Pirates.of.the.Code.Bean1.The.Cursed.Coin;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackSparrowTest {

    @Autowired
    private JackSparrow jackSparrow;

    @Test
    void findCoin() {
        String coin = jackSparrow.findCoin();
        assertEquals("CursedCoin",coin);
    }
}