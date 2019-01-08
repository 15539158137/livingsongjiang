package com.dxxx.livingsongjiang.jpa;

import com.dxxx.livingsongjiang.model.SanHuBean;
import com.dxxx.livingsongjiang.model.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface SanHuJpa extends JpaRepository<SanHuBean,Integer>,JpaSpecificationExecutor<SanHuBean>,Serializable {

}

