package com.oocl.ir4.dsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillGroupController {
    @Autowired
    private SkillGroupService skillGroupService;

    @RequestMapping(value = "/OOCL",method = RequestMethod.GET)
    public @ResponseBody String helloWorld()
    {
        return "HelloOOCL222222222222222";
    }
}
