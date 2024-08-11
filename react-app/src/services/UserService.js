import http from 'axios';
import { hostNameUrl } from "../config/api";
import axios from "axios";

// export function getAllUsers(){
//     return http.get("/heroes");
// }

export function saveUser(user){
    return http.post(`${hostNameUrl}/users`, user);
};


// export function saveUsers(user) {
//   axios.post(`${hostNameUrl}/users`, user);
// };
