package br.unicesumar.adsis5s2021.back.HectorOliveira;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mycores")
public class MyCorController {

    @GetMapping
    public String get() {
        return "Ola Mundo!!";
    }
    
    @PostMapping    
    public String post(@RequestBody MyCor2 nova) {

        System.out.println("Post: "
        + " "+nova.getId()
        + " "+nova.getNome()
        + " "+nova.getSigla());
        return nova.getId();
    }
}
