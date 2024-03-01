import {Routes, Route} from "react-router-dom"
import './App.css';
import Prueba1 from "./componets/Prueba1";
import Prueba2 from "./componets/Prueba2";
import Prueba3 from "./componets/Prueba3";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="prueba1" element={Prueba1}/>
        <Route path="prueba2" element={Prueba2}/>
        <Route path="prueba3" element={Prueba3}/>
      </Routes>
    </div>
  );
}

export default App;
