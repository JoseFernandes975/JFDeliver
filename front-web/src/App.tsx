import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './App.css';
import Routess from './Routes';

function App() {
  return (
    <>
      <Routess />
      <ToastContainer />
      </>
  );
}

export default App;
