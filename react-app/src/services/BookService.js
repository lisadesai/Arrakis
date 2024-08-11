import { hostNameUrl } from "../config/api";
import axios from "axios"; 


export const findBooks = () => {
  const books = axios.get(`${hostNameUrl}/books`);
  return books;
};