import React, { useEffect, useState } from "react";
import { Pets } from "./components/pets/Pets";
import Home from './components/Home';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';



const App = () => {

  return (
      <Pets/>     
  );

};

export default App;
