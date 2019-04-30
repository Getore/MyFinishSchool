package com.bootdo.treatment.controller;

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

import com.bootdo.treatment.domain.TreatprojectDO;
import com.bootdo.treatment.service.TreatprojectService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-30 11:29:39
 */
 
@Controller
@RequestMapping("/treatment/treatproject")
public class TreatprojectController {
	@Autowired
	private TreatprojectService treatprojectService;
	
	@GetMapping()
	@RequiresPermissions("treatment:treatproject:treatproject")
	String Treatproject(){
	    return "treatment/treatproject/treatproject";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("treatment:treatproject:treatproject")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TreatprojectDO> treatprojectList = treatprojectService.list(query);
		int total = treatprojectService.count(query);
		PageUtils pageUtils = new PageUtils(treatprojectList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("treatment:treatproject:add")
	String add(){
	    return "treatment/treatproject/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("treatment:treatproject:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TreatprojectDO treatproject = treatprojectService.get(id);
		model.addAttribute("treatproject", treatproject);
	    return "treatment/treatproject/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("treatment:treatproject:add")
	public R save( TreatprojectDO treatproject){
		if(treatprojectService.save(treatproject)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("treatment:treatproject:edit")
	public R update( TreatprojectDO treatproject){
		treatprojectService.update(treatproject);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("treatment:treatproject:remove")
	public R remove( Integer id){
		if(treatprojectService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("treatment:treatproject:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		treatprojectService.batchRemove(ids);
		return R.ok();
	}
	
}
