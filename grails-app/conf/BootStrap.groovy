class BootStrap {

    def init = { servletContext ->
        new pizza.backend.Pizza(id: 1, name:"Peperonni", kind:"ham", image: "http://tntpizzeria.com/images/pizza%20copy.png", info:"Some info about the pizza", price:00.11).save()
        new pizza.backend.Pizza(id: 2, name:"Chilli", kind:"other", image: "http://web-images.chacha.com/images/Quiz/1397/which-pizza-topping-are-you-jul-17-2013-1-600x400.jpg", info:"Some info about the pizza", price:00.10).save() 
    }
    def destroy = {
    }
}
