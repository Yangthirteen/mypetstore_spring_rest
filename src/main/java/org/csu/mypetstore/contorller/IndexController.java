package org.csu.mypetstore.contorller;

import org.csu.mypetstore.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/")
    public String viewIndex(){
        return "index";
    }
}
