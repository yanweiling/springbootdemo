package com.windsound.project.controller;

import com.windsound.project.controller.base.BaseController;
import com.windsound.project.entity.db1.User;
import com.windsound.project.entity.db2.Word;
import com.windsound.project.service.db1.IUserService;
import com.windsound.project.service.db2.IWordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 微信用户 信息操作处理
 * 
 * @author admin
 * @date 2019-12-30
 */
@Controller
@RequestMapping("/user")
@Api(value = "接口demo")
public class UserController extends BaseController
{
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IWordService wordService;
	
	/**
	 * 查询微信用户列表
	 */
	@GetMapping("/getUser/{userId}")
	@ResponseBody
	@ApiOperation(value = "获取用户信息", notes = "通过用户ID获取用户信息")
	public String list(@ApiParam(value = "用户id") @PathVariable String userId)
	{
       User user=userService.selectUserById(userId);
       return user.toString();
	}

	@GetMapping("getWord/{id}")
	@ResponseBody
	public String getWord(){
		Word word=wordService.selectWordById(1l);
		return word.toString();
	}

	@GetMapping("/saveWord")
	@ResponseBody
	public Integer inserstWord(){
		Word word=new Word();
		word.setWordContent("测试事务");
		word.setCreatTime(new Date());
		return wordService.insertWord(word);
	}
	




	
}
