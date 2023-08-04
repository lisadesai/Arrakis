import React, { useState, useEffect } from "react";
import { findBooks } from "../services/BookService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import { Tag } from 'primereact/tag';

export const Books = () => {
    const [books, setBooks] = useState([]);

    useEffect(() => {
      findBooks()
            .then(({data}) => {
            setBooks(data);
            });
    }, []);
    
    const [booknum] = useState(['trading_book_1','trading_book_2','trading_book_3','trading_book_4','trading_book_6'])
  
    const getSeverity = (status) => {
      switch (status) {
          case 'trading_book_1':
              return 'danger';

          case 'trading_book_2':
              return 'success';

          case 'trading_book_3':
              return 'info';

          case 'trading_book_4':
              return 'warning';

          case 'trading_book_6':
              return 'warning';
      }
  };
  const statusBodyTemplate = (rowData) => {
    return <Tag value={rowData.status} severity={getSeverity(rowData.status)} />;
};
  
    return (
    <>
        <h3>All Books </h3>  
        <div className="App">
          <DataTable value={books}  stripedRows showGridlines tableStyle={{minWidth:'50rem'}}>
            <Column  field="id" sortable header="ID" style={{display:'none'}}> </Column>
            <Column field="name" sortable header="Name"  > </Column>
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