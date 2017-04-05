/**
 * 
 */
package org.tool.ghb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tool.ghb.repo.CbtRepo;

/**
 * @author somphoho
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private CbtRepo cbtrepo;
	
	@RequestMapping("/home")
	public String index(){
		cbtrepo.findAll(new PageRequest(1, 20));
		return "list";
	}
}
