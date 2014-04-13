package pizza.backend

import grails.rest.Resource
    
@Resource(uri='/pizza', formats=['json'])
class Pizza {
    
    Integer id
    String name
    String kind
    String image
    String info
    Double price

    static constraints = {
        name blank:false
        price blank:false
    }
}
