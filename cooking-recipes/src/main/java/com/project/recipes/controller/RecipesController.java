package com.project.recipes.controller;

import com.project.recipes.model.Category;
import com.project.recipes.model.Recipe;
import com.project.recipes.model.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("recipes")
public class RecipesController {

    @Autowired
    private RecipesRepository repo;

    @GetMapping()
    public ModelAndView getRecipes() {
        ModelAndView modelAndView = new ModelAndView("recipes-table");

        List<Recipe> recipesList = repo.findAll();

        modelAndView.addObject("reteta", recipesList);

        return modelAndView;
    }
    @GetMapping("home")
    public ModelAndView getHomePage() {
        ModelAndView modelAndView = new ModelAndView("home-page");
        List<Recipe> recipesList = repo.findAllByOrderByModifiedDesc();
        modelAndView.addObject("reteta", recipesList);

        return modelAndView;
    }

    @GetMapping(path = "soup")
    public ModelAndView getSoup() {
        ModelAndView modelAndView = new ModelAndView("home-page");

        List<Recipe> recipes = repo.findByCategoryOrderByModifiedDesc(Category.SOUP);
        modelAndView.addObject("reteta", recipes);
        return modelAndView;

    }

    @GetMapping(path = "main-dish")
    public ModelAndView getMainDish() {
        ModelAndView modelAndView = new ModelAndView("home-page");

        List<Recipe> recipes = repo.findByCategoryOrderByModifiedDesc(Category.MAIN_DISH);
        modelAndView.addObject("reteta", recipes);
        return modelAndView;

    }

    @GetMapping(path = "salad")
    public ModelAndView getSalad() {
        ModelAndView modelAndView = new ModelAndView("home-page");

        List<Recipe> recipes = repo.findByCategoryOrderByModifiedDesc(Category.SALAD);
        modelAndView.addObject("reteta", recipes);
        return modelAndView;

    }

    @GetMapping(path = "dessert")
    public ModelAndView getDessert() {
        ModelAndView modelAndView = new ModelAndView("home-page");

        List<Recipe> recipes = repo.findByCategoryOrderByModifiedDesc(Category.DESSERT);
        modelAndView.addObject("reteta", recipes);
        return modelAndView;

    }

    @GetMapping(path = "miscellaneous")
    public ModelAndView getMiscellaneous() {
        ModelAndView modelAndView = new ModelAndView("home-page");

        List<Recipe> recipes = repo.findByCategoryOrderByModifiedDesc(Category.MISCELLANEOUS);
        modelAndView.addObject("reteta", recipes);
        return modelAndView;

    }

    @GetMapping(path = "about-me")
    public ModelAndView getAboutMe() {
        ModelAndView modelAndView = new ModelAndView("about-me");
        return modelAndView;

    }

    @GetMapping("view/{id}")
    public ModelAndView recipePage(@PathVariable(name= "id") Long id) {
        Recipe recipe = repo.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("recipe-page");
        modelAndView.addObject("recipe", recipe);
        return modelAndView;

    }

    @GetMapping("edit/{id}")
    public ModelAndView showEditPage(@PathVariable(name= "id") Long id) {
        Recipe recipe = repo.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("edit-page");
        modelAndView.addObject("recipeToEdit", recipe);
        return modelAndView;

    }

    @PostMapping(path = "/edit/{id}")
    public String editPage(@ModelAttribute(name = "recipeToEdit")@Valid Recipe recipe, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "edit-page";
        }
        recipe.setCreated(LocalDate.now());
        recipe.setModified(LocalDate.now());
        repo.save(recipe);
        return "redirect:/recipes/view/{id}";
    }

    @PostMapping
    public String deleteRecipeById(@RequestParam("idReteta") Long id){
        repo.deleteById(id);
        return "redirect:/recipes/home";
    }

    @GetMapping(path = "add")
    public ModelAndView recipeAddForm(){
        ModelAndView modelAndView = new ModelAndView("add-recipe-form");

        modelAndView.addObject("retetaDeAdaugat", new Recipe());

        return modelAndView;
    }

    @PostMapping(path = "add")
    public String recipeSubmit(@ModelAttribute(name = "retetaDeAdaugat") @Valid Recipe recipe, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add-recipe-form";
        }
        recipe.setCreated(LocalDate.now());
        recipe.setModified(LocalDate.now());
        repo.save(recipe);
        return "redirect:/recipes/home";
    }


    @RequestMapping(value = "page/{page}")
    public ModelAndView listArticlesPageByPage(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("home-page");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findAll(pageable);
        int totalPages = articlePage.getTotalPages();
        if(totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1,totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("reteta", articlePage.getContent());
        return modelAndView;
    }
}
