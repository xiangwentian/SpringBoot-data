package com.itmayidu.Controller;

import com.itmayidu.entity.Ewallet;
import com.itmayidu.test03.service.MutilUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MutilTestController {
    @Autowired
    private MutilUpdateService mutilUpdateService;

    @RequestMapping("/insertEwallet")
    public Integer insertEwallet(String uid, Double amount, Double otherCrdFee) {

        for (int i = 0; i < 40000; i++) {
            mutilUpdateService.insertEwallet(String.valueOf(i), 0.5, null);
        }
        return 1;
    }

//    @Transactional(transactionManager = "test3TransactionManager")
    @RequestMapping("/updateEwallet")
    public Integer updateEwallet(String uid, Double amount) {
        Double otherCrdFee = null;

        List<Ewallet> ewalletList = mutilUpdateService.getAllEwallet();
        BigDecimal bignum1 = new BigDecimal("10");
        BigDecimal bignum2 = new BigDecimal("5");
        BigDecimal bignum3 = bignum1.add(bignum2);

        for (Ewallet ewallet : ewalletList) {
            if (ewallet.getId() % 1000 == 0) {
                otherCrdFee = bignum3.doubleValue();
            } else {
                otherCrdFee = null;
            }

            System.out.println("ewallet.getId--->>>" + ewallet.getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Integer result =  mutilUpdateService.updateEwallet(ewallet.getId(), ewallet.getUid(), amount, otherCrdFee);
            System.out.println("update result--->>>"+result);
        }
        return 1;
    }
}
