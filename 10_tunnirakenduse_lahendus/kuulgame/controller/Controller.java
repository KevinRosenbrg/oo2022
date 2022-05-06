package com.example.kuulgame.controller;

import com.example.kuulgame.model.Build;
import com.example.kuulgame.model.Item;
import com.example.kuulgame.repository.BuildRepository;
import com.example.kuulgame.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {
    List<String> meleew = new ArrayList<>();
    List<String> rangedw = new ArrayList<>();
    List<String> magicw = new ArrayList<>();
    List<String> clout = new ArrayList<>();
    List<String> shoes = new ArrayList<>();

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    BuildRepository buildRepository;

    @GetMapping("addMeleeWeapon/{weapon}") // 1. localhost:8080/addMeleeWeapon/sword  2. localhost:8080/addMeleeWeapon/spear
    public List<String> addMelee(@PathVariable String weapon) {
        meleew.add(weapon);
        return meleew;
    }

    @GetMapping("addRangedWeapon/{weapon}") // 1. localhost:8080/addRangedWeapon/bow  2. localhost:8080/addRangedWeapon/bone
    public List<String> addRanged(@PathVariable String weapon) {
        rangedw.add(weapon);
        return rangedw;
    }

    @GetMapping("addMagicWeapon/{weapon}") // 1. localhost:8080/addMagicWeapon/staff  2. localhost:8080/addMagicWeapon/book
    public List<String> addMagic(@PathVariable String weapon) {
        magicw.add(weapon);
        return magicw;
    }

    @GetMapping("addClout/{clouter}") // 1. localhost:8080/addClout/ice  2. localhost:8080/addClout/lui vuitton
    public List<String> addClout(@PathVariable String clouter) {
        clout.add(clouter);
        return clout;
    }

    @GetMapping("addShoes/{shoe}") // 1. localhost:8080/addShoes/ice skates  2. localhost:8080/addShoes/yeezy
    public List<String> addShoes(@PathVariable String shoe) {
        shoes.add(shoe);
        return shoes;
    }

    @PostMapping("items") // localhost:8080/items  POST
    public void addItem(@RequestBody Item item) {
        itemRepository.save(item);
    }

    @GetMapping("items")
    public List<Item> getItems() { return itemRepository.findAll(); }

    // [{"id":1111111, "name":"BF Sword", "damage":40, "defence":0, "description":"You're wives boyfreind sword"}]

    @PostMapping("builds")
    public void addBuild(@RequestBody Build build) { buildRepository.save(build); }

    @GetMapping("builds")   // {"item1":"Man in balck", "item2":"Man in blue", "item3":"Man in bredd", "item4":"Man in grenn"}
    public List<Build> getBuilds() { return buildRepository.findAll(); }

    @GetMapping("items/{index}") // localhost:8080/items/1  GET
    public Item getItem(@PathVariable Long index) {
        return itemRepository.findById(index).get();
    }
}
