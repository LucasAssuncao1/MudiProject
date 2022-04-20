package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public  String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNome("Smartphone Xiaomi Redmi Note 8 (2021)");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61KO-IzRKYL._AC_SL1280_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-Neptune/dp/B097HRZK9N/ref=sr_1_3?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2QMMNLEN3QTLS&keywords=redmi+note+8&qid=1650458409&sprefix=redmi+note+8%2Caps%2C413&sr=8-3&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		pedido.setDescricao("uma descrição qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
