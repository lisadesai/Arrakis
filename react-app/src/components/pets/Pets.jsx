import React, { useState, useEffect } from "react";
import { findPets } from "../../services/PetServices";
import styles from "./Pets.module.css";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';

export const Pets = () => {
    const [pets, setPets] = useState([]);

    useEffect(() => {
      findPets()
            .then(({data}) => {
            setPets(data);
            });
    }, []);
    //
  return (
    <>
        <div className="App">
          <DataTable value={pets} showGridlines tableStyle={{minWidth:'50rem'}}>
            <Column field="id" sortable header="ID"> </Column>
            <Column field="name" sortable header="Name"> </Column>
            <Column field="age" sortable header="Age" > </Column>
          </DataTable>
        </div>
        
    </>
  )
};

/* <>
{ pets.map(pet => 
<div className={styles.pets}>
    <div>ID: {pet.id}</div>
    <div>Name: {pet.name} </div>
    <div>Age: {pet.age}</div>
</div>) 
}
</> */