package bg.sirma.deploy_demo.web;

import bg.sirma.deploy_demo.web.data.UserBasicInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home/info")
    public UserBasicInfoDTO getInfo() {
        return new UserBasicInfoDTO(10, "pesho@mail");
    }
}
