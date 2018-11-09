package com.liferon.recipe.controllers;

import com.liferon.recipe.model.Recipe;
import com.liferon.recipe.services.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Slf4j
@Controller
@RequiredArgsConstructor
public class IndexController {

    private final RecipeService recipeService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        Set<Recipe> recipes = recipeService.getRecipes();
        model.addAttribute("recipes", recipes);

        return "index";
    }


}
