package com.web.allsaver.model;

import lombok.Data;
@Data
public class DownloadDetails {
    private String downloadUrl;
    private String platformName;
    private String downloadType;
    private String resolution;
}
