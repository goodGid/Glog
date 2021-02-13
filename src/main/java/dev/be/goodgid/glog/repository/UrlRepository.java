package dev.be.goodgid.glog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.be.goodgid.glog.domain.Url;

public interface UrlRepository extends JpaRepository<Url, Long> {

    Optional<Url> findByUrlValue(String urlValue);
}
