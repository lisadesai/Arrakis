import React, { useState, useEffect } from "react";
import { findBonds } from "../services/BondService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';

export const Bonds = () => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
      findBonds()
            .then(({data}) => {
            setBonds(data);
            });
    }, []);
    //
  return (
    <>
        <div className="App">
          <DataTable value={bonds} showGridlines tableStyle={{minWidth:'50rem'}}>
          <Column field="id" sortable header="ID"> </Column>
            <Column field="isin" sortable header="ISIN"> </Column>
            <Column field="issuer_name" sortable header="Issuer"> </Column>
            <Column field="mature_date" sortable header="Coupon Rate"> </Column>
            <Column field="coupon_rate" sortable header="ISIN"> </Column>
            <Column field="bond_type" sortable header="Type"> </Column>
            <Column field="face_value" sortable header="Face Value"> </Column>
            <Column field="bond_currency" sortable header="Bond Currency"> </Column>
            <Column field="status" sortable header="Status"> </Column>
          </DataTable>
        </div>
        
    </>
  )
};







// import React from 'react'

// const Book = () => {
//   return (
//     <div>Book</div>
//   )
// }

// export default Book