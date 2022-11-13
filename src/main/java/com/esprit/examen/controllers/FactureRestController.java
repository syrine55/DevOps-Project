package com.esprit.examen.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.services.IFactureService;

import io.swagger.annotations.Api;


@RestController
@Api(tags = "Gestion des factures")
@RequestMapping("/facture")
@CrossOrigin("*")
public class FactureRestController {/*

    @Autowired
    IFactureService factureService;


    @GetMapping("/retrieve-all-factures")
    @ResponseBody
    public List<Facture> getFactures() {
        return factureService.retrieveAllFactures();
    }

    @GetMapping("/retrieve-facture/{facture-id}")
    @ResponseBody
    public Facture retrieveFacture(Long factureId) {
        return factureService.retrieveFacture(factureId);
    }

    @PostMapping("/add-facture")
    @ResponseBody
    @SuppressWarnings("java:S4684")
    public Facture addFacture(Facture f) {
        return factureService.addFacture(f);
    }


    @PutMapping("/cancel-facture/{facture-id}")
    @ResponseBody
    public void cancelFacture(Long factureId) {
        factureService.cancelFacture(factureId);
    }



    @GetMapping(value = "/pourcentageRecouvrement/{startDate}/{endDate}")
    public float pourcentageRecouvrement(
            @PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
            @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        try {
            return factureService.pourcentageRecouvrement(startDate, endDate);
        } catch (Exception e) {
            return 0;
        }
    }*/

}
