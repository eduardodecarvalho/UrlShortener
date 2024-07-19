package dev.decarvalho.urlshortener.links;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping
    public String getMethodName() {
        return "Working";
    }

    @PostMapping("/shortenerUrl")
    @ResponseStatus(HttpStatus.CREATED)
    public LinkResponse postMethodName(@RequestBody Link link) {
        return linkService.shortenerUrl(link);
    }

}
