import React from "react";
import "./newlist.scss";

class NewList extends React.Component {
  render() {
    return (
      <form className="form_style">
        <div className="container">
          <div className="row">
            <div className="col">
              <div className="form-row">
                <div className="col-md-4 mb-3">
                  <label htmlFor="validationDefault01">Name</label>
                  <input
                    type="text"
                    className="form-control"
                    id="validationDefault01"
                    placeholder="First name"
                    value="add shopping list name"
                    required
                  />
                </div>
              </div>
              <div className="form-row">
                <div className="col-md-4 mb-3">
                  <label htmlFor="inlineFormCustomSelect">Search</label>
                  <select
                    className="custom-select mr-sm-2"
                    id="inlineFormCustomSelect"
                  >
                    <option selected>Choose...</option>
                    <option value="1">Food</option>
                    <option value="2">Drink</option>
                    <option value="3">Clothes</option>
                  </select>
                </div>
                <div className="col-md-4 mb-3">
                  <label htmlFor="validationDefault03">Add elements</label>
                  <input
                    type="text"
                    className="form-control"
                    id="validationDefault03"
                    placeholder="name"
                    required
                  />
                </div>
              </div>
              <button className="btn btn-primary" type="submit">
                Create list
              </button>
            </div>

            <div className="row">
              <ul className="list-group">
                <li className="list-group-item active">Shopping list name</li>
                <li className="list-group-item">element</li>
                <li className="list-group-item">element</li>
                <li className="list-group-item">element</li>
                <li className="list-group-item">element</li>
                <li className="list-group-item">element</li>
                <li className="list-group-item">element</li>
              </ul>
            </div>
          </div>
        </div>
      </form>
    );
  }
}

export default NewList;
