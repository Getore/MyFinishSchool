package com.bootdo.therapy.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.therapy.domain.TherapyDO;
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

import com.bootdo.therapy.domain.TheracontentDO;
import com.bootdo.therapy.service.TheracontentService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-04 22:46:36
 */
 
@Controller
@RequestMapping("/therapy/theracontent")
public class TheracontentController {
	@Autowired
	private TheracontentService theracontentService;
	
	@GetMapping()
	@RequiresPermissions("therapy:theracontent:theracontent")
	String Theracontent(){
	    return "therapy/theracontent/theracontent";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("therapy:theracontent:theracontent")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TherapyDO> theracontentList = theracontentService.therapyList(query);
		int total = theracontentService.therapyCount(query);
		PageUtils pageUtils = new PageUtils(theracontentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("therapy:theracontent:add")
	String add(){
	    return "therapy/theracontent/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("therapy:theracontent:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TheracontentDO theracontent = theracontentService.get(id);
		model.addAttribute("theracontent", theracontent);
	    return "therapy/theracontent/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("therapy:theracontent:add")
	public R save( TheracontentDO theracontent){
		if(theracontentService.save(theracontent)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("therapy:theracontent:edit")
	public R update( TheracontentDO theracontent){
		theracontentService.update(theracontent);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("therapy:theracontent:remove")
	public R remove( Integer id){
		if(theracontentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("therapy:theracontent:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		theracontentService.batchRemove(ids);
		return R.ok();
	}
	
}
