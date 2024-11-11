package com.asejnr.springmvcboot;

import com.asejnr.springmvcboot.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
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

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("newAlien") Alien alien, Model model){


        model.addAttribute("alien", alien);
        return "addAlien";
    }
}
