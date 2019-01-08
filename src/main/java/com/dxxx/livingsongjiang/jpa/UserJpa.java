package com.dxxx.livingsongjiang.jpa;

import com.dxxx.livingsongjiang.model.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface UserJpa extends JpaRepository<UserBean,Integer>,JpaSpecificationExecutor<UserBean>,Serializable {
    @Query(value = "SELECT COUNT(*) FROM userinfo WHERE  u_userName=?1 ", nativeQuery = true)
    int  boolIsExist(String phone);

    //  @Query(value = "SELECT * FROM userinfo WHERE  u_userName=?1 AND u_pwd=?2 ", nativeQuery = true)
    @Query(value = "SELECT * FROM userinfo WHERE  u_userName=?1 ", nativeQuery = true)
  List<UserBean>  findByPhone(String phone);
}
