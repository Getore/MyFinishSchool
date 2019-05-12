package com.bootdo.stopwords.controller;

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

import com.bootdo.stopwords.domain.StopwordsDO;
import com.bootdo.stopwords.service.StopwordsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:29:42
 */
 
@Controller
@RequestMapping("/stopwords/stopwords")
public class StopwordsController {
	@Autowired
	private StopwordsService stopwordsService;
	
	@GetMapping()
	@RequiresPermissions("stopwords:stopwords:stopwords")
	String Stopwords(){
	    return "stopwords/stopwords/stopwords";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("stopwords:stopwords:stopwords")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StopwordsDO> stopwordsList = stopwordsService.list(query);
		int total = stopwordsService.count(query);
		PageUtils pageUtils = new PageUtils(stopwordsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("stopwords:stopwords:add")
	String add(){
	    return "stopwords/stopwords/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("stopwords:stopwords:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		StopwordsDO stopwords = stopwordsService.get(id);
		model.addAttribute("stopwords", stopwords);
	    return "stopwords/stopwords/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("stopwords:stopwords:add")
	public R save( StopwordsDO stopwords){
		if(stopwordsService.save(stopwords)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("stopwords:stopwords:edit")
	public R update( StopwordsDO stopwords){
		stopwordsService.update(stopwords);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("stopwords:stopwords:remove")
	public R remove( Integer id){
		if(stopwordsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("stopwords:stopwords:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		stopwordsService.batchRemove(ids);
		return R.ok();
	}
	
}
