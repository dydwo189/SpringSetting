package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class,new CustomDateEditor(df,false));
//	}
	@GetMapping("/ex5")
	public String ex5(RedirectAttributes rttr) {
		log.info("ex5.............");
		//�����̷�Ʈ�� �� �� �ѹ��� �����ϴ� �Ķ���� 
		rttr.addFlashAttribute("result","SUCCESS");
		return "redirect:/sample/ex6";
	}
	
	@GetMapping("/ex6")
	public void ex6() {
		log.info("ex6.............");
	}
	@GetMapping("/ex4")
	public String ex4(SampleDTO dto, @ModelAttribute("page") int page, Model model) {
		log.info("ex4.............");
		log.info(dto);
		log.info(page);
		model.addAttribute("result", "SUCCESS");
		
		return "/sample/ex4";
	}
	@GetMapping("/ex3")
	public void ex3(TodoDTO todo) {
		log.info(todo);
	}
	
	@GetMapping("/ex3A")
	public void ex3A(TodoDTO todo) {
		log.info(todo);
	}
	
	@GetMapping("/ex1")
	public void doA(SampleDTO dto) {
		log.info(dto);
	}

	// ���� DTO�� �Ķ���͸� �ɾ��ִ� ���
	@GetMapping("/ex2")
	public void ex2(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info(name);
		log.info(age);
	}

	@GetMapping("/ex2Arr")
	public void ex2(@RequestParam("ids") String[] ids) {
		log.info(Arrays.deepToString(ids));
	}
	@RequestMapping(value="/ex2Bean", method= {RequestMethod.GET,RequestMethod.POST})
	//@GetMapping("/ex2Bean")
	public void ex2Bean(SampleDTOList list) {
		log.info(list);
	}

}
