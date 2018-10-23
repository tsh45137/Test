package com.xingfang.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xingfang.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/getNodesForBigData")
	@ResponseBody
	public ArrayList<Student> getNodesForBigData(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i=11;i<=20;i++){
			for(int j=0; j<10;j++){
				if(j<=2){
					list.add(new Student(i*(j+1)+j+"","1","name"+i+j,true));
				}else if(j>=3 && j<=6){
					list.add(new Student(i*(j+1)+j+"","2","name"+i+j,true));
				}else{
					list.add(new Student(i*(j+1)+j+"","3","name"+i+j,true));
				}
			}
		}
		/*for(int i=21;i<=30;i++){
			for(int j=0; j<10;j++){
				if(j<=2){
					list.add(new Student(i*(j+1)+j+"","11","name"+i+j));
				}else if(j>=3 && j<=6){
					list.add(new Student(i*(j+1)+j+"","12","name"+i+j));
				}else{
					list.add(new Student(i*(j+1)+j+"","24","name"+i+j));
				}
			}
		}*/
		
		return list;
	}
}
