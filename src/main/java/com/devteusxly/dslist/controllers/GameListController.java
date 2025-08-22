package com.devteusxly.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devteusxly.dslist.dto.GameDTO;
import com.devteusxly.dslist.dto.GameMinDTO;
import com.devteusxly.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameListController {
	
	@Autowired
	private GameService GameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return GameService.findById(id);
		//return result;
	}
	
	@GetMapping 
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = GameService.findAll();
		return result;
	}

}
