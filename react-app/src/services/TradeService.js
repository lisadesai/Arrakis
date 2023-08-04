import { hostNameUrl } from "../config/api";
import axios from "axios"; 


export const findTrades = () => {
  const trades = axios.get(`${hostNameUrl}/trades`);
  return trades;
};