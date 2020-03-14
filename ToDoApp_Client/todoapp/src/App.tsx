import React, { useEffect } from "react";
import "./App.scss";
import axios from "axios";
//import Header from "./header/Header";

function App() {
  const backendHivas = () => {
    axios.get("http://localhost:5003/hello").then(function(response) {
      // handle success
      console.log(response);
    });
  };

  useEffect(() => {
    backendHivas();
  }, []);

  return (
    <div>
      <p>hahahah</p>
    </div>
  );
}

export default App;
