package ee.kevin.webshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("tooted") // localhost:8080/tooted
    public String saaTooted() {
        return "Said tooted katte";
    }

    // iga muudatuse jarel tuleb teha backendile restart

    @GetMapping("prindi-logidesse") // localhost:8080/prindi-logidesse
    public String prindiLogidesse() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Logi nr " + i);
        }
        return "Logidesse edukalt prinditud";
    }

    @GetMapping("liida/{arv1}/{arv2}") // localhost:8080/liida/4/6
    public int liidaKokku(@PathVariable int arv1, @PathVariable int arv2 ) {
        return arv1 + arv2;
    }

    List<String> sonad = new ArrayList<>();
    // String[] sonad = [];

    @GetMapping("saa-sonad") // localhost:8080/saa-sonad
    public List<String> saaSonad() {
        return sonad;   // []
    }

    @GetMapping("lisa-sona/{sona}") // localhost:8080/lisa-sona/kevin   localhost:8080/lisa-sona/mihkel
    public List<String> lisaSonad(@PathVariable String sona) {
        sonad.add(sona);
        return sonad; // ["kevin", "mihkel"]
    }

    @GetMapping("saa-yks-sona/{index}") // localhost:8080/saa-yks-sona/1
    public String saaYksSona(@PathVariable int index) {
        return sonad.get(index);
    }

    // 404 -- sellist URLi ei ole
    // 400 -- muutujat ei osatud convertida     Bad Request
    // 403 -- forbidden, sa ei saa ligi
    // 401 need authentication, saad ligi kui autentitud
    // 500 - Server votab errori oma syyks
    // 4-ga algav -- sinu viga, 5-ga algav -- serveri viga

    @GetMapping("kustuta-yks-sona/{index}") // localhost:8080/kustuta-yks-sona/0
    public String kustutaSona(@PathVariable int index) {
        return sonad.remove(index);
    }

    @GetMapping("sonade-arv")  // localhost:8080/sonade-arv
    public int sonadeArv() {
        return sonad.size();
    }
}
