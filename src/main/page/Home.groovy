package page;
import geb.Page
import groovy.util.logging.Slf4j
import module.*

/**
 * Created by c07nw91fg1hw on 3/28/16.
 */
public class Home extends Page{
    static url = {"https://github.com"}

    static content = {
        titlePage                {$('h2.shelf-title')}
        letsGetStartedBtn        {$('a.btn.btn-primary.shelf-cta')}
        viewProfileDropDownBtn   {$('a.header-nav-link.name.tooltipped.tooltipped-sw.js-menu-target')}
        signOutBtn               {$('button.dropdown-item.dropdown-signout')}
        yourProfileBtn           {$('a.dropdown-item').eq(2)}
        howPeopleTxt             {$('h1.display-heading-1.jumbotron-title')}
    }
}
