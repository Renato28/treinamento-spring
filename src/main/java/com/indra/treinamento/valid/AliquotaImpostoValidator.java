package com.indra.treinamento.valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.indra.treinamento.dto.ProdutoRequest;

@Component
public class AliquotaImpostoValidator {

	public boolean supports(Class<?> clazz) {
		return ProdutoRequest.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		var request = (ProdutoRequest) target;
		
		if(request.getTipoTributacao().aliquotaInvalida(request.getAliquotaImposto()))
			errors.rejectValue("aliquotaImposto", null, "Aliquota imposto invalida");
	}
}
