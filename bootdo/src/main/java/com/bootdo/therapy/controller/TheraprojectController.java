package com.bootdo.therapy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.common.config.Constant;
import com.bootdo.common.domain.Tree;
import com.bootdo.system.domain.DeptDO;
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
	private String prefix = "therapy/theraproject";		// treeTable

	@Autowired
	private TheraprojectService theraprojectService;
	
	@GetMapping()
	@RequiresPermissions("therapy:theraproject:theraproject")
	String Theraproject(){
	    return "therapy/theraproject/theraproject";
	}

	@ApiOperation(value="获取治法名称列表", notes="")	// treeTable
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("therapy:theraproject:theraproject")
	public List<TheraprojectDO> list(@RequestParam(value = "nametpUnit") String nametpUnit){
		Map<String, Object> query = new HashMap<>(16);
		List<TheraprojectDO> theraprojectDOS;

		if (nametpUnit != null && nametpUnit != ""){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("nametpUnit", nametpUnit);

			theraprojectDOS = theraprojectService.list(map);
		} else {
			theraprojectDOS = theraprojectService.list(query);
		}
		return theraprojectDOS;
	}
	
	@GetMapping("/add/{parentId}")
	@RequiresPermissions("therapy:theraproject:add")
	String add(@PathVariable("parentId") String parentId, Model model){
		model.addAttribute("parentId", parentId);

		// 获取上级治法名称，只读显示模式
		if (parentId == "undefined" || parentId == "0") {
			model.addAttribute("pName", "一级治法");
		} else {
			model.addAttribute("pName", theraprojectService.getPId(parentId).getNametp());
		}

	    return "therapy/theraproject/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("therapy:theraproject:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TheraprojectDO theraproject = theraprojectService.get(id);
		model.addAttribute("theraproject", theraproject);
		if(Constant.THERAPY_ROOT_ID.equals(theraproject.getParentId())) {
			model.addAttribute("nametp", "0");	//TODO 可能是nametp
		}else {
			TheraprojectDO parTheraproject = theraprojectService.getPId(theraproject.getParentId());
			model.addAttribute("nametp", parTheraproject.getNametp());		//TODO 可能是nametp
		}
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

	@GetMapping("/tree")
	@ResponseBody
	public Tree<TheraprojectDO> tree() {
		Tree<TheraprojectDO> tree = new Tree<TheraprojectDO>();
		tree = theraprojectService.getTree();
		return tree;
	}

	@GetMapping("/treeView")
	String treeView() {
		return  prefix + "/theraprojectTree";
	}

}
