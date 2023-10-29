package com.form.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control {
    @RequestMapping("/feedback")
    public String regiserterform(@ModelAttribute("frm") Forms frm)
    {
        return "feedback_form";
    }
    @RequestMapping("/succ")
    public String  regisertersucc(@ModelAttribute("frm") Forms frm)
    {
        return "succ";
    }
}
