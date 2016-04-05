package page
import geb.Page

import javax.swing.Action

/**
 * Created by c07nw91fg1hw on 4/1/16.
 */
class TreeMapPage extends Page{
    static content = {
        login           {$('g[data-hasqtip="5"]')}
        home            {$('g[data-hasqtip="6"]')}
        productList     {$('g[data-hasqtip="8"]')}
        eventTracking   {$('div.event-tracking')}
    }

    public void clickLoginPageEvent(){
        waitFor {login.isDisplayed()}
        login.click()
        sleep(5000)
    }
}
