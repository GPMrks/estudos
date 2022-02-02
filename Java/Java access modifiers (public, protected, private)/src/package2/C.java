package package2;
import package1.*;

public class C {

    public String publicMessage = "This is public"; // can be accessed from every class inside the project
    protected String protectedMessage = "This is protected"; // only sub classes
            String defaultMessage = "This is the default."; // only within the package
    private String privateMessage = "This is private."; // only within the class

}
