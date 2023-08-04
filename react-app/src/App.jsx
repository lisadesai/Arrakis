import React, { useEffect, useState } from "react";
import { Books} from "./components/Books";
import { Bonds} from "./components/Bonds";
import Home from './components/Home';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';
import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import NavbarCollapse from 'react-bootstrap/NavbarCollapse';
import { Route, Routes} from "react-router";
import Container from 'react-bootstrap/Container';


const App = () => {

  return (
    <>
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand href="/">Trading Application</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="/allbonds"> All Bonds</Nav.Link>
              <Nav.Link href="/allbooks">All Books</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <Routes>
        <Route path="allbonds" element={<Bonds/>} />
        <Route path="allbooks" element={<Books/>} />
        <Route path="/" element={<Bonds/>} />
      </Routes>
    </>
  );

};


export default App;

