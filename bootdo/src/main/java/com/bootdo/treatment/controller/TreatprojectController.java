package com.bootdo.treatment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.common.domain.Tree;
import com.bootdo.therapy.domain.TheraprojectDO;
import io.swagger.annotations.ApiOperation;
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

	private String prefix = "/treatment/treatproject";

	@Autowired
	private TreatprojectService treatprojectService;
	
	@GetMapping()
	@RequiresPermissions("treatment:treatproject:treatproject")
	String Treatproject(){
	    return "treatment/treatproject/treatproject";
	}

	@ApiOperation(value="获取治则名称列表", notes="")	// treeTable
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("treatment:treatproject:treatproject")
	public List<TreatprojectDO> list(@RequestParam(value = "title") String title,
									 @RequestParam(value = "parentId") String parentId,
									 @RequestParam(value = "titleUnit") String titleUnit){
		//查询列表数据
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("parentId", parentId);
		map.put("titleUnit", titleUnit);

		List<TreatprojectDO> treatprojectList = treatprojectService.list(map);


		return treatprojectList;
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

	@GetMapping("/tree")
	@ResponseBody
	public Tree<TreatprojectDO> tree() {
		Tree<TreatprojectDO> tree = new Tree<TreatprojectDO>();
		tree = treatprojectService.getTree();
		return tree;
	}

	@GetMapping("/treeView")
	String treeView() {
		return  prefix + "/treatprojectTree";
	}
	
}
