package dev.decarvalho.urlshortener.links;

import java.time.LocalDateTime;

public record LinkResponse(Long id, String longURL, String shortedURL, LocalDateTime createdAt) {

}
