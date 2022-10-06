import React, { useState } from 'react';
import Button from '../../components/Button';
import Card from '../../components/Card';
import * as S from './style';
import { useNavigate } from 'react-router-dom';
import { authService } from '../../apis';

const LoginForm = () => {
  const navigate = useNavigate();

  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const submitHandler = async (event: React.FormEvent) => {
    event.preventDefault();

    const form = {
      email,
      password,
    };

    const response = await authService.Login(form);
    if (response?.status === 200) {
      alert('로그인 성공');
      navigate('/');
    }
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
