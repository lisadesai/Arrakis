package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TradeService implements ITradeService{

    private TradeRepository itsTradeRepo;

    @Autowired
    public TradeService( TradeRepository tRepo )
    {
        itsTradeRepo = tRepo;
        //makes the repo in this service the one from the query
    }
    @Override
    public List<Trade> getAllTrades() {
        return itsTradeRepo.findAll();
    }

    @Override
    public Trade addTrade(Trade theTrade) {
        return itsTradeRepo.save(theTrade);
    }

    @Override
    public boolean removeTrade(int uniqueId) {
        boolean result = false;

        Optional<Trade> theTrade = itsTradeRepo.findById(uniqueId);
        //may have a null value

        if(theTrade.isPresent())
        {
            itsTradeRepo.delete(theTrade.get());
            result = true;
        }

        return  result;
    }

    @Override
    public Trade getTradeById(int uniqueId) {
        return itsTradeRepo.findById(uniqueId).get();
    }

    @Override
    public Optional<List<Integer>> getTradesByBookId(int bookId) {
        List<Integer> allTrades = new LinkedList<>();
        List<Trade> trades = itsTradeRepo.findAll();
        for (Trade trade : trades) {
            if (Objects.equals(trade.getBook_id().getBook_id(), bookId)){
                allTrades.add(trade.getTrade_id());
            }
        }
        return Optional.of(allTrades);
    }

    @Override
    public Optional<List<Trade>> getAllTradesForUser(List<Integer> bookIds) {
        List<Trade> allTrades = new LinkedList<>();

        for (int bookId : bookIds) {
            Optional<List<Integer>> tradesByBook = getTradesByBookId(bookId);
            if (tradesByBook.isPresent()) {
                for (int tradeId : tradesByBook.get()) {
                    Trade addThisTrade = getTradeById(tradeId);
                    allTrades.add(addThisTrade);
                }
            }
        }
        return Optional.of(allTrades);
    }

    @Override
    public Optional<List<Trade>> getTradeBySecuritiesId(int securityId) {
        List<Trade> allTrades = new LinkedList<>();
        List<Trade> trades = itsTradeRepo.findAll();
        for (Trade trade : trades) {
            if (Objects.equals(trade.getSecurity_id().getSecurity_id(), securityId)){
                allTrades.add(trade);
            }
        }
        return Optional.of(allTrades);
    }

}