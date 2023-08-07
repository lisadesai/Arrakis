import React, { useState, useEffect } from "react";
import {  bondsToMature } from "../services/BondService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';
import { FilterMatchMode , FilterOperator} from 'primereact/api';
import { InputText } from 'primereact/inputtext';

export const MatureBonds = () => {
    
    const [bondsMaturing, setBondsMaturing] = useState([]);

    useEffect(() => {
      bondsToMature()
            .then(({data}) => {
            setBondsMaturing(data);
            });
    }, []);

    const [filters, setFilters] = useState({
      global: { value: null, matchMode: FilterMatchMode.CONTAINS },
      mature_date: { value: null, matchMode: FilterMatchMode.CONTAINS },
      
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
            <h3 align="center">Bonds Maturing in +/- 5 Days </h3>  
        <div className="App">
        <DataTable value={bondsMaturing}  paginator rows={5} rowsPerPageOptions={[5,10,15]} filters={filters} filterDisplay ="menu" globalFilterFields={['mature_date']} header={header} stripedRows showGridlines tableStyle={{minWidth:'50rem'}}>
          <Column field="id" sortable header="ID" style={{display: 'none'}}> </Column>
            <Column field="isin" sortable header="ISIN"> </Column>
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
    </div>
    </>
  )
};

