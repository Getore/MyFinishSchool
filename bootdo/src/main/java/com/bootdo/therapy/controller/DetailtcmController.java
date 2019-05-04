package com.bootdo.therapy.controller;

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

import com.bootdo.therapy.domain.DetailtcmDO;
import com.bootdo.therapy.service.DetailtcmService;
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
@RequestMapping("/therapy/detailtcm")
public class DetailtcmController {
	@Autowired
	private DetailtcmService detailtcmService;
	
	@GetMapping()
	@RequiresPermissions("therapy:detailtcm:detailtcm")
	String Detailtcm(){
	    return "therapy/detailtcm/detailtcm";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("therapy:detailtcm:detailtcm")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DetailtcmDO> detailtcmList = detailtcmService.list(query);
		int total = detailtcmService.count(query);
		PageUtils pageUtils = new PageUtils(detailtcmList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("therapy:detailtcm:add")
	String add(){
	    return "therapy/detailtcm/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("therapy:detailtcm:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		DetailtcmDO detailtcm = detailtcmService.get(id);
		model.addAttribute("detailtcm", detailtcm);
	    return "therapy/detailtcm/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("therapy:detailtcm:add")
	public R save( DetailtcmDO detailtcm){
		if(detailtcmService.save(detailtcm)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("therapy:detailtcm:edit")
	public R update( DetailtcmDO detailtcm){
		detailtcmService.update(detailtcm);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("therapy:detailtcm:remove")
	public R remove( Integer id){
		if(detailtcmService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("therapy:detailtcm:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		detailtcmService.batchRemove(ids);
		return R.ok();
	}
	
}
