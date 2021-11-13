package com.itmayidu.test03.mapper;

import com.itmayidu.entity.Ewallet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EwalletMapper {

    @Insert("insert into ewallet(uid,amount,other_card_fee) values(#{uid},#{amount},#{other_card_fee})")
    int insert(@Param("uid") String uid, @Param("amount") Double amount, @Param("other_card_fee") Double otherCrdFee);

    @Update("update ewallet set amount=#{amount},other_card_fee=#{other_card_fee} where id=#{id}")
    int update(@Param("id") Integer id,@Param("uid") String uid, @Param("amount") Double amount, @Param("other_card_fee") Double otherCrdFee);

    @Select("select * from ewallet order by id")
    List<Ewallet> getAll();

}
