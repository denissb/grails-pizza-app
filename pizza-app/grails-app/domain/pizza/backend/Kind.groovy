package pizza.backend

import grails.rest.Resource
    
@Resource(uri='/kind', formats=['json'])
class Kind {
    
    Integer id
    String name

    static constraints = {
        name blank:false
    }
}
