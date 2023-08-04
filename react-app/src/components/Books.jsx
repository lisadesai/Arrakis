import React, { useState, useEffect } from "react";
import { findBooks } from "../services/BookService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';

export const Books = () => {
    const [books, setBooks] = useState([]);

    useEffect(() => {
      findBooks()
            .then(({data}) => {
            setBooks(data);
            });
    }, []);
    //
  return (
    <>
        <div className="App">
          <DataTable value={books} showGridlines tableStyle={{minWidth:'50rem'}}>
            <Column field="id" sortable header="ID"> </Column>
            <Column field="name" sortable header="Name"> </Column>
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