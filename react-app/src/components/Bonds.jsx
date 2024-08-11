import React, { useState, useEffect } from "react";
import { findBonds, findExpiredBonds } from "../services/BondService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';
import { FilterMatchMode , FilterOperator} from 'primereact/api';
import { InputText } from 'primereact/inputtext';

export const Bonds = () => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
      findBonds()
            .then(({data}) => {
            setBonds(data);
            });
    }, []);

    // const [expiredBonds, setExpiredBonds] = useState([]);

    // useEffect(() => {
    //   findExpiredBonds()
    //         .then(({data}) => {
    //         setBonds(data);
    //         });
    // }, []);
    
 
    const [filters, setFilters] = useState({
      global: { value: null, matchMode: FilterMatchMode.CONTAINS },
      isin: { value: null, matchMode: FilterMatchMode.CONTAINS },
      cusip: { value: null, matchMode: FilterMatchMode.CONTAINS },
      issuer_name: { value: null, matchMode: FilterMatchMode.CONTAINS },
      mature_date: { value: null, matchMode: FilterMatchMode.CONTAINS },
      coupone_rate: { value: null, matchMode: FilterMatchMode.CONTAINS },
      bond_type: { value: null, matchMode: FilterMatchMode.CONTAINS },
      face_value: { value: null, matchMode: FilterMatchMode.CONTAINS },
      bond_currency: { value: null, matchMode: FilterMatchMode.CONTAINS },
      status: { value: null, matchMode: FilterMatchMode.CONTAINS }

  });
    const [globalFilterValue, setGlobalFilterValue] = useState('');
    const onGlobalFilterChange = (e) => {
      const value = e.target.value;
      let _filters = { ...filters };

      _filters['global'].value = value;

      setFilters(_filters);
      setGlobalFilterValue(value);
  };

  const renderHeader = () => {
    return (
        <div className="flex justify-content-end">
            <span className="p-input-icon-left">
                <i className="pi pi-search" />
                <InputText value={globalFilterValue} onChange={onGlobalFilterChange} placeholder="Keyword Search" />
            </span>
        </div>
    );
};
const header = renderHeader();

  return (
    <>
    <div>
    <h3 align="center">All Bonds </h3>  
        <div className="App">
          <DataTable value={bonds} paginator rows={5} rowsPerPageOptions={[5,10,15]} filters={filters} filterDisplay ="menu" globalFilterFields={['isin', 'cusip', 'issuer_name', 'coupon_rate', 'face_value', 'mature_date', 'bond_type', 'bond_currency', 'status']} header={header}  stripedRows showGridlines tableStyle={{minWidth:'50rem'}}>
          <Column field="id" sortable header="ID" style={{display: 'none'}}> </Column>
            <Column field="isin" sortable header="ISIN" > </Column>
            <Column field="cusip" sortable header="CUSIP"> </Column>
            <Column field="issuer_name" sortable header="Issuer"> </Column>
            <Column field="mature_date" sortable header="Maturity Date"> </Column>
            <Column field="coupon_rate" sortable header="Coupon"> </Column>
            <Column field="bond_type" sortable header="Type"> </Column>
            <Column field="face_value" sortable header="Face Value"> </Column>
            <Column field="bond_currency" sortable header="Bond Currency"> </Column>
            <Column field="status" sortable header="Status"> </Column>
          </DataTable>
        </div>
            /* <p>.</p>
            <p>.</p> */
             <h3 align="center">Expired</h3>   
        {/* <div className="App">
        <DataTable value={expiredBonds} stripedRows showGridlines tableStyle={{minWidth:'50rem'}}>
          <Column field="id" sortable header="ID" style={{display: 'none'}}> </Column>
            <Column field="isin" sortable header="ISIN"> </Column>
            <Column field="cusip" sortable header="CUSIP"> </Column>
          </DataTable>
        </div> */}
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