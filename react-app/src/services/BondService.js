import { hostNameUrl } from "../config/api";
import axios from "axios"; 


export const findBonds = () => {
  const bonds = axios.get(`${hostNameUrl}/securities`);
  return bonds;
};

//function that finds all bonds about to mature in NEXT or LAST five days
//todo: pass a parameter of date/string to search database on
export const bondsToMature = (date) => {
    const bondsMaturing = axios.get(`${hostNameUrl}/securitiesByDate/${date}`);
    return bondsMaturing;
  };
    