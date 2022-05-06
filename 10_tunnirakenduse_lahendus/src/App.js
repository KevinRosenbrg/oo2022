import { Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './components/Navbar';
import Home from './pages/Home';
import Builds from './pages/Builds';
import BuildMaker from './pages/BuildMaker';
import AddItems from './pages/AddItems';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Routes>
        <Route path="" element={ <Home /> } />
        <Route path="buildmaker" element={ <BuildMaker /> } />
        <Route path="builds" element={ <Builds /> } />
        <Route path="additems" element={ <AddItems /> } />
      </Routes>
    </div>
  );
}

export default App;
