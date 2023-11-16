package com.cricket.service;

import com.cricket.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatch();
    List<Match> getLiveMatch();
    List<List<String>>getPointTable();
}
