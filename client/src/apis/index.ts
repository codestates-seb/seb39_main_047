import { IBoard, ISignUp, ILogin } from '../libs/types';
import axios from 'axios';
import { setCookie } from '../util/cookie';
import jwt_decode from 'jwt-decode';

const apiRoot = axios.create({
  baseURL: 'http://121.165.202.61:80',
});

export const SignUp = async (SignUpForm: ISignUp) => {
  console.log('Form', SignUpForm);
  try {
    const response = await axios.post('/join', SignUpForm, {
      withCredentials: true,
    });
    return response;
  } catch {
    throw new Error('회원가입이 실패했습니다');
  }
};

export const Login = async (LoginForm: ILogin) => {
  try {
    const response = await axios.post('/login', LoginForm, {
      withCredentials: true,
    });
    const jwtToken = response.data;
    setCookie('accessJwtToken', jwtToken); // 쿠키에 토큰 저장
    const decodedUserInfo = jwt_decode(jwtToken); // 토큰 decode
    localStorage.setItem('user', JSON.stringify(decodedUserInfo)); //토큰에 저장되어있는 userInfo 저장
    return response;
  } catch {
    throw new Error('로그인이 실패했습니다');
  }
};

export const authService = {
  SignUp,
  Login,
};

export const getFreeBoards = async () => {
  try {
    const response = await axios.get('/v1/boards');
    return response.data;
  } catch (err) {
    throw new Error();
  }
};

export const postFreeBoard = async (form: IBoard) => {
  try {
    return await axios.post('/v1/boards/create', form);
  } catch (err) {
    throw new Error();
  }
};

export const getFreeBoard = async (id: number) => {
  try {
    const response = await axios.get(`/v1/boards/${id}`);
    return response.data;
  } catch (err) {
    throw new Error();
  }
};

export const removeFreeBoard = async (id: number) => {
  try {
    return await axios.delete(`/v1/boards/${id}`);
  } catch (err) {
    throw new Error();
  }
};
