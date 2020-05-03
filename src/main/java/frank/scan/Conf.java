package frank.scan;

import frank.ioc.Duck;
import frank.ioc.DuckShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Conf {

    @Bean
    public Duck duck3() {
        return new Duck("duck3333");
    }

    @Bean("duck4")
    public Duck duck444() {
        return new Duck("唐老鸭");
    }

    @Bean
    public DuckShop duckShop2( Duck duck5, Duck duck6) {
        DuckShop duckShop = new DuckShop();
        duckShop.setName("比特卤鸭店");
        List<Duck> ducks = new ArrayList<>();
        ducks.add(duck5);
        ducks.add(duck6);
        duckShop.setDucks(ducks);
        return duckShop;
    }
}
