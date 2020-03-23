import React from "react";
import ReactDOM from "react-dom";
import "./index.scss";
import App from "./App";
//import StoreContextProvider from "./store";
import * as serviceWorker from "./serviceWorker";
import Header from "./header/Header";
//import "bootstrap/dist/css/bootstrap.css";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import NewList from "./list/newlist/NewList";
import CurrentList from "./list/currentlists/CurrentList";
import Todo from "./todo/Todo";

ReactDOM.render(
  <div>
    <Router>
      <Header />

      <Switch>
        <Route exact path="/">
          <App />
        </Route>
        <Route path="/currentlists">
          <CurrentList />
        </Route>
        <Route path="/newlist">
          <NewList />
        </Route>
        <Route path="/todo">
          <Todo />
        </Route>
      </Switch>
    </Router>{" "}
  </div>,

  document.getElementById("root")
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
