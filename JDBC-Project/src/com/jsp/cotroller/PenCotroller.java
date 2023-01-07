package com.jsp.cotroller;

import com.jsp.dao.PenDao;

import com.jsp.dto.PenDto;

public class PenCotroller{
	
	public static void main(String[] args) {
		
		PenDto pendto = new PenDto();
		pendto.setPenid(2);
		pendto.setName("sparker");
		pendto.setBrand("camline");
		pendto.setPrice(10);
		
		PenDao pendao=new PenDao();
		
		pendao.updatePen(pendto);
		pendao.savePen(pendto);
	}

}
