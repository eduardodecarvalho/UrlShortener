package dev.decarvalho.urlshortener.links;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

    Optional<Link> findByShortedURL(String shortedUrl);

}
