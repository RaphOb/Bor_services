package com.devoteam.presales.bor.models;

import com.devoteam.presales.bor.ListJson.ListAudience;
import com.devoteam.presales.bor.ListJson.ListBors;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.devoteam.presales.Googleapi;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.FreeBusyResponse;
import org.junit.Test;
import com.google.api.services.calendar.Calendar.Freebusy;
import com.google.api.services.calendar.model.FreeBusyCalendar;
import com.google.api.services.calendar.model.FreeBusyRequest;
import com.google.api.services.calendar.model.FreeBusyRequestItem;
import com.google.api.services.calendar.model.FreeBusyResponse;
import com.google.api.services.calendar.model.TimePeriod;
import org.springframework.scheduling.annotation.Scheduled;

@JsonAutoDetect
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

    @Test
    public void createBor() throws IOException, GeneralSecurityException, ParseException {
        Bor bor = new Bor();
        bor.setStage("2");
        bor.setAccountName("un account name");


        List<User> mandatory = Audience.getMandatoryFromEntity(new Entity(), 1, ListAudience.audiences);
        List<User> optionnal = Audience.getOptionalFromEntity(new Entity(), 1, ListAudience.audiences);
        List<String> emailM = mandatory.stream().map(User::getEmail).collect(Collectors.toList());
        List<String> emailO = optionnal.stream().map(User::getEmail).collect(Collectors.toList());

        EventAttendee[] attendees = new EventAttendee[emailM.size() + emailO.size()];
        for (int i = 0; i < emailM.size(); i++) {
            attendees[i] = new EventAttendee().setEmail(emailM.get(i));
        }
        for (int i = 0; i < emailO.size(); i++) {
            attendees[i + emailM.size()] = new EventAttendee().setEmail(emailO.get(i));
        }

        Event event = new Event();
        event.setAttendees(Arrays.asList(attendees));
        event.setSummary("new Event");

        Googleapi service = new Googleapi("c:/temp/credentials.json");
        List<Event> eventDispo = service.checkIdevent("Creneau");
        event.setSummary("Bor Booked");
        int index = 0;
        for (Event e : eventDispo) {
            if (isAvailable(emailM, eventDispo.get(index).getStart()) < 0.49) {
                index++;
            } else {
//                service.updEvent("primary", eventDispo.get(index).getId(), event);

            }
        }
        ListBors.listBors.add(bor);
    }

    private float isAvailable(List<String> email, EventDateTime start) throws ParseException, GeneralSecurityException, IOException {
        Googleapi service = new Googleapi("c:/temp/credentials.json");
        Map<String, List<TimePeriod>> res = service.getBusy(email, start);
        float i = 0;
        float l = email.size();
        for (List<TimePeriod> res1 : res.values()) {
            if (res1.isEmpty()) {
                i++;
            }
        }
        return i / l;
    }

    @Scheduled(cron = "0 0 12 * * *")
    public void scheduledWriteJsonBor() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dMy");
        objectMapper.writeValue(new FileWriter("C:\\Users\\oraph\\Desktop\\bor_" + ft.format(dNow) + ".json"), ListBors.listBors);
    }
}
