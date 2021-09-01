import React, { Component } from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import Welcome from './components/views/ProjectView';
import Secured from './Secured';
import ProfileView from "./components/views/ProfileView";
import './App.css';

class App extends Component {


  render() {
    return (
        <BrowserRouter>
          <div className="container">
            <ul>
              <li><Link to="/">public component</Link></li>
              <li><Link to="/secured">secured component</Link></li>

                <li><Link to="/profile">Profile</Link></li>
            </ul>
            <Route exact path="/" component={Welcome} />
            <Route path="/secured" component={Secured} />
              <Route path="/profile" component={ProfileView} />
          </div>
        </BrowserRouter>
    );
  }
}
export default App;