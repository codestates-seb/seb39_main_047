import React, { useState } from 'react';
import Button from '@components/Button';
import Card from '@components/Card';
import axios from 'axios';
import * as S from './style';

const LoginForm = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const submitHandler = async (event: React.FormEvent) => {
    event.preventDefault();
    const response = await axios({
      url: '/login',
      method: 'post',
      data: {
        email: email,
        password: password,
      },
    })
      .then((response) => {
        console.log(response);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  return (
    <Card>
      <S.Form onSubmit={submitHandler}>
        <S.Title>로그인</S.Title>
        <S.Label htmlFor="email">Email</S.Label>
        <S.Input
          type="email"
          id="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        ></S.Input>
        <S.Label htmlFor="password">Password</S.Label>
        <S.Input
          type="password"
          id="password"
          required
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        ></S.Input>
        <Button type="submit" onClick={() => {}}>
          로그인 하기
        </Button>
      </S.Form>
    </Card>
  );
};

export default LoginForm;
