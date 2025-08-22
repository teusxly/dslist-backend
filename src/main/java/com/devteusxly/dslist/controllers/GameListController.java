package com.devteusxly.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devteusxly.dslist.dto.GameListDTO;
import com.devteusxly.dslist.dto.GameMinDTO;
import com.devteusxly.dslist.dto.ReplecementDTO;
import com.devteusxly.dslist.services.GameListService;
import com.devteusxly.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameService gameService;
	
	@Autowired
	private GameListService  gameListService;
	
	
	@GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id) {
		GameListDTO result = gameListService.findById(id);
		return result;
	}
	
	@GetMapping 
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move (@PathVariable Long listId, @RequestBody ReplecementDTO body) {
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}

	
	

}
