package com.zuul.stricar;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zuul.stricar.entity.UserDetlsEntity;

//@Service
//@FeignClient(name = "STRICAR-APP",url="http://localhost:8200/registration/uname/{uname}")
public interface FeignClientService {

//	@GetMapping
//	public UserDetlsEntity findbyNAME(@PathVariable("uname")String uname);
}
