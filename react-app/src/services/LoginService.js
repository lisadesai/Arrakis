import { hostNameUrl } from "../config/api";
import axios from "axios"; 

export const findUser = () => {
    const bonds = axios.get(`${hostNameUrl}/user`);
    return bonds;
  };