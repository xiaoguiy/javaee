package com.ldzy.pojo;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class Book {
   private long id;
   private String book_title;
   private String book_author;
   private String book_summary;
   private int type_id;
   private int download_times;
   private Date book_pubYear;
   private String book_file;
   private String book_cover;
   private String book_format;
}
