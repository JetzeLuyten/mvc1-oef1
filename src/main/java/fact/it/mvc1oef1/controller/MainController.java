package fact.it.mvc1oef1.controller;

import fact.it.mvc1oef1.model.Activiteit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MainController {
    @RequestMapping("/maatregelen.html")
    public String maatregelen(){
        return "maatregelen";
    }

    @RequestMapping("/activiteiten.html")
    public String activiteiten(Model model){
        ArrayList<Activiteit> activiteiten = new ArrayList<>();
        activiteiten.add(new Activiteit("Koekjes bakken", "maandag"));
        activiteiten.add(new Activiteit("Opruimen", "dinsdag"));
        activiteiten.add(new Activiteit("Carwash", "woensdag"));
        activiteiten.add(new Activiteit("Verkleedpartijtje", "donderdag"));
        activiteiten.add(new Activiteit("Lezen/voorlezen", "vrijdag"));
        activiteiten.add(new Activiteit("Vlaamse kermis", "zaterdag"));
        activiteiten.add(new Activiteit("Wandelen/Fietsen", "zondag"));
        model.addAttribute("activiteit", activiteiten.get(3));
        return "activiteiten";
    }

}
