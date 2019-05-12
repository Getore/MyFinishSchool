package com.bootdo.treatment.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.treatment.domain.TreatmentDO;
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

import com.bootdo.treatment.domain.TreatcontentDO;
import com.bootdo.treatment.service.TreatcontentService;
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
@RequestMapping("/treatment/treatcontent")
public class TreatcontentController {
	@Autowired
	private TreatcontentService treatcontentService;
	
	@GetMapping()
	@RequiresPermissions("treatment:treatcontent:treatcontent")
	String Treatcontent(){
	    return "treatment/treatcontent/treatcontent";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("treatment:treatcontent:treatcontent")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TreatmentDO> treatcontentList = treatcontentService.treatmentList(query);
		int total = treatcontentService.treatmentCount(query);
		PageUtils pageUtils = new PageUtils(treatcontentList, total);
		return pageUtils;
	}
	@GetMapping("/add")
	@RequiresPermissions("treatment:treatcontent:add")
	String add(){
	    return "treatment/treatcontent/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("treatment:treatcontent:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TreatcontentDO treatcontent = treatcontentService.get(id);
		model.addAttribute("treatcontent", treatcontent);
	    return "treatment/treatcontent/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("treatment:treatcontent:add")
	public R save( TreatcontentDO treatcontent){
		if(treatcontentService.save(treatcontent)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("treatment:treatcontent:edit")
	public R update( TreatcontentDO treatcontent){
		treatcontentService.update(treatcontent);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("treatment:treatcontent:remove")
	public R remove( Integer id){
		if(treatcontentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("treatment:treatcontent:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		treatcontentService.batchRemove(ids);
		return R.ok();
	}
	
}
