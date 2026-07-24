package com.example.final_project_paper_mill.Mahapara;

public class FeedbackInfo {
    private String customerId;
    private String rating;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "FeedbackInfo{" +
                "customerId='" + customerId + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
