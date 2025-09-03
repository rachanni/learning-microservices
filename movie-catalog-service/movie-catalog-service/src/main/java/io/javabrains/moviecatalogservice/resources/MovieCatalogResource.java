package io.javabrains.moviecatalogservice.resources;

//annotate it with @RestController to make it Rest API

import io.javabrains.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog") // hey spring boot when somebody calls url /catalog load up this resource class
public class MovieCatalogResource {

//    creating a method to handle the request

//    this method will return List of movies corresponding to given userId
    @RequestMapping("/{userId}")   // -> hey spring boot when somebody calls url /catalog/{userId} execute this method
                                   // -> {userId} curly braces UserId means userId is dynamic not fixed
                                   // -> You also need to pass userId to method as an argument
                                   // -> for this we will use annotation PathVariable
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){


//

        return Collections.singletonList(

//                we will create CatalogItem on the fly
//                we will hard code simple list to get started with.
                new CatalogItem("Transformer", "Test", 4)


        );


    }

}
