package hu.bme.onlab.user.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.bme.onlab.user.bean.CheckEmailRequest;
import hu.bme.onlab.user.bean.CheckEmailResponse;
import hu.bme.onlab.user.bean.PasswordChangeRequest;
import hu.bme.onlab.user.bean.SignupRequest;
import hu.bme.onlab.user.bean.UserManagementPreloadReply;
import hu.bme.onlab.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(path = "/user")
	public Principal user(Principal user) {
		if(user == null) {
			return new UsernamePasswordAuthenticationToken(null, null);
		}
		
		return user;
	}
	
	@RequestMapping(path = "/checklogin")
	public Principal checkLogin() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			return (Principal) authentication.getPrincipal();
		} else {
			return null;
		}
	}
	
	@RequestMapping(path = "/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
	}
	
	@RequestMapping(path = "/signup", method = RequestMethod.POST)
	public void signup(@RequestBody SignupRequest signupRequest) {
		userService.signup(signupRequest);
	}
	
	@RequestMapping(path = "/checkEmail", method = RequestMethod.POST)
	public CheckEmailResponse checkEmail(@RequestBody CheckEmailRequest checkEmailRequest) {
		return userService.checkEmail(checkEmailRequest);
	}
	
	@RequestMapping(path = "/changePassword", method = RequestMethod.POST)
	public void changePassword(@RequestBody PasswordChangeRequest passwordChangeRequest) {
		userService.changePassword(SecurityContextHolder.getContext().getAuthentication().getName(), passwordChangeRequest);
	}
	
	@RequestMapping(path = "/usermanagementpreload")
	public UserManagementPreloadReply userManagementPreload() {
		UserManagementPreloadReply reply =  new UserManagementPreloadReply();
		reply.setRoles(userService.getRoles());
		return reply;
	}
}
