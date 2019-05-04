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

import com.bootdo.therapy.domain.TheraprojectDO;
import com.bootdo.therapy.service.TheraprojectService;
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
@RequestMapping("/therapy/theraproject")
public class TheraprojectController {
	@Autowired
	private TheraprojectService theraprojectService;
	
	@GetMapping()
	@RequiresPermissions("therapy:theraproject:theraproject")
	String Theraproject(){
	    return "therapy/theraproject/theraproject";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("therapy:theraproject:theraproject")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TheraprojectDO> theraprojectList = theraprojectService.list(query);
		int total = theraprojectService.count(query);
		PageUtils pageUtils = new PageUtils(theraprojectList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("therapy:theraproject:add")
	String add(){
	    return "therapy/theraproject/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("therapy:theraproject:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TheraprojectDO theraproject = theraprojectService.get(id);
		model.addAttribute("theraproject", theraproject);
	    return "therapy/theraproject/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("therapy:theraproject:add")
	public R save( TheraprojectDO theraproject){
		if(theraprojectService.save(theraproject)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("therapy:theraproject:edit")
	public R update( TheraprojectDO theraproject){
		theraprojectService.update(theraproject);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("therapy:theraproject:remove")
	public R remove( Integer id){
		if(theraprojectService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("therapy:theraproject:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		theraprojectService.batchRemove(ids);
		return R.ok();
	}
	
}
