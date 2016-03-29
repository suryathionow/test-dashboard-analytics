package page;
import geb.Page
import groovy.util.logging.Slf4j
import module.*

/**
 * Created by c07nw91fg1hw on 3/28/16.
 */
public class LoginPage extends Page{
//   static url = {"https://github.com"}

    static content = {
        loginModule     {module LoginModule}
    }
}
