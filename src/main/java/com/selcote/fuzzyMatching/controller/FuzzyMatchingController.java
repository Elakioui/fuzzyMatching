package com.selcote.fuzzyMatching.controller;

import com.selcote.fuzzyMatching.service.FuzzyMatchingService;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.BoundExtractedResult;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FuzzyMatchingController {

    @Autowired
    private FuzzyMatchingService fuzzyMatchingService;

    @GetMapping("/fuzzy-matching")
    public List<String> fuzzyMatching() {

        return this.fuzzyMatchingService.match();

    }
}
