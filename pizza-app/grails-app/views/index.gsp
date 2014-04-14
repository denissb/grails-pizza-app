<!doctype html>
<html lang="en" ng-app="pizzaApp">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Demo App</title>
  <r:require modules="app"/>
  <r:layoutResources />
</head>
<body>
  <div class="container">
      <h1>Pizza App</h1>
      <ul class="nav nav-tabs">
          <li ng-class="{active: activeTab == 'pizzas'}"><a href="#/pizzas">Pizzas</a></li>
          <li ng-class="{active: activeTab == 'add-pizza'}"><a href="#/add-pizza">Add pizza</a></li>
      </ul>

      <div ng-view></div>

      <div>
          <span app-version></span>
      </div>
  </div>
  <r:layoutResources />
</body>
</html>
