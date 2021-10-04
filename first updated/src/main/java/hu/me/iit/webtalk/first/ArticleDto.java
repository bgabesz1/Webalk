package hu.me.iit.webtalk.first;

import javax.validation.constraints.NotBlank;

public class ArticleDto {
    private String Author;
    @NotBlank
    private String title;
    @NotBlank
    private Integer pages;
    @NotBlank
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }


}
