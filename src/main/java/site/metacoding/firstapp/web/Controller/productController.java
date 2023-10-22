package site.metacoding.firstapp.web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor //
@Controller // 페이지를 리턴하는 어노테이션
public class productController {
    @GetMapping("/")
    // 인터넷 URL창에 기본적으로 적는 것
    // /만 있으면 localhost창에 치면 아래 메서드가 호출된다.
    // page이동 느낌 Post -> 데이터 이동 느낌.
    public String hello(){
        // 메서드명은 중복 되면 안 된다.
        // String Type이면 String Type만 리턴 된다.
        return "index";
        // properties에서 server.servlet.context-path=/ 기본 경로를 설정한 것
        // properties에서 spring.mvc.view.prefix=/WEB-INF/views/ 라는 코드로 경로를 단축
        // properties에서 spring.mvc.view.suffix=.jsp로 확장자를 생략한 것
        // jsp는 java server templete engine이다.

    }
}
