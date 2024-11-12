package com.asejnr.springmvcboot;

import com.asejnr.springmvcboot.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlienRepository alienRepository;


    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
//    public String add(HttpServletRequest request){
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//
//        int sum = num1 + num2;
//        HttpSession session = request.getSession();
//        session.setAttribute("sum", sum);
//
//        return "add.jsp";
//    }


//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
//        ModelAndView view = new ModelAndView("add");
//        int sum = num1 + num2;
//        view.addObject("sum", sum);
////        session.setAttribute("sum", sum);
//
//        return view;
//    }

    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        int sum = num1 + num2;
        model.addAttribute("sum", sum);

        return "add";
    }

//    @RequestMapping("addAlien")
    @PostMapping(value = "addAlien")
    public String addAlien(@ModelAttribute("newAlien") Alien alien, Model model){


        model.addAttribute("alien", alienRepository.save(alien));
        return "addAlien";
    }

    @GetMapping(value = "getAlien")
    public String getAlien(@RequestParam int id, Model model){
        model.addAttribute("alien", alienRepository.findById(id));
        return "getAlien";
    }

    @GetMapping("getAliens")
    public String getAliens(Model model){

        model.addAttribute("aliens", alienRepository.findAll());

        return "showAliens";
    }

    @GetMapping("getAlienByName")
    public String getAlienByName(@RequestParam String name,Model model){
        model.addAttribute("aliens", alienRepository.findByName(name));
        return "getAlienByName";
    }
}
