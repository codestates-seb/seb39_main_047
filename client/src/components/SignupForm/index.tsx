import React, { useRef, useState } from 'react';
import Card from '../../components/Card';
import Button from '../../components/Button';
import * as S from './style';
import { authService } from '../../apis/';
import { useNavigate } from 'react-router-dom';

const isEmpty = (value: string) => value.trim() === '';
const isSixChars = (value: string) => value.trim().length >= 6;

const SignupForm = () => {
  const navigate = useNavigate();

  //유효성 검사
  const [formInputsValidity, setFormInputsValidity] = useState({
    nickname: true,
    email: true,
    password: true,
  });

  const nicknameInputRef = useRef<HTMLInputElement>(null);
  const emailInputRef = useRef<HTMLInputElement>(null);
  const passwordInputRef = useRef<HTMLInputElement>(null);

  const submitHandler = async (event: React.FormEvent) => {
    event.preventDefault();

    const enteredNickname = nicknameInputRef.current!.value;
    const enteredEmail = emailInputRef.current!.value;
    const enteredPassword = emailInputRef.current!.value;

    const enteredNicknameIsValid = !isEmpty(enteredNickname);
    const enteredEmailIsValid = !isEmpty(enteredEmail);
    const enteredPasswordIsValid =
      !isEmpty(enteredPassword) && !isSixChars(enteredPassword);

    setFormInputsValidity({
      nickname: enteredNicknameIsValid,
      email: enteredEmailIsValid,
      password: enteredPasswordIsValid,
    });

    const formIsValid =
      enteredNicknameIsValid && enteredEmailIsValid && enteredPasswordIsValid;

    if (!formIsValid) {
      alert(
        '제출 형식이 올바르지 않습니다 (모든 정보 필수 기입 & 비밀번호 6자리 이상)'
      );
    } else {
      const form = {
        nickname: enteredNickname,
        email: enteredEmail,
        password: enteredPassword,
      };

      const response = await authService.SignUp(form);
      if (response?.status === 200) {
        alert('회원가입 성공');
        navigate('/login');
      }
    }
  };

  return (
    <Card>
      <S.Form onSubmit={submitHandler}>
        <S.Title>회원가입</S.Title>
        <S.Label htmlFor="nickname">닉네임</S.Label>
        {!formInputsValidity.nickname && <p>닉네임을 입력해주세요</p>}
        <S.Input type="nickname" id="nickname" ref={nicknameInputRef}></S.Input>
        <S.Label htmlFor="email">이메일</S.Label>{' '}
        {!formInputsValidity.email && <p>이메일을 입력해주세요</p>}
        <S.Input type="email" id="email" required ref={emailInputRef}></S.Input>
        <S.Label htmlFor="password">비밀번호</S.Label>{' '}
        {!formInputsValidity.password && (
          <p>비밀번호를 6자 이상 입력해주세요</p>
        )}
        <S.Input
          type="password"
          id="password"
          required
          ref={passwordInputRef}
        ></S.Input>
        <Button type="submit" onClick={() => {}}>
          회원가입 하기
        </Button>
      </S.Form>
    </Card>
  );
};

export default SignupForm;
