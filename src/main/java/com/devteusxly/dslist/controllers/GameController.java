package com.devteusxly.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devteusxly.dslist.dto.GameListDTO;
import com.devteusxly.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameListService GameListService;

	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = GameListService.findAll();
		return result;
	}

}
