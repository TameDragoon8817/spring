package org.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {
    public String name1 = "张三";

    @Value("张三")
    public String name;
}
