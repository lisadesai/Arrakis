import React, { useState, useEffect } from "react";
import { findTrades } from "../services/TradeService";
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import 'primereact/resources/themes/lara-light-purple/theme.css';
import 'primereact/resources/primereact.min.css';

export const Trades = () => {
    const [trades, setTrades] = useState([]);

    useEffect(() => {
        findTrades()
            .then(({ data }) => {
                setTrades(data);
            });
    }, []);
    //
    return (
        <>
            <h3 align="center">All Trades </h3>  
            <div className="App">
                <DataTable value={trades} showGridlines tableStyle={{ minWidth: '50rem' }}>
                    <Column field="trade_id" sortable header="Trade ID" style={{display: 'none'}}> </Column>
                    <Column field="book_id" sortable header="Book ID" > </Column>
                    <Column field="security_id" sortable header="Security ID" > </Column>
                    <Column field="cp_id" sortable header="CP ID" > </Column>
                    <Column field="currency" sortable header="Currency"> </Column>
                    <Column field="t_status" sortable header="Status"> </Column>
                    <Column field="quantity" sortable header="Quantity" > </Column>
                    <Column field="unit_price" sortable header="Unit Price" > </Column>
                    <Column field="buy_sell" sortable header="Buy/Sell" > </Column>
                    <Column field="trade_date" sortable header="Trade Date" > </Column>
                    <Column field="settle_date" sortable header="Settlement Date" > </Column>
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