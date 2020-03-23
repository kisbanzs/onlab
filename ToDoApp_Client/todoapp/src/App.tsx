import React, { useEffect, useState } from "react";
import "./App.scss";
import axios from "axios";
import User from "./models/User";
//import Header from "./header/Header";

function App() {
  const [users, setUsers] = useState<User[]>([]);

  const backendHivas = () => {
    axios.get("http://localhost:5003/api/users").then(function (response) {
      setUsers(response.data);
    });
  };

  useEffect(() => {
    backendHivas();
  }, []);

  return (
    <div>
      {users.map(user => <div>{user.name}</div>)}
    </div>
  );
}

export default App;
