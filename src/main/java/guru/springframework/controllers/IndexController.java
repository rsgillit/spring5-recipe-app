package guru.springframework.controllers;

<<<<<<< HEAD
public class IndexController {
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        return "index";
    }
>>>>>>> 974ec3fffeac8907bde5b6f21f30ef6a699d5694
}
