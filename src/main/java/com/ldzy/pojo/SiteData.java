package com.ldzy.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class SiteData {
    private int ebookNum;
    private int ebookClassicalNum;//经典文学
    private int ebookPopularNum;
    private int ebookComputeNum;
    private int ebookMagazineNum;
    private Date lastUpdateTime;
}
