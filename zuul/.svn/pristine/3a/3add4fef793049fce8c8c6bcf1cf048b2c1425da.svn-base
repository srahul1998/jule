package com.zuul.stricar.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zuul.stricar.entity.UserDetlsEntity;

@FeignClient(name="stricar-app")
@RibbonClient(name="zuul-server")
public interface AuthenticationProxy {

	@GetMapping(value = "/user/get-user/{uname}")
	public UserDetlsEntity findByUname(@PathVariable(value="uname") String uname);
}
