package com.cricket.controllers;

import com.cricket.entities.Match;
import com.cricket.service.MatchService;
import com.cricket.service.MatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    @GetMapping("/live")

    public ResponseEntity<List<Match>>getLiveMatches(){
       return new ResponseEntity<>(this.matchService.getLiveMatch(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>>getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatch(), HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getCWC2023PointTable() {
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }
}
