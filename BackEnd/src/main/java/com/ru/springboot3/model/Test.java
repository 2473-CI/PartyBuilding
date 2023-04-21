package com.ru.springboot3.model;

public class Test {
    private Integer id;

    private String html;

    private String css;

    private String js;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", html=").append(html);
        sb.append(", css=").append(css);
        sb.append(", js=").append(js);
        sb.append("]");
        return sb.toString();
    }
}