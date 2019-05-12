package com.bootdo.synonymwords.controller;

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

import com.bootdo.synonymwords.domain.SynonymwordsDO;
import com.bootdo.synonymwords.service.SynonymwordsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:57
 */
 
@Controller
@RequestMapping("/synonymwords/synonymwords")
public class SynonymwordsController {
	@Autowired
	private SynonymwordsService synonymwordsService;
	
	@GetMapping()
	@RequiresPermissions("synonymwords:synonymwords:synonymwords")
	String Synonymwords(){
	    return "synonymwords/synonymwords/synonymwords";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("synonymwords:synonymwords:synonymwords")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SynonymwordsDO> synonymwordsList = synonymwordsService.list(query);
		int total = synonymwordsService.count(query);
		PageUtils pageUtils = new PageUtils(synonymwordsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("synonymwords:synonymwords:add")
	String add(){
	    return "synonymwords/synonymwords/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("synonymwords:synonymwords:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		SynonymwordsDO synonymwords = synonymwordsService.get(id);
		model.addAttribute("synonymwords", synonymwords);
	    return "synonymwords/synonymwords/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("synonymwords:synonymwords:add")
	public R save( SynonymwordsDO synonymwords){
		if(synonymwordsService.save(synonymwords)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("synonymwords:synonymwords:edit")
	public R update( SynonymwordsDO synonymwords){
		synonymwordsService.update(synonymwords);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("synonymwords:synonymwords:remove")
	public R remove( Integer id){
		if(synonymwordsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("synonymwords:synonymwords:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		synonymwordsService.batchRemove(ids);
		return R.ok();
	}
	
}
