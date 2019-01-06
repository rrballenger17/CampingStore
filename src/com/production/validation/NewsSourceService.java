package com.production.validation;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;




@Validated
public interface NewsSourceService
{
    public void saveNewsSource(
            @NotNull(message = "{validate.saveNewsSource}")
            @Valid NewsSource newsSource
    );

    public List<NewsSource> getAllNewsSources();
}
