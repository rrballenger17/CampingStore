package com.production.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NoParenthesisValidator
implements ConstraintValidator<NoParenthesis, CharSequence>
{
	@Override
	public void initialize(NoParenthesis annotation)
	{
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext context)
	{
		if(value instanceof String) {
			String trimmed = ((String) value).trim();
    
			if(trimmed.charAt(0) == '(' && trimmed.charAt(trimmed.length()-1) == ')') {
				return false;
			}
		}
		return true;
	}


}