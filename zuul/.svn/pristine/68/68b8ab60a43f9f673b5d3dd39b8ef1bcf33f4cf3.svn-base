package com.zuul.stricar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zuul.stricar.entity.UserDetlsEntity;
import com.zuul.stricar.entity.UserPrinciple;
import com.zuul.stricar.proxy.AuthenticationProxy;

@Service
public class AdminUserDetailsServiceImpl implements UserDetailsService {

	/*
	 * @Autowired private UserDetailsRepo staffuserdao;
	 */

	@Autowired
	private AuthenticationProxy authProxy;

	@Override

	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		String methodName = "loadUserByUsername";

		UserDetlsEntity user = null;
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		// checking user exists
		if (StringUtils.isNotBlank(emailId)) {

			user = authProxy.findByUname(emailId);
			// System.out.println(authProxy.findByUname(emailId) + "email");

			if (user == null) {
				throw new UsernameNotFoundException(String.format("User with emailId:%s not exist", emailId));
			}
			grantedAuthorities = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRole_name()))
					.collect(Collectors.toList());

			// set user session id
			String sessionId = getSessionId();
			ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
			HttpServletRequest request = attr.getRequest();
			HttpSession session = request.getSession();

		} else {
			throw new UsernameNotFoundException("User emailId required!");
		}

		return new UserPrinciple(String.valueOf(user.getUid()), user.getUname(), user.getUname(), user.getEmail(),
				user.getPassword(), grantedAuthorities);
	}

	private static String getSessionId() {
		return RandomStringUtils.randomAlphanumeric(13);
	}
}