import React, { useContext } from "react";
import { NavLink } from "react-router-dom";
import "./header.scss";

//import "bootstrap/dist/js/bootstrap.min.js";
import "bootstrap/dist/css/bootstrap.min.css";

export default function Header() {
  //const [user, setUser] = useContext(StoreContext).user;

  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light fixed-top">
      <NavLink className="navbar-brand active" to="/ ">
        {" "}
        Shopping List{" "}
      </NavLink>
      <button
        className="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNav">
        <ul className="navbar-nav">
          <NavLink className="nav-item nav-link" to="/currentlists">
            {" "}
            Current Lists{" "}
          </NavLink>
          <NavLink className="nav-item nav-link" to="/newlist">
            {" "}
            New List{" "}
          </NavLink>
          <NavLink className="nav-item nav-link" to="/todo">
            {" "}
            Todo{" "}
          </NavLink>
        </ul>
      </div>
    </nav>
  );
}
