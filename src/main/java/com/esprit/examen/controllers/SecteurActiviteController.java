package com.esprit.examen.controllers;


import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;

@RestController
@Api(tags = "Gestion des secteurs activites")
@RequestMapping("/secteurActivite")
@CrossOrigin("*")
public class SecteurActiviteController {/*

	@Autowired
	ISecteurActiviteService secteurActiviteService;
	
	@GetMapping("/retrieve-all-secteurActivite")
	@ResponseBody
	public List<SecteurActivite> getSecteurActivite() {
		return secteurActiviteService.retrieveAllSecteurActivite();
	}

	@GetMapping("/retrieve-secteurActivite/{secteurActivite-id}")
	@ResponseBody
	public SecteurActivite retrieveSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		return secteurActiviteService.retrieveSecteurActivite(secteurActiviteId);
	}

	@PostMapping("/add-secteurActivite")
	@ResponseBody
	@SuppressWarnings("java:S4684")
	public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite sa) {
		return secteurActiviteService.addSecteurActivite(sa);
	}

	@DeleteMapping("/remove-secteurActivite/{secteurActivite-id}")
	@ResponseBody
	public void removeSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		secteurActiviteService.deleteSecteurActivite(secteurActiviteId);
	}*/


	
}
