import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';
import Records from './pages/Records';

const Routes = () => {
    <BrowserRouter>
        <Header />
        <Switch>
        </Switch>
            <Route path="/">
                <Home />
            </Route>
            <Route path="/records">
                <Records />
            </Route>
    </BrowserRouter>
};

export default Routes;