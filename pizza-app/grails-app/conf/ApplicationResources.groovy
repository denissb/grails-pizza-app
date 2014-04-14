modules = {

    app {
        dependsOn 'angular, angularRoute, angularResource, bootstrap'
        resource url: 'css/app.css'
        resource url: 'js/app.js'
        resource url: 'js/services.js'
        resource url: 'js/controllers.js'
        resource url: 'js/filters.js'
        resource url: 'js/directives.js'
    }

    bootstrap {
        resource url: 'css/bootstrap.min.css'
    }

    angular {
        resource id: 'js', url: [dir: 'js/lib/angular', file: "angular.js"], nominify: true
    }
    
    angularRoute {
        dependsOn 'angular'
        resource id: 'js', url: [dir: 'js/lib/angular', file: "angular-route.js"], nominify: true
    }

    angularResource {
        dependsOn 'angularRoute'
        resource id: 'js', url: [dir: 'js/lib/angular', file: "angular-resource.js"], nominify: true
    }
    
}