import { hostNameUrl } from "../config/api";
import axios from "axios"; 


export const findTrades = () => {
  const trades = axios.get(`http://localhost:8080/api/v4/trades`);
  return trades;
};


// export const findTradesByBook = (bookID) => {
//   const trades = axios.get(`${hostNameUrl}/tradeByBookID/${bookID}`);
//   return trades;
// };