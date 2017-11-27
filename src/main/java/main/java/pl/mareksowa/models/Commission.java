package main.java.pl.mareksowa.models;

import java.util.ArrayList;
import java.util.List;

public class Commission {



    public String calculateCommissions(String dateFrom, String dateTo, int agentId){
        List<DealsInTheSystem> dealsInTheSystems = new ArrayList<DealsInTheSystem>();
        dealsInTheSystems = getDealsInTheSystem(agentId);
        leftOnlyDealsBetweenGivenDate(dealsInTheSystems, dateFrom, dateTo);

        
        return null;
    }

    public List<DealsInTheSystem> leftOnlyDealsBetweenGivenDate(List<DealsInTheSystem> currentDeals, String dateFrom, String dateTo){
        //left only deals between given date
        for (DealsInTheSystem deal : currentDeals) {
            if (parseDate(deal.getDealDate())<parseDate(dateFrom) && parseDate(deal.getDealDate())>=parseDate(dateTo)){
                currentDeals.remove(deal);
            }
        }
        return currentDeals;
    }

    public List<DealsInTheSystem> getDealsInTheSystem( int agentId){
        // todo implements
        return null;
    }

    public int parseDate(String date){
        return 0;
    }



}
