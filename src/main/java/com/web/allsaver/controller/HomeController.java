package com.web.allsaver.controller;

import com.web.allsaver.model.DownloadDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api")
@Slf4j
public class HomeController {

    @PostMapping("/download")
    public String downloadVideo(@RequestBody DownloadDetails downloadDetails) {
        // Process the downloadDetails and perform your logic
        log.info(downloadDetails.toString());
        return "success";
    }

}
