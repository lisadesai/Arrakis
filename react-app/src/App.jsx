import React, { useEffect, useState } from "react";
import { Books} from "./components/Books";
import { Bonds} from "./components/Bonds";
import { Trades} from "./components/Trades";

import Home from './components/Home';

import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';
import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import NavbarCollapse from 'react-bootstrap/esm/NavbarCollapse';
import { Route, Routes} from "react-router";
import Container from 'react-bootstrap/Container';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css'
import db2 from './images/db2.jpg'

const App = () => {

  return (
    <>
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
           <img src={db2} height='50px'/>
          <Navbar.Brand href="/home">FIC Trading Application</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="/allbonds">All Bonds</Nav.Link>
              <Nav.Link href="/allbooks">All Books</Nav.Link>
              <Nav.Link href="/alltrades">All Trades</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <Routes>
        <Route path="allbonds" element={<Bonds/>} />
        <Route path="allbooks" element={<Books/>} />
        <Route path="alltrades" element={<Trades/>} />
        <Route path="/home" element={<Home/>} />
      </Routes>
    </>
  );

};


export default App;

