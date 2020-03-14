import axios from "axios";

export function getUserToken() {
  return localStorage.getItem("accessToken");
}

export const axiosInstance = axios.create({
  baseURL: "http://localhost:5003/hello",
  timeout: 10000
});
