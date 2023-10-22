package site.metacoding.firstapp.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.product.Product;
import site.metacoding.firstapp.domain.user.User;
import site.metacoding.firstapp.web.service.ProductService;
import site.metacoding.firstapp.web.service.UserService;

@RequiredArgsConstructor
@Controller
public class productController {

    private final UserService userService;
    private final ProductService productService;

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/user/test/xml")
    public String testUser(Model model) {
        System.err.println("디버그 컨트롤러");
        Integer userId = 1;
        User userPS = userService.findById(userId);
        System.err.println("디버그 "+userPS.getUserLoginId());
        model.addAttribute("userPS", userPS);
        return "userXmlTest";
    }

    @GetMapping("/product/test/xml")
    public String testProduct(Model model) {
        System.err.println("디버그 컨트롤러");
        Integer productId = 1;
        Product productPS = productService.findById(productId);
        System.err.println("디버그 "+productPS.getProductName());
        model.addAttribute("productPS", productPS);
        return "productXmlTest";
    }
}