package com.db.grad.javaapi.service;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.SecuritiesRepository;
//import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.db.grad.javaapi.model.Securities;
//import sun.tools.jconsole.JConsole;


import javax.sound.midi.Sequence;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    public SecurityService( SecuritiesRepository sRepo )
    {
        itsSecuritysRepo = sRepo;
        //makes the repo in this service the one from the query
    }

    @Override
    public List<Securities> getAllSecurities()
    {
        return itsSecuritysRepo.findAll();
    }

    @Override
    public Securities addSecurities(Securities theS) {
        return itsSecuritysRepo.save( theS );
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

        if(thes.isPresent()) //iof the security isnt null
        {
            itsSecuritysRepo.delete(thes.get());
            result = true;
        }

        return  result;
    }



    @Override
    public Securities getSecuritiesById(int uniqueId)
    {
        return itsSecuritysRepo.findById(uniqueId).get();
    }

    @Override
    public Securities getSecuritiesByisin(String isinNum) {
        List<Securities> ss = itsSecuritysRepo.findAll();
//        System.out.println(books);
        int count = 0;
        int finalCount=0;
        for (Securities sec : ss) {
//            System.out.println(isinNum);
//            System.out.println(sec.getIsin());

            if (Objects.equals(sec.getIsin(),isinNum)){
//                System.out.println(sec.get(count));
                finalCount = count;


            }
            count += 1;

        }
//
        return ss.get(finalCount);
    }


    @Override
    public Securities getSecuritiesByCusip(String cusipNum) {
        List<Securities> ss = itsSecuritysRepo.findAll();
//        System.out.println(books);
        int count = 0;
        int finalCount=0;
        for (Securities sec : ss) {
//            System.out.println(isinNum);
//            System.out.println(sec.getIsin());

            if (Objects.equals(sec.getCusip(),cusipNum)){
//                System.out.println(sec.get(count));
                finalCount = count;


            }
            count += 1;

        }
//
        return ss.get(finalCount);
    }


    @Override
    public Securities getbyStatus(String stat) {
        List<Securities> ss = itsSecuritysRepo.findAll();
//        System.out.println(books);
        int count = 0;
        int finalCount=0;
        for (Securities sec : ss) {
//            System.out.println(isinNum);
//            System.out.println(sec.getIsin());

            if (Objects.equals(sec.getStatus(),stat)){
//                System.out.println(sec.get(count));
                finalCount = count;


            }
            count += 1;

        }
//
        return ss.get(finalCount);
    }

    @Override
    public Securities findByRecentAndNearMaturity(String today_date) {
        return null;
    }

//    @Override
//    public Securities findByRecentAndNearMaturity(String today_date) {
//        //being passed date string by user input
//        List<Securities> maturing = itsSecuritysRepo.findByRecentAndNearMaturity();
//        Dog dogToFind = new Dog();
//        dogToFind.setName(dogsName);
//        List<Dog> dogs = itsDogsRepo.findByName(dogToFind);
//    }
//
//



    @Override
    public Securities findDates(Securities start, Securities end) {
        return null;
    }
//
//    @Override
//    public Securities getSecuritiesByIDl(String UserEmail) {
//        return null;
//    }
//
//    @Override
//    public Securities updateUserDetails(Securities UserToUpdate) {
//        return null;
//    }
//
//
//
//    @Override
//    public long getNoOfSecuritys()
//    {
//        return itsSecuritysRepo.count();
//    }
//
//    @Override
//    public boolean removeSecurity(int uniqueId)
//    {
//        boolean result = false;
//
//        Optional<Securities> theSecurity = itsSecuritysRepo.findById(uniqueId);
//        //may have a null value
//
//        if(theSecurity.isPresent()) //iof the Security isnt null
//        {
//            itsSecuritysRepo.delete(theSecurity.get());
//            result = true;
//        }
//
//        return  result;
//    }

//    @Override
//    public Securities getSecurityById(int uniqueId)
//    {
//        return itsSecuritysRepo.findById(uniqueId).get();
//    }
//
////    @Override
////    public Securities getSecurityByName(String SecuritysName)
////    {
////
////
//////        //creates empty Security opject and assigns needed name
//////        SecurityToFind.setName(SecuritysName);
////        List<Security> Securitys = itsSecuritysRepo.findBySecurityName(SecurityToFind);
//        List<Securities> Securitys = itsSecuritysRepo.findAll();
////        System.out.println(Securitys);
//        int count = 0;
//        int finalCount=0;
//        for (Securities bb : Securitys) {
//            System.out.println(SecuritysName);
//            System.out.println(bb.getName());
//
//            if (Objects.equals(bb.getName(),SecuritysName)){
////                System.out.println(Securitys.get(count));
//                finalCount = count;
//
//
//            }
//            count += 1;
//
//        }
////        Security result = null;
//
////        Security result = null;
////
////        if( Securitys.size() == 1)
////            result = Securitys.get(0);
////            //if there is a boook that matches return it if not return nothing
//        return Securitys.get(finalCount);
//    }
//
//    @Override
//    public Securities updateSecurityDetails(Securities SecurityToUpdate)
//    {
//        return itsSecuritysRepo.save( SecurityToUpdate );
//    }

}