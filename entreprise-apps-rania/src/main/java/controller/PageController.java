package be.ehb.entreprise_apps_rania;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/new")
    public String newPage() {
        return "new";
    }

    @GetMapping("/details")
    public String details() {
        return "details";
    }
}