package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v4")
@CrossOrigin(origins = "http://localhost:3000")
public class TradeController {
    private TradeService tradeService;

    @Autowired
    public TradeController(TradeService ts)
    {
        tradeService = ts;
    }

    @GetMapping("/trades")
    public List <Trade> getAllTrades() {
        return tradeService.getAllTrades();
    }

    @GetMapping("/tradeByBookID/{book_id}")
    public ResponseEntity < Optional<List<Integer>> > findUsersForBook(@PathVariable(value = "book_id") int book_id)
            throws ResourceNotFoundException {
        Optional<List<Integer>> users = tradeService.getTradesByBookId(book_id);
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/tradeBySecuritiesID/{security_id}")
    public ResponseEntity < Optional<List<Trade>> > findTradesBySecurity(@PathVariable(value = "security_id") int security_id)
            throws ResourceNotFoundException {
        Optional<List<Trade>> trades = tradeService.getTradeBySecuritiesId(security_id);
        return ResponseEntity.ok().body(trades);
    }

    @GetMapping("/tradesForUser/{book_ids}")
    public ResponseEntity < Optional<List<Trade>> > findTradesForUser(@PathVariable(value = "book_ids") List<Integer> book_ids)
            throws ResourceNotFoundException {
        Optional<List<Trade>> users = tradeService.getAllTradesForUser(book_ids);
        return ResponseEntity.ok().body(users);
    }

    @PostMapping("/trades")
    public Trade createTrade(@Valid @RequestBody Trade trade) {
        return tradeService.addTrade(trade);
    }

    @DeleteMapping("/trades/{trade_id}")
    public Map < String, Boolean > deleteUsers(@PathVariable(value = "trade_id") int trade_id)
            throws ResourceNotFoundException {
        boolean removed = tradeService.removeTrade(trade_id);

        Map < String, Boolean > response = new HashMap <>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);

        return response;
    }
}