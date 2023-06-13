import { BrowserRouter  } from "react-router-dom";
import Orders from "./Orders";
import Home from "./Home";
import NavBar from "./NavBar";
import { Routes, Route } from "react-router";

function Routess(){
    return (
        <BrowserRouter>
         <NavBar />
         <Routes>
            <Route path={"/orders"} element ={<Orders />} />
            <Route path={"/"} element={<Home />} />
          </Routes>  
        </BrowserRouter>
    );
}

export default Routess;