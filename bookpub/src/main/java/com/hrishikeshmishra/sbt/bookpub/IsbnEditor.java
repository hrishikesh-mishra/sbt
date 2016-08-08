package com.hrishikeshmishra.sbt.bookpub;

import com.hrishikeshmishra.sbt.bookpub.entities.Isbn;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.util.Objects;

/**
 * Created by hrishikesh.mishra on 08/08/16.
 */
public class IsbnEditor extends PropertyEditorSupport {


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if(StringUtils.hasText(text)) setValue(new Isbn(text.trim()));
        else setValue(null);
    }

    @Override
    public String getAsText() {
        Isbn isbn = (Isbn) getValue();
        if(Objects.isNull(isbn)) return isbn.getIsbn();
        else return  "";
    }





}
