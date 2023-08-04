import React, { useState, useEffect } from "react";
import { findBooks } from "../services/BookService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import { FilterMatchMode , FilterOperator} from 'primereact/api';
import { InputText } from 'primereact/inputtext';



export const Books = () => {
    const [books, setBooks] = useState([]);

    useEffect(() => {
      findBooks()
            .then(({data}) => {
            setBooks(data);
            });
    }, []);
    
    const [filters, setFilters] = useState({
      global: { value: null, matchMode: FilterMatchMode.CONTAINS },
      name: { value: null, matchMode: FilterMatchMode.CONTAINS }
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
        <h3 align="center">All Books </h3>  
        <div className="App">
          <DataTable value={books} filters={filters} filterDisplay ="menu" globalFilterFields={['name']} header={header} stripedRows showGridlines tableStyle={{minWidth:'50rem'}}>
            <Column  field="id" sortable header="ID" style={{display:'none'}}> </Column>
            <Column field="name" sortable header="Name" filter > </Column>
          </DataTable>
        </div>
        
    </>
  )
};

// const [booknum] = useState(['trading_book_1','trading_book_2','trading_book_3','trading_book_4','trading_book_6'])
  
// const getSeverity = (status) => {
//   switch (status) {
//       case 'trading_book_1':
//           return 'danger';

//       case 'trading_book_2':
//           return 'success';

//       case 'trading_book_3':
//           return 'info';

//       case 'trading_book_4':
//           return 'warning';

//       case 'trading_book_6':
//           return 'warning';
//   }
// };
// const statusBodyTemplate = (rowData) => {
// return <Tag value={rowData.status} severity={getSeverity(rowData.status)} />;
// };






// import React from 'react'

// const Book = () => {
//   return (
//     <div>Book</div>
//   )
// }

// export default Book