package com.example.application.views.main;

import com.vaadin.collaborationengine.UserInfo;
import com.vaadin.flow.server.VaadinServletRequest;
import com.vaadin.flow.spring.annotation.UIScope;

import org.springframework.stereotype.Component;

@Component
@UIScope
public class LocalUser extends UserInfo {
    LocalUser() {
        super(VaadinServletRequest.getCurrent().getRequest().getParameter("name"));
        setName(getId());
    }

}
