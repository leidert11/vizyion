package com.vizyion.vizyion.domain.Service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface<T> {
    List<T> findAll();
}
