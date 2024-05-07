package com.lojadeconstrucao.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// annotation
@Controller
@RequestMapping("/c")
public class ClienteController {

	@GetMapping
	public String abreFrmCliente() {
		return "forms/formularioCliente";
	}
}
