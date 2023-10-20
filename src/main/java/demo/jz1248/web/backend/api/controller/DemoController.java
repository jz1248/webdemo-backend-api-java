package demo.jz1248.web.backend.api.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping({"/", "/hello"})
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return StringUtils.isBlank(name) ? "Hello!" : "Hello, " + name + "!";
    }
}
