package dev.decarvalho.urlshortener.links;

import java.time.LocalDateTime;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    private final LinkRepository linkRepository;
    private Link saved;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    private String urlGenerator() {
        return RandomStringUtils.randomAlphanumeric(5, 10);
    }

    public LinkResponse shortenerUrl(Link link) {
        link.setShortedURL(urlGenerator());
        link.setCreatedAt(LocalDateTime.now());
        saved = linkRepository.save(link);

        return new LinkResponse(link.getId(),
                link.getLongURL(),
                link.getShortedURL(),
                link.getCreatedAt());
    }

    public Link getOriginalLink(String shortedUrl) throws Exception {
        return linkRepository.findByShortedURL(shortedUrl).orElseThrow(Exception::new);
    }
}
