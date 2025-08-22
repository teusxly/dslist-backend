package com.devteusxly.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devteusxly.dslist.dto.GameMinDTO;
import com.devteusxly.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService GameService;
	
	@GetMapping 
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = GameService.findAll();
		return result;
	}

}
