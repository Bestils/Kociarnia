package kobietydokodu.koty.kontroler;

import kobietydokodu.koty.KotDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class KotyKontroler {
    @Autowired
    private KotDAO kotDao;
}
