package com.devoteam.presales.bor;

import com.devoteam.presales.bor.models.Bor;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class BorTest {

    @Test
    public void createBorTest()
    {
        Bor bor =  new Bor();
        bor.setAccountName("EDF");
//        bor.setBidOwner(userBid);
        bor.setBorDateTime(LocalDateTime.of(2019, Month.MAY,20,19,20));
//        bor.setBusinessEntities(entity);
        bor.setCompetitors("Wavestone");
        bor.setDecisionDate(LocalDateTime.of(2019, Month.MAY,20,19,20));
        bor.setExpectedDate(LocalDateTime.of(2019, Month.MAY,20,19,20));
        bor.setFrameworkAgreement(true);
//        bor.setInputDocuments(List<String> doc);
        bor.setMustWinDeal(true);
        bor.setOpportunityDescription("description");
        bor.setOpportunityId("opId");
        bor.setOpportunityRating(10);
        bor.setOpportunytyName("oppotruny name");
//        bor.setOwner();
//        bor.setSalesLeader();
        bor.setSendingDate(LocalDateTime.of(2019, Month.MAY,20,19,20));
        bor.setStage("set stage");
        bor.setStartingDate(LocalDateTime.of(2019, Month.MAY,20,19,20));
        bor.setWinrate(100);
        bor.setWeakness("wkeaness");
//        bor.setTechnicalLeader();
        bor.setStrengths("strenghts");
        bor.setExpectedRevenu(1000L);
//        bor.setBusinessEntities();

        assertThat(bor.getStrengths()).isEqualTo("strenghts");
    }

}
