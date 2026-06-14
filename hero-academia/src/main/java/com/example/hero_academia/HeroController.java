package com.example.hero_academia;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroController {
    List<Hero> heroes = new ArrayList<>();
    @PostMapping
    public Hero addHero(@RequestBody Hero hero){
        heroes.add(hero);
        return hero;
    }
    @GetMapping
    public List<Hero> getHeroes(){
        return heroes;
    }

}
