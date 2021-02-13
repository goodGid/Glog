package dev.be.goodgid.glog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.be.goodgid.glog.domain.ViewCounter;

public interface ViewCounterRepository extends JpaRepository<ViewCounter, Long> {
}
