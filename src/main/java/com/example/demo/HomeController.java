package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    ResumeRepository resumeRepository;

    //@RequestMapping("/")

   // public String loadResumes(Model model)
   // {
        //model.addAttribute("resume",resumeRepository.findAll());
               // return "resumelist";
    //}
    @RequestMapping("/resumef")

    public String loadResumes(Model model)
    {
        model.addAttribute("resume",new Resume());
    return "resumef";
    }

    @PostMapping("/resumef")
    public String processForm(@Valid Resume resume, BindingResult result){
       if(result.hasErrors()) {
           return "resumef";
       }
       return "resumeconfirm";
    }

    //@GetMapping("/add")
    //public String resumeForm(Model model){
       //model.addAttribute("resumeObject", new Resume());
       //return "resumeform";
    //}
    //@PostMapping("/process")
   // public String processForm(@Valid Resume resume, BindingResult result)
    {
       // if(result.hasErrors()){
           // return "resumeform";
        //}
        //resumeRepository.save(resume);
       // return "redirect";
    }

}
