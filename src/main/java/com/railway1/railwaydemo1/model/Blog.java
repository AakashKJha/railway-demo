package com.railway1.railwaydemo1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "blog")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Blog {
    @Id
    private String id;
    private String title;
    private String content;
    private String author;
    private String date;
    private String category;
    private List<String> tags;
    private String status;
    private String commentStatus;
    private String allowComment;
    private String allowPing;
    private String allowFeed;
    private String url;
    private String type;
    private String password;
    private String template;
    private String contentMd;
    private String contentHtml;
    private String commentCount;
    private String pingCount;
    private String updateTime;
    private String createDate;
    private String lastmodify;
    private String description;
    private String thumbnail;
    private String parent;
    private String order;
    private String top;
    private String hide;
    private String deleted;
    private String domain;
    private String allowDownload;
    private String code;
    private String typeId;
    private String userId;
    private String postCount;
    private String commentCountStr;
    private String pingCountStr;
    private String postDate;
}
