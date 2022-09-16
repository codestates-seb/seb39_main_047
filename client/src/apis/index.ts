import { IBoard } from '@libs/types';
import axios from 'axios';

const apiRoot = axios.create({
  baseURL: 'http://localhost:8080',
});

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
