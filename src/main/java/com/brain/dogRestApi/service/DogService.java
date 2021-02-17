package com.brain.dogRestApi.service;

import java.util.List;

import com.brain.dogRestApi.entity.Dog;

public interface DogService {
	List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();

}
