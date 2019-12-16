import React, { Component } from "react";
import "./App.css";
import Home from "./Components/Home";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import GroupList from "./Components/Grouplist";
import GroupEdit from "./Components/GroupEdit";
import {CookiesProvider} from 'react-cookie';

class App extends Component {
  render() {
    return (
      <CookiesProvider>
        <Router>
          <Switch>
            <Route path="/" exact={true} component={Home} />
            <Route path="/groups" exact={true} component={GroupList} />
            <Route path="/groups/:id" exact={true} component={GroupEdit} />
          </Switch>
        </Router>
      </CookiesProvider>
    );
  }
}

export default App;
