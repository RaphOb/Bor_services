package com.devoteam.presales.bor;
import com.google.api.client.util.DateTime;

import java.time.LocalDateTime;
import java.util.List;

public class Bor {
    private String opportunityId;
    private String accountName;
    private String stage;
    private User owner;
    private User salesLeader;
    private User technicalLeader;
    private User bidOwner;
    private String opportunytyName;
    private LocalDateTime expectedDate;
    private Boolean mustWinDeal;
    private Boolean frameworkAgreement;
    private Long expectedRevenu;
    private Integer winrate;
    private List<Entity> businessEntities;
    private String opportunityDescription;
    private List<String> inputDocuments;
    private LocalDateTime sendingDate;
    private LocalDateTime decisionDate;
    private LocalDateTime startingDate;
    private LocalDateTime borDateTime;
    private String contributors;
    private String strengths;
    private String weakness;
    private String competitors;
    private Integer opportunityRating;

    public String getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getSalesLeader() {
        return salesLeader;
    }

    public void setSalesLeader(User salesLeader) {
        this.salesLeader = salesLeader;
    }

    public User getTechnicalLeader() {
        return technicalLeader;
    }

    public void setTechnicalLeader(User technicalLeader) {
        this.technicalLeader = technicalLeader;
    }

    public User getBidOwner() {
        return bidOwner;
    }

    public void setBidOwner(User bidOwner) {
        this.bidOwner = bidOwner;
    }

    public String getOpportunytyName() {
        return opportunytyName;
    }

    public void setOpportunytyName(String opportunytyName) {
        this.opportunytyName = opportunytyName;
    }

    public LocalDateTime getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(LocalDateTime expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Boolean getMustWinDeal() {
        return mustWinDeal;
    }

    public void setMustWinDeal(Boolean mustWinDeal) {
        this.mustWinDeal = mustWinDeal;
    }

    public Boolean getFrameworkAgreement() {
        return frameworkAgreement;
    }

    public void setFrameworkAgreement(Boolean frameworkAgreement) {
        this.frameworkAgreement = frameworkAgreement;
    }

    public Long getExpectedRevenu() {
        return expectedRevenu;
    }

    public void setExpectedRevenu(Long expectedRevenu) {
        this.expectedRevenu = expectedRevenu;
    }

    public Integer getWinrate() {
        return winrate;
    }

    public void setWinrate(Integer winrate) {
        this.winrate = winrate;
    }

    public List<Entity> getBusinessEntities() {
        return businessEntities;
    }

    public void setBusinessEntities(List<Entity> businessEntities) {
        this.businessEntities = businessEntities;
    }

    public String getOpportunityDescription() {
        return opportunityDescription;
    }

    public void setOpportunityDescription(String opportunityDescription) {
        this.opportunityDescription = opportunityDescription;
    }

    public List<String> getInputDocuments() {
        return inputDocuments;
    }

    public void setInputDocuments(List<String> inputDocuments) {
        this.inputDocuments = inputDocuments;
    }

    public LocalDateTime getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(LocalDateTime sendingDate) {
        this.sendingDate = sendingDate;
    }

    public LocalDateTime getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(LocalDateTime decisionDate) {
        this.decisionDate = decisionDate;
    }

    public LocalDateTime getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDateTime startingDate) {
        this.startingDate = startingDate;
    }

    public String getContributors() {
        return contributors;
    }

    public void setContributors(String contributors) {
        this.contributors = contributors;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getCompetitors() {
        return competitors;
    }

    public void setCompetitors(String competitors) {
        this.competitors = competitors;
    }

    public Integer getOpportunityRating() {
        return opportunityRating;
    }

    public void setOpportunityRating(Integer opportunityRating) {
        this.opportunityRating = opportunityRating;
    }
    public LocalDateTime getBorDateTime() {
        return borDateTime;
    }

    public void setBorDateTime(LocalDateTime borDateTime) {
        this.borDateTime = borDateTime;
    }
}
//todo : test creation 3 users
// todo : creation des test pour recuperer les champs et les users
