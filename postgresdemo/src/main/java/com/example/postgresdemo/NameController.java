package com.example.postgresdemo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/names")
public class NameController {
    private final NameRepository repo;

    public NameController(NameRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Users> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Users add(@RequestBody Users n){
        return repo.save(n);
    }


}
