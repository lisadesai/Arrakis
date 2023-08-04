package com.db.grad.javaapi.service;
import com.db.grad.javaapi.model.Securities;

import javax.sound.midi.Sequence;
import java.util.List;

public interface ISecurityService {
    public List<Securities> getAllSecurities();

    public Securities addSecurities(Securities theS);

    public long getNoOfSecurities();

    public boolean RemoveSecurity(int uniqueId);

    public Securities getSecuritiesById(int uniqueId);

    public Securities getSecuritiesByisin(String isinNum);
    public Securities getSecuritiesByCusip(String cusipNum);

    public Securities getbyStatus(String stat);

    public Securities findByRecentAndNearMaturity(String today_date);
    public Securities findDates(Securities start, Securities end);

//    public Securities updateUserDetails(Securities UserToUpdate);
}