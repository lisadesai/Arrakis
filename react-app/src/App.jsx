import React, { useEffect, useState } from "react";
import { Books} from "./components/Books";
import { Bonds} from "./components/Bonds";
import { Trades} from "./components/Trades";
import UserForm from "./components/UserForm";
import Home from './components/Home';
import Login from './components/Login';

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
import { MatureBonds } from "./components/MatureBonds";

const App = () => {

  return (
    <>
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
           <img src={db2} height='50px'/>
          <Navbar.Brand href="/">FIC Trading Application</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="/allbonds">All Bonds</Nav.Link>
              <Nav.Link href="/allbooks">All Books</Nav.Link>
              <Nav.Link href="/alltrades">All Trades</Nav.Link>
              <Nav.Link href="/maturebonds">View Maturity</Nav.Link>
              <Nav.Link href="/adduser">Sign Up</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <Routes>
        <Route path="allbonds" element={<Bonds/>} />
        <Route path="maturebonds" element={<MatureBonds/>} />
        <Route path="allbooks" element={<Books/>} />
        <Route path="alltrades" element={<Trades/>} />
        <Route path="adduser" element={<UserForm/>} />
        <Route path="/home" element={<Home/>} />
        <Route path="/" element={<Login/>} />
      </Routes>
    </>
  );

};


export default App;

