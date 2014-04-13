'use strict';

/* Controllers */

angular.module('pizzaApp.controllers', [])
    .controller('ViewCtrl', ['$scope', '$rootScope', 'kinds', 'Pizza', 'OrderItem', 'Cart',
        function ($scope, $rootScope, kinds, Pizza, OrderItem, Cart) {
            $rootScope.activeTab = 'pizzas';

            if (!$rootScope.pizzas) {
                $rootScope.pizzas = [];
            }

            if (!$rootScope.cart) {
                $rootScope.cart = Cart.init();
            }

            $rootScope.pizzas = Pizza.query();

            $scope.kinds = kinds;
            $scope.kind = kinds[0];

            $scope.add = function (entry) {

                var entry = OrderItem.create(
                    entry.id,
                    entry.name,
                    entry.price
                );

                var firstOne = false;
				
                for (var i = 0; i < $rootScope.cart.items.length; i++) {
                    if ($rootScope.cart.items[i].id == entry.id) {
                        $rootScope.cart.items[i].qty++;
                        $rootScope.cart.items[i].price += entry.price;
                        $rootScope.cart.total += entry.price;
                        firstOne = true;
                        return;
                    }
                }

                if (!firstOne) {
                    $rootScope.cart.items.push(entry);
                    $rootScope.cart.total += $rootScope.cart.items[i].price;
                }
            };

            $scope.remove = function (item) {
                var i = $rootScope.cart.items.indexOf(item);
                if (item.qty > 1) {
                    var price = item.price/item.qty
                    $rootScope.cart.items[i].price -= price;
                    $rootScope.cart.items[i].qty--;
                    $rootScope.cart.total -= price;
                } else {
                    $rootScope.cart.items.splice(i, 1);
                    $rootScope.cart.total -= item.price;
                }

            }
        }
    ])
    .controller('AddCtrl', ['$scope', '$rootScope', 'kinds', 'Pizza',
        function ($scope, $rootScope, kinds, Pizza) {
            $rootScope.activeTab = 'add-pizza';
            if (!$rootScope.pizzas) {
                $rootScope.pizzas = [];
            }
            $scope.pizza = {};

            $rootScope.pizzas = Pizza.query();

            $scope.kinds = kinds;
            $scope.pizza.kind = kinds[0];

            $scope.submit = function () {
                var newPizza = new Pizza();

                newPizza.name = $scope.pizza.name;
                newPizza.kind = $scope.pizza.kind;
                newPizza.image = $scope.pizza.image;
                newPizza.info = $scope.pizza.info;
                newPizza.price = $scope.pizza.price;

                newPizza.$save({}, function() {
                    $scope.submited = {
                        type: 'success',
                        msg: 'Pizza added :)'
                    }

                    $rootScope.pizzas.unshift(newPizza);
                }, function() {
                    $scope.submited = {
                        type: 'danger',
                        msg: 'Pizza adding error :('
                    }
                });
            };

            $scope.remove = function (id) {
                $scope.phone = Pizza.delete({pizzaId: id}, function() {
                    for (var i in $rootScope.pizzas) {
                        if ($rootScope.pizzas[i].id === id) {
                            $rootScope.pizzas.splice(i, 1);
                        }
                    }
                }, function() {
                    $scope.submited = {
                        type: 'danger',
                        msg: 'Pizza removing error :('
                    }
                });
            };

            function resetForm() {
                $scope.pizza = {};
                $scope.pizza.kind = $scope.kinds[0];
                $scope.pizzaForm.$setPristine(true);
            }
        }
    ]);