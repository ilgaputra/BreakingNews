package com.gyosanila.e_power.breakingnews.Home.Model;

import com.gyosanila.e_power.breakingnews.Home.View.HomeActivity;

public class News {

    String title,description,source,author,publish,urlImage,url;

    public News(String title, String description, String author, String source,  String publish, String urlImage, String url)
    {
        this.title = title;
        this.description = description;
        this.author = author;
        this.source = source;
        this.publish = publish;
        this.urlImage = urlImage;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
