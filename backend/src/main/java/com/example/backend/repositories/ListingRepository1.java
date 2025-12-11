package com.example.backend.repositories;
import com.example.backend.model.Listing1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ListingRepository1 extends JpaRepository<Listing1, Long> {

    Optional<Listing1> findByIdAndProviderId(Long id, Long providerId);

    void deleteByIdAndProviderId(Long id, Long providerId);

    List<Listing1> findByProviderId(Long providerId);
}