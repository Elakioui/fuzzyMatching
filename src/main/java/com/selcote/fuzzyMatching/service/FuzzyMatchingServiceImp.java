package com.selcote.fuzzyMatching.service;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FuzzyMatchingServiceImp implements FuzzyMatchingService{

    public List<String> match(){
        List<String> bestOccurences = new ArrayList<>();
        List<String> list = Arrays.asList(".neet", ".nezzzzzz", ".nete");

        List<ExtractedResult> extractedResults = FuzzySearch.extractAll(".net", list, 3);

        extractedResults.forEach( extractedResult -> {
            System.out.print(extractedResult.getScore());
            if(extractedResult.getScore() >= 85 ){
                System.out.print(extractedResult.getString());
                bestOccurences.add(extractedResult.getString());
            }
        });

        return bestOccurences;
    }
}
