package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaptopsController {

	@GetMapping("/laptops.jsp")
    public String afisareBrandLaptop(@RequestParam String brand, Model model) {
        int nc = brand.length();
        String par = nc % 2 == 0 ? "par" : "impar";
        model.addAttribute("brand", brand);
        model.addAttribute("nc", nc);
        model.addAttribute("pare", par);
        return "laptops.jsp";
    }
	
//	@GetMapping("/laptop")
//	public String afisareLaptop(Model model) {
//	    Laptop laptop = new Laptop("Dell", 2500, 16);
//	    model.addAttribute("lap", laptop);
//	    return "laptop2.jsp";
//	}
}
