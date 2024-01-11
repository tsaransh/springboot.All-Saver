package com.web.allsaver.controller;

import com.web.allsaver.model.DownloadDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HomeController {

    @GetMapping("/download")
    public String downloadYoutubeVideo(@RequestBody DownloadDetails downloadDetails) {
        return "index";
    }

}
