package com.example.jd.dealershipapp.JavaBean;



public class Credits {

    private String creditsTitle;
    private String creditsAuthor;
    private String creditsDesc;
    private String creditsLink;


    public Credits() {

    }

    public Credits(String creditsTitle, String creditsAuthor, String creditsDesc, String creditsLink) {
        this.creditsTitle = creditsTitle;
        this.creditsAuthor = creditsAuthor;
        this.creditsDesc = creditsDesc;
        this.creditsLink = creditsLink;
    }




    public String getCreditsTitle() {
        return creditsTitle;
    }

    public void setCreditsTitle(String creditsTitle) {
        this.creditsTitle = creditsTitle;
    }

    public String getCreditsAuthor() {
        return creditsAuthor;
    }

    public void setCreditsAuthor(String creditsAuthor) {
        this.creditsAuthor = creditsAuthor;
    }

    public String getCreditsDesc() {
        return creditsDesc;
    }

    public void setCreditsDesc(String creditsDesc) {
        this.creditsDesc = creditsDesc;
    }

    public String getCreditsLink() {
        return creditsLink;
    }

    public void setCreditsLink(String creditsLink) {
        this.creditsLink = creditsLink;
    }
}