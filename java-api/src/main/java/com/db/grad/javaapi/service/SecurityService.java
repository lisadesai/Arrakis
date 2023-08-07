package com.db.grad.javaapi.service;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.SecuritiesRepository;
//import com.sun.org.apache.bcel.internal.generic.NEW;
//import jdk.vm.ci.meta.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.db.grad.javaapi.model.Securities;
//import sun.tools.jconsole.JConsole;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.*;


import javax.sound.midi.Sequence;
import java.text.SimpleDateFormat;

//the point of the service is to take the query supplied by the repo and
//make it readable for the controller
//uses the interface to have a model of abstract methods
//controller will call the service to execute functions
@Service
public class SecurityService implements ISecurityService {
    //implements this interface to say here is what this class can do all the moveable abstract methods
    private SecuritiesRepository itsSecuritysRepo;

    //creates a Security repo for this service
    @Autowired
    public SecurityService(SecuritiesRepository sRepo) {
        itsSecuritysRepo = sRepo;
        //makes the repo in this service the one from the query
    }

    @Override
    public List<Securities> getAllSecurities() {
        return itsSecuritysRepo.findAll();
    }

    @Override
    public Securities addSecurities(Securities theS) {
        return itsSecuritysRepo.save(theS);
    }


    @Override
    public long getNoOfSecurities() {
        return itsSecuritysRepo.count();
    }

    @Override
    public boolean RemoveSecurity(int uniqueId) {
        boolean result = false;

        Optional<Securities> thes = itsSecuritysRepo.findById(uniqueId);
        //may have a null value

        //unique id is security id

        if (thes.isPresent()) //iof the security isnt null
        {
            itsSecuritysRepo.delete(thes.get());
            result = true;
        }

        return result;
    }


    @Override
    public Securities getSecuritiesById(int uniqueId) {
        return itsSecuritysRepo.findById(uniqueId).get();
    }

    @Override
    public Securities getbyStatus(String stat) {
        return null;
    }


    @Override
    public Optional<List<Securities>> findByRecentAndNearMaturity(String today_date) {
        System.out.println(today_date);
        List<Securities> checkList = itsSecuritysRepo.findAll();
        List<Securities> matList = new LinkedList<>(); //list w matured bonds
//        LocalDate Todaydate = LocalDate.parse(today_date, DateTimeFormatter.ofPattern("dd-MM-yyyy")); //today's date in right format
        for (Securities ss : checkList){
//            LocalDate MatDate = LocalDate.parse(ss.getMature_date(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//           compareTo():returns 0 if equal. returns value greater than 0 if date 1 is after date 2
//            returns value less than zero if date1 is before2
            long daysBetween = ChronoUnit.DAYS.between(LocalDate.parse(today_date), LocalDate.parse(ss.getMature_date()));
            //can return a negative number
            //looking for negative 5 to positive 5 for before and after
            if ((daysBetween >=-5) && (daysBetween <=5)) {
                //view bonds due for maturity within last and next five days
                matList.add(ss);
            }
        }

        return Optional.of(matList);
    }

    @Override
    public Securities findDates(Securities start, Securities end) {
        return null;
    }
}