package com.example.springboot.controllers;

import com.example.springboot.domain.OutsourcedPart;
import com.example.springboot.domain.Part;
import com.example.springboot.service.OutsourcedPartService;
import com.example.springboot.service.OutsourcedPartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AddOutsourcedPartController {
    @Autowired
    private ApplicationContext context;

    @SuppressWarnings("SameReturnValue")
    @GetMapping("/showFormAddOutPart")
    public String showFormAddOutsourcedPart(Model theModel){
        Part part=new OutsourcedPart();
        theModel.addAttribute("outsourcedpart",part);
        return "OutsourcedPartForm";
    }

    @PostMapping("/showFormAddOutPart")
    public String submitForm(@Valid @ModelAttribute("outsourcedpart") OutsourcedPart part, BindingResult bindingResult, Model theModel){
        theModel.addAttribute("outsourcedpart",part);

        if(bindingResult.hasErrors()){
            return "OutsourcedPartForm";
        } else {
            OutsourcedPartService repo=context.getBean(OutsourcedPartServiceImpl.class);
            OutsourcedPart op=repo.findById((int)part.getId());
            if(op!=null) {
                part.setProducts(op.getProducts());
            }
            repo.save(part);
            return "confirmationaddpart";
        }
    }
}
