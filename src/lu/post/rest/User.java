package lu.post.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by fabien on 01.08.16.
 */

@XmlRootElement
public class User {
    public String name;
    public int age;
    public String adress;
    public String workplace;
}
