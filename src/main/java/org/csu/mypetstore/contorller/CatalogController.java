package org.csu.mypetstore.contorller;

import org.csu.mypetstore.domain.Category;
import org.csu.mypetstore.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/catalog/category/{categoryId}")
    public Category category(@PathVariable("categoryId") String categoryId){
        return catalogService.getCategory(categoryId);
    }
}
