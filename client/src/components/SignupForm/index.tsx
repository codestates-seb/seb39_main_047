import React, { useState } from 'react';
import Card from '../../components/Card';
import Button from '../../components/Button';
import * as S from './style';
import { authService } from '../../apis/';
import { useNavigate } from 'react-router-dom';

const SignupForm = () => {
  const navigate = useNavigate();

  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const submitHandler = async (event: React.FormEvent) => {
    event.preventDefault();

    const form = {
      nickname: username,
      email: email,
      password: password,
    };

    const response = await authService.SignUp(form);
    if (response?.status === 200) {
      alert('회원가입 성공');
      navigate('/login');
    } else {
      console.log(response);
    }
  };

  return (
    <Card>
      <S.Form onSubmit={submitHandler}>
        <S.Title>회원가입</S.Title>
        <S.Label htmlFor="nickname">닉네임</S.Label>
        <S.Input
          type="nickname"
          id="nickname"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        ></S.Input>
        <S.Label htmlFor="email">이메일</S.Label>
        <div>
          <S.Input
            type="email"
            id="email"
            required
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          ></S.Input>
          {/* <Button>중복확인</Button> */}
        </div>
        <S.Label htmlFor="password">비밀번호</S.Label>
        <S.Input
          type="password"
          id="password"
          required
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        ></S.Input>
        {/* <S.Label>비밀번호 확인</S.Label>
        <S.Input></S.Input> */}
        <Button type="submit" onClick={() => {}}>
          회원가입 하기
        </Button>
      </S.Form>
    </Card>
  );
};

export default SignupForm;
