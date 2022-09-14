import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Main } from '@pages/index';
import Login from '@pages/Login';
import Signup from '@pages/Signup';

export default function Router() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Main />} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
      </Routes>
    </BrowserRouter>
  );
}
