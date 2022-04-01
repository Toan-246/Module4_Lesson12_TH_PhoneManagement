package com.codegym.service;

import com.codegym.model.Smartphone;
import com.codegym.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartphoneService implements ISmartphoneService{
	@Autowired
	private ISmartphoneRepository smartphoneRepository;
	@Override
	public Iterable<Smartphone> findAll() {
		return smartphoneRepository.findAll();
	}

	@Override
	public Optional<Smartphone> findById(Long id) {
		return smartphoneRepository.findById(id);
	}

	@Override
	public Smartphone save(Smartphone smartphone) {
		return smartphoneRepository.save(smartphone);
	}

	@Override
	public void deleteById(Long id) {
		smartphoneRepository.deleteById(id);
	}
}
