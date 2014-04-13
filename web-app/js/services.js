'use strict';

/* Services */

// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('pizzaApp.services', ['ngResource'])
    .value('version', '0.1')
    .value('kinds', [
        "",
        "ham",
        "beef",
        "chicken",
        "vegetarian",
        "other"
    ])
    .factory('Pizza', ['$resource',
        function($resource){
            return $resource('pizza/:pizzaId', {}, {
                query: {method:'GET', params: {}, isArray:true}
            });
    }])
    .factory('Cart', function () {
        return {
            create: function (items, total) {
                return {
                    items: items,
                    total: total
                }
            },
            init: function () {
                return {
                    items: [],
                    total: 0
                }
            }
        }
    })
    .factory('OrderItem', function () {
        return {
            create: function (id, name, price, qty) {
                return {
                    id: id,
                    name: name,
                    price: price,
                    qty: (qty ? qty : 1)
                }
            }
        }
    });