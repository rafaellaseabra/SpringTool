package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Atividade01 {
	
	@GetMapping("/Compras")
	public String Compras() {
		return "Compras.html";
	}
	@GetMapping("/Vendas")
	public String Vendas() {
		return "Vendas.html";
	}
	@GetMapping("/Estoque")
	public String Estoque() {
		return "Estoque.html";
	}

}
