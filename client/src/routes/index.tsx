import { BrowserRouter, Route, Routes } from 'react-router-dom';
import {
  Home,
  Login,
  Signup,
  MyPage,
  BoardWrite,
  BoardDetail,
} from '@pages/index';

export default function Router() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/:id" element={<BoardDetail />} />
        <Route path="/write" element={<BoardWrite />} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/mypage" element={<MyPage />} />
      </Routes>
    </BrowserRouter>
  );
}
