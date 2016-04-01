package page
import geb.Page

import javax.swing.Action

/**
 * Created by c07nw91fg1hw on 4/1/16.
 */
class TreeMapPage extends Page{
    static content = {
        login       {$('rect[fill="#055570"]')}
        home        {$('rect[width="171"]')}
        productList {$('rect[width="263"]')}
    }

    void clickLoginPageEvent(){
        waitFor {login.isDisplayed()}
        login.click()
        sleep(5000)
    }
}
