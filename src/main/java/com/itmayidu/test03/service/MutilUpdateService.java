package com.itmayidu.test03.service;

import com.itmayidu.entity.Ewallet;
import com.itmayidu.test03.mapper.EwalletMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MutilUpdateService {
    @Autowired
    private EwalletMapper ewalletMapper;

    @Transactional(transactionManager = "test3TransactionManager")
    public int insertEwallet(String uid, Double amount, Double otherCrdFee) {
        int insertUserResult = ewalletMapper.insert(uid, amount, otherCrdFee);
        System.out.println(insertUserResult + "");
        return insertUserResult;
    }

    public int updateEwallet(Integer id, String uid, Double amount, Double otherCrdFee) {
        int updateEwalletResult = ewalletMapper.update(id, uid, amount, otherCrdFee);
        System.out.println(updateEwalletResult + "");
        return updateEwalletResult;
    }

    public List<Ewallet> getAllEwallet(){
        List<Ewallet> ewallet = ewalletMapper.getAll();
        return ewallet;
    }
}
