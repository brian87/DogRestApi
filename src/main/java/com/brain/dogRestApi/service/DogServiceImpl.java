package com.brain.dogRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brain.dogRestApi.entity.Dog;
import com.brain.dogRestApi.repository.DogRepository;

@Service
public class DogServiceImpl implements DogService  {
	
	@Autowired
    DogRepository dogRepository;
	
	public List<Dog> retrieveDogs(){
		return (List<Dog>)dogRepository.findAll();
	}
	
	 public List<String> retrieveDogBreed(){
		return (List<String>)dogRepository.findAllBreed();
	 }
	 
	 public String retrieveDogBreedById(Long id) {
		Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
	 }
	 
	 public List<String> retrieveDogNames(){
		 return (List<String>)dogRepository.findAllName();
	 }

}
