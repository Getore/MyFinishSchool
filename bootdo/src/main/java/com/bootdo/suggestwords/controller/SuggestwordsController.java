package com.bootdo.suggestwords.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.suggestwords.domain.SuggestwordsDO;
import com.bootdo.suggestwords.service.SuggestwordsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:33
 */
 
@Controller
@RequestMapping("/suggestwords/suggestwords")
public class SuggestwordsController {
	@Autowired
	private SuggestwordsService suggestwordsService;
	
	@GetMapping()
	@RequiresPermissions("suggestwords:suggestwords:suggestwords")
	String Suggestwords(){
	    return "suggestwords/suggestwords/suggestwords";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("suggestwords:suggestwords:suggestwords")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SuggestwordsDO> suggestwordsList = suggestwordsService.list(query);
		int total = suggestwordsService.count(query);
		PageUtils pageUtils = new PageUtils(suggestwordsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("suggestwords:suggestwords:add")
	String add(){
	    return "suggestwords/suggestwords/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("suggestwords:suggestwords:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		SuggestwordsDO suggestwords = suggestwordsService.get(id);
		model.addAttribute("suggestwords", suggestwords);
	    return "suggestwords/suggestwords/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("suggestwords:suggestwords:add")
	public R save( SuggestwordsDO suggestwords){
		if(suggestwordsService.save(suggestwords)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("suggestwords:suggestwords:edit")
	public R update( SuggestwordsDO suggestwords){
		suggestwordsService.update(suggestwords);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("suggestwords:suggestwords:remove")
	public R remove( Integer id){
		if(suggestwordsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("suggestwords:suggestwords:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		suggestwordsService.batchRemove(ids);
		return R.ok();
	}
	
}
