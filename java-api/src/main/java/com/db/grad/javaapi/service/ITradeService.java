package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;

import java.util.List;
import java.util.Optional;

public interface ITradeService {
    public List<Trade> getAllTrades();

    public Trade addTrade(Trade theTrade);

    public boolean removeTrade(int uniqueId);

    public Trade getTradeById(int uniqueId);

    public Optional<List<Integer>> getTradesByBookId(int bookId);

    public Optional<List<Trade>> getAllTradesForUser(List<Integer> bookIds);

    public Optional<List<Trade>> getTradeBySecuritiesId(int securityId);

}