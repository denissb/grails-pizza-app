class BootStrap {

    def init = { servletContext ->
        new pizza.backend.Pizza(id: 1, name:"Lightness", kind:"other", image: "http://s8.postimg.org/dwh0vglfp/vegetarian.jpg", info:"Red caviar, chese, mayonaisse, sesam, tomatoe sauce", price:0.1).save()
        new pizza.backend.Pizza(id: 2, name:"Barbarians", kind:"other", image: "http://s8.postimg.org/sw4s5kcxx/ham2.jpg", info:"Mushrooms, ham, checken, mayonaisse, potatoe bits", price:0.1).save()
        new pizza.backend.Pizza(id: 3, name:"Dinner", kind:"beef", image: "http://s8.postimg.org/okg6gk611/chicken2.png", info:"Bacon bits, mayo, chese, tomato sauce", price:0.08).save()
        new pizza.backend.Pizza(id: 4, name:"Spring delight", kind:"chicken", image: "http://s8.postimg.org/hrftkaf7p/chicken3.png", info:"Somoked chicken bits, basilik, chese, mayonnaisse, corn", price:0.09).save()
        new pizza.backend.Pizza(id: 5, name:"Curry surprise", kind:"ham", image: "http://s8.postimg.org/74qlslwg5/pork2.jpg", info:"Olives, onions, ham slices, chese, curry seasoning", price:0.08).save()
        new pizza.backend.Pizza(id: 6, name:"Gourmet", kind:"ham", image: "http://s8.postimg.org/q8jx8y9ad/pork.jpg", info:"Juicy ham pieces, chese, chilli peppers, tomatoes, dill seasoning", price:0.1).save()
        new pizza.backend.Pizza(id: 7, name:"Natural chilli", kind:"vegetarian", image: "http://s8.postimg.org/okg6gk611/chicken2.png", info:"Chilli peppers, tomatoes, olives, mushrooms, chese", price:0.07).save()
        new pizza.backend.Pizza(id: 8, name:"Agular ham", kind:"vegetarian", image: "http://s8.postimg.org/j03p5x75x/ham3.jpg", info:"Ham, chese, mazarella chese, tomato souce", price:0.09).save()
        new pizza.backend.Pizza(id: 9, name:"Adventurers", kind:"beef", image: "http://s8.postimg.org/qjws7z0cl/kolay.jpg", info:"Champignon mushrooms, salami, chese, olives", price:0.07).save()
        new pizza.backend.Pizza(id: 10, name:"Hevanly ham", kind:"ham", image: "http://s8.postimg.org/wm4eygosl/ham.jpg", info:"Smoked ham, mazarella chese, sesam leaves, cherry tomatoes", price:0.09).save()
        new pizza.backend.Pizza(id: 11, name:"Gardners", kind:"vegetarian", image: "http://s8.postimg.org/u7cje18jp/gardners.jpg", info:"Olives, paprica, tomatoes and cheeses and mayo", price:0.07).save()
        new pizza.backend.Pizza(id: 12, name:"Sunrise", kind:"chicken", image: "http://s8.postimg.org/kcle7t4lh/chicken.jpg", info:"Chicken pizza with onions, dill and garclic seasoning", price:0.08).save()
		
		new pizza.backend.Kind(id: 1, name:"ham").save()
		new pizza.backend.Kind(id: 2, name:"beef").save()
		new pizza.backend.Kind(id: 3, name:"chicken").save()
		new pizza.backend.Kind(id: 4, name:"vegetarian").save()
		new pizza.backend.Kind(id: 5, name:"other").save()
    }
    def destroy = {
    }
}
